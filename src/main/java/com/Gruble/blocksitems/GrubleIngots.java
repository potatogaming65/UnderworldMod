package com.Gruble.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrubleIngots extends Item{
	public GrubleIngots(int id){
		super();
		setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireIngot){
			this.itemIcon = reg.registerIcon("gruble:sapphireIngot");
		}
		if(this == BlocksAndItems.rubyIngot){
			this.itemIcon = reg.registerIcon("gruble:rubyIngot");
		}
		if(this == BlocksAndItems.koriIngot){
			this.itemIcon = reg.registerIcon("gruble:koriIngot");
		}
		if(this == BlocksAndItems.gorrIngot){
			this.itemIcon = reg.registerIcon("gruble:gorrIngot");
		}
		if(this == BlocksAndItems.nyrtIngot){
			this.itemIcon = reg.registerIcon("gruble:nyrtIngot");
		}
	}
}
