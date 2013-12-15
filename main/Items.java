package main;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item it1;
	
	 public static void init(){
		it1 = new ItemT1Link(7000);
		GameRegistry.registerItem(it1, ItemInfo.IT1_UNLOCAL);
		
		
		
	}
	 
	 public static void addNames(){
		 LanguageRegistry.addName(it1, ItemInfo.IT1_NAME);
	 }  
}
