package com.Gruble.blocksitems;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class GorrOre extends GrubleOre{
	public GorrOre(int id, Material mat){
		super(id, mat);
		setHarvestLevel("pickaxe", 4);
	}
}
