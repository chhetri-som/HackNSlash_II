package entity;

import java.util.Random;

import main.GamePanel;

public class NPC_OldMan2 extends Entity{
	
	public NPC_OldMan2(GamePanel gp) {
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
		dialogues[0] = "ayoooo wassup homie, lemme holla at yo real \nquick, have you met my evil twin?? \nlooks just like me fo real";
		dialogues[1] = "yeah well we related and shii but i aint like him \ncuh, i got motion yoo AND i got hella bands fr";
		dialogues[2] = "anyways i just wanted to let yo ass know that \nyou can teleport dawg!!! however, ill be \ngatekeeping the spot. Find that shii homie";
		dialogues[3] = "anyways my dawg i gotta bounce, ayo one more \nthing me and my bro got this problem, well.... \nwe just be forgetting shii for no reason yo";
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
