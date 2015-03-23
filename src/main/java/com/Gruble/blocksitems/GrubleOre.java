package com.Gruble.blocksitems;

import java.util.Random;

import com.Gruble.main.GrubleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class GrubleOre extends Block{
	public GrubleOre(int id, Material mat){
		super(mat);
		this.setCreativeTab(BlocksAndItems.grubleTab);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireOre){
			this.blockIcon = reg.registerIcon("gruble:sapphireOre");
		}
		if(this == BlocksAndItems.rubyOre){
			this.blockIcon = reg.registerIcon("gruble:rubyOre");
		}
		if(this == BlocksAndItems.gorrOre){
			this.blockIcon = reg.registerIcon("gruble:gorrOre");
		}
		if(this == BlocksAndItems.nyrtOre){
			this.blockIcon = reg.registerIcon("gruble:nyrtOre");
		}
		if(this == BlocksAndItems.koriOre){
			this.blockIcon = reg.registerIcon("gruble:koriOre");
		}
		if(this == BlocksAndItems.koriBlock){
			this.blockIcon = reg.registerIcon("gruble:koriBlock");
		}
	}
	
	public Item getItemDropped(int par1, Random rand, int par2){
		return Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random rand){
		return 1;
	}
	
	private Random rand = new Random();
	
	@Override
	public int getExpDrop(IBlockAccess ba, int a, int b){
		if(this.getItemDropped(a, rand, b) != Item.getItemFromBlock(this)){
			return 1 + rand.nextInt(5);
		}
		return 0;
	}
}
