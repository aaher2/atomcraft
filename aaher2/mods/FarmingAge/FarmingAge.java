package aaher2.mods.FarmingAge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import aaher2.mods.FarmingAge.config.ConfigHandler;

import aaher2.mods.FarmingAge.networks.PacketHandler;
import aaher2.mods.FarmingAge.proxies.CommonProxy;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class FarmingAge {

	




	@Instance(ModInfo.ID)
	public static FarmingAge instance;


	@SidedProxy(clientSide = "aaher2.mods.FarmingAge.proxies.ClientProxy", serverSide = "aaher2.mods.FarmingAge.proxies.CommonProxy")
	public static CommonProxy proxy;



	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());

		proxy.initSounds();
		proxy.initRenderers();
		
		
		

		



	}

	@EventHandler
	public static void load(FMLInitializationEvent event) {
   
    
     

	}

	@EventHandler
	public static void modsLoaded(FMLPostInitializationEvent event) {

	}




}




