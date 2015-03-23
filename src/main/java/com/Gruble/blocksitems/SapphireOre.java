package com.Gruble.blocksitems;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class SapphireOre extends GrubleOre{
	public SapphireOre(int id, Material mat){
		super(id, mat);
		setHarvestLevel("pickaxe", 2);
	}
}
