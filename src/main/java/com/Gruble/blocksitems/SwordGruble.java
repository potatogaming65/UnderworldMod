package com.Gruble.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SwordGruble extends ItemSword{
	public SwordGruble(int id, ToolMaterial mat){
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireSword){
			this.itemIcon = reg.registerIcon("gruble:sapphireSword");
		}
		if(this == BlocksAndItems.rubySword){
			this.itemIcon = reg.registerIcon("gruble:rubySword");
		}
		if(this == BlocksAndItems.gorrSword){
			this.itemIcon = reg.registerIcon("gruble:gorrSword");
		}
		if(this == BlocksAndItems.nyrtSword){
			this.itemIcon = reg.registerIcon("gruble:nyrtSword");
		}
	}
}
