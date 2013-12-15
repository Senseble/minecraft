package main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class Blocks {
	public static Block tier1;
	
	
	public static void init(){
		tier1 = new Tier1Teleporter(500);
		GameRegistry.registerBlock(tier1, BlockInfo.TIER1_UNLOCAL);
	}
	
	
	public static void addNames(){
		LanguageRegistry.addName(tier1, BlockInfo.TIER1_NAME);
	}
}
