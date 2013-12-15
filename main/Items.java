package main;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item it1;
	public static Item TCore;
	
	
	 public static void init(){
		it1 = new ItemT1Link(7000);
		GameRegistry.registerItem(it1, ItemInfo.IT1_UNLOCAL);
		
		TCore = new TeleportCoreItem(7001);
		GameRegistry.registerItem(TCore, ItemInfo.CORE_UNLOCAL);
		
	}
	 
	 public static void addNames(){
		 LanguageRegistry.addName(it1, ItemInfo.IT1_NAME);
		 LanguageRegistry.addName(TCore, ItemInfo.CORE_NAME);
	 }  
}
