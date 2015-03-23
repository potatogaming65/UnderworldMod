package com.Gruble.blocksitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class PickaxeGruble extends ItemPickaxe{
	public PickaxeGruble(int id, ToolMaterial mat){
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphirePickaxe){
			this.itemIcon = reg.registerIcon("gruble:sapphirePickaxe");
		}
		if(this == BlocksAndItems.rubyPickaxe){
			this.itemIcon = reg.registerIcon("gruble:rubyPickaxe");
		};
		if(this == BlocksAndItems.gorrPickaxe){
			this.itemIcon = reg.registerIcon("gruble:gorrPickaxe");
		};
		if(this == BlocksAndItems.nyrtPickaxe){
			this.itemIcon = reg.registerIcon("gruble:nyrtPickaxe");
		};
	}
}
