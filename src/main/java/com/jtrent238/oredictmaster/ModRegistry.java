package com.jtrent238.oredictmaster;

import java.util.logging.Level;

import com.jtrent238.oredictmaster.libs.LogHelper;

import cpw.mods.fml.common.Loader;

public class ModRegistry {

	private static boolean isjtrent238youtubersLoaded;
	public static boolean isorespawnmodLoaded;
	public static boolean isneverminemodLoaded;
	public static boolean issteveuniversemodLoaded;
	public static boolean issdb600plasticmodLoaded;
	public static boolean islittlemoremodLoaded;
	
	public ModRegistry(){
		
		
	
	registerMods();
	
}

	static void registerMods() {
		

		if (Loader.isModLoaded("OreSpawn")) {
				isorespawnmodLoaded = true;
			System.out.println("OreSpawn Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded OreSpawn Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load OreSpawn Mod");
	            e.printStackTrace(System.err);
	        }
	    
		if (Loader.isModLoaded("nevermine")) {
				isneverminemodLoaded = true;
			System.out.println("Advent of Ascension Loaded");
			try {
		           LogHelper.log(Level.INFO, "Loaded Advent of Ascension");
		       }
		       catch (Exception e) {
		           LogHelper.log(Level.SEVERE, "Could not load Advent of Ascension");
		           e.printStackTrace(System.err);
		       }
			
			}
		
		if (Loader.isModLoaded("steveuniverse")) {
			issteveuniversemodLoaded = true;
		System.out.println("Steve's Universe Loaded");
		try {
	           LogHelper.log(Level.INFO, "Loaded Steve's Universe");
	       }
	       catch (Exception e) {
	           LogHelper.log(Level.SEVERE, "Could not load Steve's Universe");
	           e.printStackTrace(System.err);
	       }
		
		}
	
		if (Loader.isModLoaded("db600plasticmod")) {
			issdb600plasticmodLoaded = true;
		System.out.println("DragonBox600's Plastic Mod Loaded");
		try {
	           LogHelper.log(Level.INFO, "Loaded DragonBox600's Plastic Mod");
	       }
	       catch (Exception e) {
	           LogHelper.log(Level.SEVERE, "Could not load DragonBox600's Plastic Mod");
	           e.printStackTrace(System.err);
	       }
		
		}
		
		if (Loader.isModLoaded("mlmm")) {
			islittlemoremodLoaded = true;
		System.out.println("Little More Mod Loaded");
		try {
	           LogHelper.log(Level.INFO, "Loaded Little More Mod");
	       }
	       catch (Exception e) {
	           LogHelper.log(Level.SEVERE, "Could not load Little More Mod");
	           e.printStackTrace(System.err);
	       }
		
		}
		
	}
}
}