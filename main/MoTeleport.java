package main;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = BasicInfo.MOD_ID, name = BasicInfo.MOD_NAME, version = BasicInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false,
		channels = {BasicInfo.MOD_CHANN}, packetHandler = PacketHandler.class)
public class MoTeleport {
	
	@Instance(value = BasicInfo.MOD_ID)
	public static MoTeleport instance;
	
	@SidedProxy(clientSide = "main.proxies.ClientProxy", 
				serverSide = "main.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item tier;
	
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event){
		//Blocks.init();
		//Blocks.addNames();
		//Items.init();
		tier = new ItemT1Link(3098);
		
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		//Items.addNames();
		LanguageRegistry.addName(tier, "Tier 1 Link");
		GameRegistry.registerItem(tier, "Tier 1 Link");
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}
	
}

