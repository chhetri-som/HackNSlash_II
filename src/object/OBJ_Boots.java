package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Boots extends Entity {
	
	GamePanel gp;
	
	public OBJ_Boots(GamePanel gp) {
		
		super(gp);
		this.gp = gp;
		
		type = type_boots;
		name = "Boots";
		
		speed = 6;
		
		down1 = setup("/objects/boots", gp.tileSize, gp.tileSize);
	}
}
