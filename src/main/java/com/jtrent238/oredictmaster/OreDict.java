package com.jtrent238.oredictmaster;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.Loader;
import danger.orespawn.OreSpawnMain;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;

public class OreDict {

	public static void addores() {

		
		if (Loader.isModLoaded("OreSpawn")) {
			Orespawn.registerOres();
		}
		
		if (Loader.isModLoaded("nevermine")) {
			nevermine.registerOres();	
		}
		

		
		addItems();
	}

	private static void addItems() {


		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();
        //replacements.put(new ItemStack(ItemLoader.ItemxJSQIngot), "ingot_xJSQ");

	}

}
