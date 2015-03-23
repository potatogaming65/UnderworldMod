package com.Gruble.blocksitems;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class KoriOre extends GrubleOre{
	public KoriOre(int id, Material mat){
		super(id, mat);
		setHarvestLevel("pickaxe", 4);
	}
}
