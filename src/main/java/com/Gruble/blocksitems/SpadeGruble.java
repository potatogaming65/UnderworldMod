package com.Gruble.blocksitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;

public class SpadeGruble extends ItemSpade{
	public SpadeGruble(int id, ToolMaterial mat){
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireSpade){
			this.itemIcon = reg.registerIcon("gruble:sapphireSpade");
		}
		if(this == BlocksAndItems.rubySpade){
			this.itemIcon = reg.registerIcon("gruble:rubySpade");
		}
		if(this == BlocksAndItems.gorrSpade){
			this.itemIcon = reg.registerIcon("gruble:gorrSpade");
		}
		if(this == BlocksAndItems.nyrtSpade){
			this.itemIcon = reg.registerIcon("gruble:nyrtSpade");
		}
	}
}
