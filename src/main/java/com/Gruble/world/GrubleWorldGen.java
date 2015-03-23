package com.Gruble.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.Gruble.blocksitems.BlocksAndItems;

import cpw.mods.fml.common.IWorldGenerator;

public class GrubleWorldGen implements IWorldGenerator{
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGen, IChunkProvider chunkProv){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, rand, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateNether(World world, Random rand, int i, int j){
			
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		for(int i = 0; i < 7; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(45);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(BlocksAndItems.sapphireOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for(int i = 0; i < 5; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(35);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(BlocksAndItems.rubyOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for(int i = 0; i < 3; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(45);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(BlocksAndItems.gorrOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for(int i = 0; i < 2; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(10);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(BlocksAndItems.nyrtOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}
}
