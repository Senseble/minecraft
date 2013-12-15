package main;

import main.blocks.Blocks;
import main.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = BasicInfo.MOD_ID, name = BasicInfo.MOD_NAME, version = BasicInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false,
		channels = {BasicInfo.MOD_CHANN}, packetHandler = PacketHandler.class)
public class MoTeleport {
	
	@Instance(value = BasicInfo.MOD_ID)
	public static MoTeleport instance;
	
	@SidedProxy(clientSide = "main.proxies.ClientProxy", 
				serverSide = "main.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void init(FMLPreInitializationEvent event){
		//Blocks.init();
		//Blocks.addNames();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}
	
}

