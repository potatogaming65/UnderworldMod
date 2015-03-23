package com.Gruble.blocksitems;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class RubyOre extends GrubleOre{
	public RubyOre(int id, Material mat){
		super(id, mat);
		setHarvestLevel("pickaxe", 3);
	}
}
