package main;

import java.io.File;

import main.blocks.BlockInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File file){
		Configuration config = new Configuration(file);
		config.load();
		
		BlockInfo.T1_ID = config.getBlock(BlockInfo.T1_KEY, BlockInfo.T1_DEFAULT).getInt();
		
		
		config.save();
	}
}
