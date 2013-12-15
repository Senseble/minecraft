package main;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File file){
		Configuration config = new Configuration(file);
		config.load();
		
		BlockInfo.TIER1_ID = config.getBlock("Blocks", BlockInfo.TIER1_KEY, BlockInfo.TIER1_DEFAULT).getInt();
		
		ItemInfo.IT1_ID = config.getItem(ItemInfo.IT1_KEY, ItemInfo.IT1_DEFAULT).getInt();
		
		
		config.save();
	}
}
