package com.jtrent238.oredictmaster.ModRegistrations;

import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class LittleMoreMod {

	public static void RegisterOres() {
		
		OreDictionary.registerOre("oreRuby",     ModBlocks.ruby_ore);
		OreDictionary.registerOre("blockRuby",     ModBlocks.ruby_block);
		OreDictionary.registerOre("oreSapphire",     ModBlocks.sapphire_ore);
		OreDictionary.registerOre("BlockSapphire",     ModBlocks.sapphire_block);
		
		OreDictionary.registerOre("gemRuby",     ModItems.ruby);
			OreDictionary.registerOre("ingotRuby",     ModItems.ruby);
		OreDictionary.registerOre("gemSapphire",     ModItems.sapphire);
			OreDictionary.registerOre("ingotSapphire",     ModItems.sapphire);
		
		OreDictionary.registerOre("ingotObsidian",     ModItems.obsidian_ingot);
		
		OreDictionary.registerOre("stickObsidian",     ModItems.obsidian_stick);
		
		
	}

}
