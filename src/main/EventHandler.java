package main;

public class EventHandler {
	
	GamePanel gp;
	EventRect eventRect[][];
	
	int previousEventX, previousEventY;
	boolean canTouchEvent = true;
	
	public EventHandler(GamePanel gp) {
		this.gp = gp;
		
		eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];
		
		int col = 0; 
		int row = 0;
		while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
			
			eventRect[col][row] = new EventRect();
			eventRect[col][row].x = 23;
			eventRect[col][row].y = 23;
			eventRect[col][row].width = 48;
			eventRect[col][row].height = 48;
			eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
			eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;
		
			col++;
			if(col == gp.maxWorldCol) {
				col = 0;
				row++;
			}
		}
	}
	
	public void checkEvent() {
		
		int xDistance = Math.abs(gp.player.worldX - previousEventX);
		int yDistance = Math.abs(gp.player.worldY - previousEventY);
		int distance = Math.max(xDistance, yDistance);
		if(distance > gp.tileSize) {
			canTouchEvent = true;
		}
		
		if(canTouchEvent == true) {
			
			// healing pool top-right lake
			if(hit(43, 9, "down") == true) { healingPool(43, 9, gp.dialogueState);}
			if(hit(44, 9, "down") == true) { healingPool(44, 9, gp.dialogueState);}
			if(hit(45, 9, "down") == true) { healingPool(45, 9, gp.dialogueState);}
			
			//dirt pit
			if(hit(35, 35, "any") == true) { damagePit(35, 35, gp.dialogueState);}
			if(hit(33, 50, "any") == true) { damagePit(33, 50, gp.dialogueState);}
			if(hit(5, 44, "any") == true) { damagePit(5, 44, gp.dialogueState);}
			
			//teleport bottom right delta gap
			if(hit(57, 46, "down") == true) {teleport(57, 53);}
			if(hit(57, 53, "up") == true) {teleport(57, 46);}
		}

	}
	
	public boolean hit (int col, int row, String reqDirection) {
		boolean hit = false;
		gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
		gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;
		eventRect[col][row].x = col * gp.tileSize + eventRect[col][row].x;
		eventRect[col][row].y = row * gp.tileSize + eventRect[col][row].y;
		
		if(gp.player.solidArea.intersects(eventRect[col][row]) && eventRect[col][row].eventDone == false) {
			if(gp.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any")) {
				hit = true;
				
				previousEventX = gp.player.worldX;
				previousEventY = gp.player.worldY;
			}
		}
		
		gp.player.solidArea.x = gp.player.solidAreaDefaultX;
		gp.player.solidArea.y = gp.player.solidAreaDefaultY;
		eventRect[col][row].x = eventRect[col][row].eventRectDefaultX;
		eventRect[col][row].y = eventRect[col][row].eventRectDefaultY;
		
		return hit;
	}
	
	public void teleport(int col, int row) {
		String text = "woahh!! teleportation baby";
		gp.ui.addMessage(text);
		
		//post teleport location 
		gp.player.worldX = gp.tileSize * col; 
		gp.player.worldY = gp.tileSize * row;
	}
	
	public void damagePit(int col, int row, int gameState) {
		gp.gameState = gameState;
		gp.playSE(6);
		gp.ui.currentDialogue = "shiiiiiiiiii \ngot some dirt on me";
		gp.player.life -= 1;
		eventRect[col][row].eventDone = true;
		canTouchEvent = false;
	}
	
	public void healingPool(int col, int row, int gameState) {
		if(gp.keyH.enterPressed == true) {
			gp.gameState = gameState;
			gp.player.attackCancelled = true;
			gp.playSE(2);
			gp.ui.currentDialogue = "hmmm, this shii gas yoo. \nanother one"; 
			gp.player.life = gp.player.maxLife;
			gp.player.mana = gp.player.maxMana;
			gp.aSetter.setMonster(); //re-spawn monsters
		}
	}
	
}
