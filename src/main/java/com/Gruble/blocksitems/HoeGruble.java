package com.Gruble.blocksitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class HoeGruble extends ItemHoe{
	public HoeGruble(int id, ToolMaterial mat){
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireHoe){
			this.itemIcon = reg.registerIcon("gruble:sapphireHoe");
		}
		if(this == BlocksAndItems.rubyHoe){
			this.itemIcon = reg.registerIcon("gruble:rubyHoe");
		}
		if(this == BlocksAndItems.gorrHoe){
			this.itemIcon = reg.registerIcon("gruble:gorrHoe");
		}
		if(this == BlocksAndItems.nyrtHoe){
			this.itemIcon = reg.registerIcon("gruble:nyrtHoe");
		}
	}
}
