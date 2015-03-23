package com.Gruble.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GrubleWorld {
	public static void mainRegistry(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new GrubleWorldGen(), 2);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int priority){
		GameRegistry.registerWorldGenerator(worldGenClass, priority);
	}
}
