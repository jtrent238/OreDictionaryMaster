package com.jtrent238.oredictmaster;

import java.util.HashMap;
import java.util.Map;

import com.jtrent238.oredictmaster.ModRegistrations.DB600PlasticMod;
import com.jtrent238.oredictmaster.ModRegistrations.NeverMineReg;
import com.jtrent238.oredictmaster.ModRegistrations.OreSpawnReg;
import com.jtrent238.oredictmaster.ModRegistrations.StevesUniverseMod;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void addores() {

		
		if (ModRegistry.isorespawnmodLoaded == true) {
			OreSpawnReg.RegisterOres();
		}
		
		if (ModRegistry.isneverminemodLoaded == true) {
			NeverMineReg.RegisterOres();
		}
		
		if (ModRegistry.issteveuniversemodLoaded == true) {
			StevesUniverseMod.RegisterOres();
		}

		if (ModRegistry.issdb600plasticmodLoaded == true) {
			DB600PlasticMod.RegisterOres();
		}
		
		addItems();
	}

	private static void addItems() {


		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();
        //replacements.put(new ItemStack(ItemLoader.ItemxJSQIngot), "ingot_xJSQ");

	}

}