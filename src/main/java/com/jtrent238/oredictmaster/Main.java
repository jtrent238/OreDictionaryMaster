package com.jtrent238.oredictmaster;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.jtrent238.oredictmaster.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION))
public class Main
{

	
	@SidedProxy(clientSide="com.jtrent238.oredictmaster.client.ClientProxy", serverSide="com.jtrent238.oredictmaster.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "oredictmaster";

	@Instance(MODID)
    public static Main instance;
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "OreDictionary Master";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";

	private PlayerLoggedInEvent username;

	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	ModRegistry.registerMods();
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	OreDict.addores();

	
}



@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{

	}
	
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
	
}

					
}