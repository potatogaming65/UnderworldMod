package com.Gruble.blocksitems;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class NyrtOre extends GrubleOre{
	public NyrtOre(int id, Material mat){
		super(id, mat);
		setHarvestLevel("pickaxe", 5);
	}
}
