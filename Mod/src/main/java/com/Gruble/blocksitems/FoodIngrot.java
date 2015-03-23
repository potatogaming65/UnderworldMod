package com.Gruble.blocksitems;

import com.Gruble.main.GrubleMod;

import net.minecraft.item.ItemFood;

public class FoodIngrot extends ItemFood{
	public FoodIngrot(int i, int j, boolean b){
		super(j, b);
		this.setCreativeTab(BlocksAndItems.grubleTab);
		this.setTextureName("gruble:ingrot");
	}
}
