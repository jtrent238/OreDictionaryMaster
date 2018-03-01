package com.jtrent238.oredictmaster;

import java.util.HashMap;
import java.util.Map;

import com.jtrent238.oredictmaster.ModRegistrations.DB600PlasticMod;
import com.jtrent238.oredictmaster.ModRegistrations.LittleMoreMod;
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
			else {
				System.out.println("OreSpawn Mod not loaded ignoring...");
			}
		
		if (ModRegistry.isneverminemodLoaded == true) {
			NeverMineReg.RegisterOres();
		}
			else {
				System.out.println("Advent of Ascension Mod not loaded ignoring...");
			}
		
		if (ModRegistry.issteveuniversemodLoaded == true) {
			StevesUniverseMod.RegisterOres();
		}
			else {
				System.out.println("Steve's Universe Mod not loaded ignoring...");
			}
		
		if (ModRegistry.issdb600plasticmodLoaded == true) {
			DB600PlasticMod.RegisterOres();
		}
			else {
				System.out.println("DragonBox600's Plastic Mod not loaded ignoring...");
			}
	
		if (ModRegistry.islittlemoremodLoaded == true) {
			LittleMoreMod.RegisterOres();
		}
			else {
				System.out.println("Little More Mod not loaded ignoring...");
			}
	
		addItems();
	}

	private static void addItems() {


		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();
        //replacements.put(new ItemStack(ItemLoader.ItemxJSQIngot), "ingot_xJSQ");

	}

}