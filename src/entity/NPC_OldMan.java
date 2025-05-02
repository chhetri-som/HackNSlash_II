package entity;

import java.util.Random;

import main.GamePanel;

public class NPC_OldMan extends Entity{
	
	public NPC_OldMan(GamePanel gp) {
		super(gp);
		
		direction = "down";
		speed = 1;
		
		getImage();
		setDialogue();
	}
	public void getImage() {
		
		up1 = setup("/npc/oldman_up_1", gp.tileSize, gp.tileSize);
		up2 = setup("/npc/oldman_up_2", gp.tileSize, gp.tileSize);
		down1 = setup("/npc/oldman_down_1", gp.tileSize, gp.tileSize);
		down2= setup("/npc/oldman_down_2", gp.tileSize, gp.tileSize);
		left1= setup("/npc/oldman_left_1", gp.tileSize, gp.tileSize);
		left2= setup("/npc/oldman_left_2", gp.tileSize, gp.tileSize);
		right1= setup("/npc/oldman_right_1", gp.tileSize, gp.tileSize);
		right2= setup("/npc/oldman_right_2", gp.tileSize, gp.tileSize);
		
	}
	
	public void setDialogue() {
		dialogues[0] = "Hmmm..... Welcome Wanderer!! to Hack&Slash. \nWell to be honest, there's not much to do here.";
		dialogues[1] = "Just look around and grab whatever you can find, \nKill some fellow slimes for they are wretched, \nCut some withered trees to unlock new paths.";
		dialogues[2] = "You can always come to this lake here to heal, \nthe water here is blessed and shall heal all \nyour wounds";
		dialogues[3] = "Let me know how you get along, although I may \nnot remember you when we cross paths. \nYou see my memory fails me, I'm getting too old";
	}
	
	public void setAction() {
		
		actionLockCounter++;
		
		if(actionLockCounter == 120) {
			Random random = new Random();
			int i = random.nextInt(100) + 1;
			
			if(i <= 25) {
				direction = "up";
			}
			if(i > 25 && i <= 50) {
				direction = "down";
			}
			if(i > 50 && i <= 75) {
				direction = "left";
			}
			if(i > 75 && i <= 100) {
				direction = "right";
			}
			
			actionLockCounter = 0;
		}
	}
	
	public void speak() {
		
		super.speak();
	}
}
