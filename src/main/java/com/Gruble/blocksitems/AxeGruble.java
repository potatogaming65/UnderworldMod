package com.Gruble.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class AxeGruble extends ItemAxe{
	public AxeGruble(int id, ToolMaterial mat){
		super(mat);
	}

	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireAxe){
			this.itemIcon = reg.registerIcon("gruble:sapphireAxe");
		}
		if(this == BlocksAndItems.rubyAxe){
			this.itemIcon = reg.registerIcon("gruble:rubyAxe");
		}
		if(this == BlocksAndItems.gorrAxe){
			this.itemIcon = reg.registerIcon("gruble:gorrAxe");
		}
		if(this == BlocksAndItems.nyrtAxe){
			this.itemIcon = reg.registerIcon("gruble:nyrtAxe");
		}
	}
}
