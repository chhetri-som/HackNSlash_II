package main;

import object.OBJ_Boots;
import entity.NPC_OldMan;
import entity.NPC_OldMan2;
import monster.MON_GreenSlime;
import object.OBJ_Axe;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import tile_interactive.IT_DryTree;

public class AssetSetter {
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		int i = 0;
		gp.obj[i] = new OBJ_Boots(gp);
		gp.obj[i].worldX = gp.tileSize * 15;
		gp.obj[i].worldY = gp.tileSize * 40;
		
		i++;
		gp.obj[i] = new OBJ_Shield_Blue(gp);
		gp.obj[i].worldX = gp.tileSize * 5;
		gp.obj[i].worldY = gp.tileSize * 5;
		
		i++;
		gp.obj[i] = new OBJ_Potion_Red(gp);
		gp.obj[i].worldX = gp.tileSize * 22;
		gp.obj[i].worldY = gp.tileSize * 5;
		
		i++;
		gp.obj[i] = new OBJ_Coin_Bronze(gp);
		gp.obj[i].worldX = gp.tileSize * 6;
		gp.obj[i].worldY = gp.tileSize * 4;
		
		i++;
		gp.obj[i] = new OBJ_Coin_Bronze(gp);
		gp.obj[i].worldX = gp.tileSize * 6;
		gp.obj[i].worldY = gp.tileSize * 5;
		
		i++;
		gp.obj[i] = new OBJ_Coin_Bronze(gp);
		gp.obj[i].worldX = gp.tileSize * 32;
		gp.obj[i].worldY = gp.tileSize * 4;
		
		i++;
		gp.obj[i] = new OBJ_Coin_Bronze(gp);
		gp.obj[i].worldX = gp.tileSize * 33;
		gp.obj[i].worldY = gp.tileSize * 4;
		
		i++;
		gp.obj[i] = new OBJ_Coin_Bronze(gp);
		gp.obj[i].worldX = gp.tileSize * 34;
		gp.obj[i].worldY = gp.tileSize * 4;
		
		i++;
		gp.obj[i] = new OBJ_ManaCrystal(gp);
		gp.obj[i].worldX = gp.tileSize * 28;
		gp.obj[i].worldY = gp.tileSize * 8;
		
		i++;
		gp.obj[i] = new OBJ_Axe(gp);
		gp.obj[i].worldX = gp.tileSize * 20;
		gp.obj[i].worldY = gp.tileSize * 21;
		
		i++;
		gp.obj[i] = new OBJ_Heart(gp);
		gp.obj[i].worldX = gp.tileSize * 53;
		gp.obj[i].worldY = gp.tileSize * 3;
	}
	
	public void setNPC() {
		
		int i = 0;
		gp.npc[i] = new NPC_OldMan(gp);
		gp.npc[i].worldX = gp.tileSize * 39;
		gp.npc[i].worldY = gp.tileSize * 7;
		
		i++;
		gp.npc[i] = new NPC_OldMan2(gp);
		gp.npc[i].worldX = gp.tileSize * 6;
		gp.npc[i].worldY = gp.tileSize * 18;
	}
	
	public void setMonster() {
		
		int i = 0;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 8;
		gp.monster[i].worldY = gp.tileSize * 37;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 10;
		gp.monster[i].worldY = gp.tileSize * 38;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 12;
		gp.monster[i].worldY = gp.tileSize * 40;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 28;
		gp.monster[i].worldY = gp.tileSize * 13;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 30;
		gp.monster[i].worldY = gp.tileSize * 16;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 40;
		gp.monster[i].worldY = gp.tileSize * 25;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 42;
		gp.monster[i].worldY = gp.tileSize * 26;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 44;
		gp.monster[i].worldY = gp.tileSize * 29;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 28;
		gp.monster[i].worldY = gp.tileSize * 46;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 31;
		gp.monster[i].worldY = gp.tileSize * 36;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 49;
		gp.monster[i].worldY = gp.tileSize * 37;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 52;
		gp.monster[i].worldY = gp.tileSize * 42;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 54;
		gp.monster[i].worldY = gp.tileSize * 56;
		
		i++;
		gp.monster[i] = new MON_GreenSlime(gp);
		gp.monster[i].worldX = gp.tileSize * 53;
		gp.monster[i].worldY = gp.tileSize * 5;
	}
	
	public void setInteractiveTile() {
		
		//left side 
		int i = 0;
		gp.iTile[i] = new IT_DryTree(gp, 9, 23); i++;
		gp.iTile[i] = new IT_DryTree(gp, 10, 23); i++;
		gp.iTile[i] = new IT_DryTree(gp, 9, 24); i++;
		gp.iTile[i] = new IT_DryTree(gp, 8, 25); i++;
		gp.iTile[i] = new IT_DryTree(gp, 9, 25); i++;
		gp.iTile[i] = new IT_DryTree(gp, 8, 26); i++;
		gp.iTile[i] = new IT_DryTree(gp, 9, 26); i++;
		gp.iTile[i] = new IT_DryTree(gp, 10, 26); i++;
		gp.iTile[i] = new IT_DryTree(gp, 9, 27); i++;
		gp.iTile[i] = new IT_DryTree(gp, 10, 27); i++;
		
		// miscellaneous trees
		gp.iTile[i] = new IT_DryTree(gp, 27, 5); i++;
		gp.iTile[i] = new IT_DryTree(gp, 27, 16); i++;
		gp.iTile[i] = new IT_DryTree(gp, 30, 18); i++;
		gp.iTile[i] = new IT_DryTree(gp, 31, 19); i++;
		gp.iTile[i] = new IT_DryTree(gp, 33, 17); i++;
		gp.iTile[i] = new IT_DryTree(gp, 52, 10); i++;
		gp.iTile[i] = new IT_DryTree(gp, 56, 12); i++;
		gp.iTile[i] = new IT_DryTree(gp, 57, 12); i++;
		gp.iTile[i] = new IT_DryTree(gp, 50, 16); i++;
		gp.iTile[i] = new IT_DryTree(gp, 50, 17); i++;
		gp.iTile[i] = new IT_DryTree(gp, 51, 17); i++;
		gp.iTile[i] = new IT_DryTree(gp, 38, 42); i++;
		gp.iTile[i] = new IT_DryTree(gp, 32, 41); i++;
		gp.iTile[i] = new IT_DryTree(gp, 32, 44); i++;
		gp.iTile[i] = new IT_DryTree(gp, 33, 44); i++;
		gp.iTile[i] = new IT_DryTree(gp, 33, 43); i++;
		gp.iTile[i] = new IT_DryTree(gp, 40, 54); i++;
		gp.iTile[i] = new IT_DryTree(gp, 41, 54); i++;
		gp.iTile[i] = new IT_DryTree(gp, 46, 56); i++;
		gp.iTile[i] = new IT_DryTree(gp, 47, 56); i++;
		gp.iTile[i] = new IT_DryTree(gp, 48, 56); i++;
		gp.iTile[i] = new IT_DryTree(gp, 48, 57); i++;
		gp.iTile[i] = new IT_DryTree(gp, 50, 56); i++;
		gp.iTile[i] = new IT_DryTree(gp, 50, 57); i++;
		gp.iTile[i] = new IT_DryTree(gp, 51, 56); i++;
		gp.iTile[i] = new IT_DryTree(gp, 52, 57); i++;
		gp.iTile[i] = new IT_DryTree(gp, 53, 57); i++;
		
		//more
		gp.iTile[i] = new IT_DryTree(gp, 18, 5); i++;
		gp.iTile[i] = new IT_DryTree(gp, 19, 5); i++;
		gp.iTile[i] = new IT_DryTree(gp, 19, 4); i++;
		gp.iTile[i] = new IT_DryTree(gp, 20, 4); i++;
		gp.iTile[i] = new IT_DryTree(gp, 26, 5); i++;
		gp.iTile[i] = new IT_DryTree(gp, 24, 4); i++;
		gp.iTile[i] = new IT_DryTree(gp, 5, 7); i++;
		gp.iTile[i] = new IT_DryTree(gp, 4, 7); i++;
		gp.iTile[i] = new IT_DryTree(gp, 3, 7); i++;
		gp.iTile[i] = new IT_DryTree(gp, 28, 52); i++;
		gp.iTile[i] = new IT_DryTree(gp, 28, 53); i++;
		gp.iTile[i] = new IT_DryTree(gp, 30, 54); i++;
		gp.iTile[i] = new IT_DryTree(gp, 31, 54); i++;
		gp.iTile[i] = new IT_DryTree(gp, 32, 52); i++;
		gp.iTile[i] = new IT_DryTree(gp, 31, 52); i++;
		gp.iTile[i] = new IT_DryTree(gp, 29, 53); i++;
		gp.iTile[i] = new IT_DryTree(gp, 19, 52); i++;
		gp.iTile[i] = new IT_DryTree(gp, 26, 49); i++;
	}
}
