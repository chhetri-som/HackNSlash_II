package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Axe extends Entity{
	public OBJ_Axe(GamePanel gp) {
		super(gp);
		
		type = type_axe;
		name = "Wooden Axe";
		down1 = setup("/objects/axe", gp.tileSize, gp.tileSize);
		attackArea.width = 30;
		attackArea.height  = 30;
		attackValue = 2;
		description = "[" + name + "] \nhelps you chop wood, \nironically made of wood";
	}
}
