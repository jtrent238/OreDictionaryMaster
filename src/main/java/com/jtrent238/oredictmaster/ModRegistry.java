package com.jtrent238.oredictmaster;

import java.util.logging.Level;

import com.jtrent238.oredictmaster.libs.LogHelper;

import cpw.mods.fml.common.Loader;

public class ModRegistry {

	
	public static boolean orespawnLoaded;
	public static boolean nevermineLoaded;
	
	public ModRegistry(){
		
		
	
	registerMods();
	
}

	static void registerMods() {
		

		if (Loader.isModLoaded("OreSpawn")) {
			System.out.println("OreSpawn Mod Loaded");
			boolean orespawnLoaded = true;
			try {
	            		LogHelper.log(Level.INFO, "Loaded OreSpawn Mod");
	        }
	        	catch (Exception e) {
	         	   LogHelper.log(Level.SEVERE, "Could not load OreSpawn Mod");
	        	    e.printStackTrace(System.err);
	        }
	    
		if (Loader.isModLoaded("nevermine")) {
			System.out.println("Advent of Ascension Loaded");
			boolean nevermineLoaded = true;
			try {
		           LogHelper.log(Level.INFO, "Loaded Advent of Ascension");
		  }
		       catch (Exception e) {
		           LogHelper.log(Level.SEVERE, "Could not load Advent of Ascension");
		           e.printStackTrace(System.err);
		       }
			
			}
		
		
	}
}
}
