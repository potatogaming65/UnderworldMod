package com.Gruble.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.Gruble.main.GrubleMod;

public class GrubleArmour extends ItemArmor{
	private String[] armourTypes = new String[] {"helmetSapphire", "chestplateSapphire", "leggingsSapphire", "bootsSapphire"};
	
	public GrubleArmour(ArmorMaterial am, int renderIndex, int armourType){
		super(am, renderIndex, armourType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(BlocksAndItems.sapphireHelmet)||stack.getItem().equals(BlocksAndItems.sapphireChest)||stack.getItem().equals(BlocksAndItems.sapphireBoots)){
			return "gruble:textures/armour/sapphire_1.png";
		}
		if(stack.getItem().equals(BlocksAndItems.sapphireLeggings)){
			return "gruble:textures/armour/sapphire_2.png";
		}
		if(stack.getItem().equals(BlocksAndItems.rubyHelmet)||stack.getItem().equals(BlocksAndItems.rubyChest)||stack.getItem().equals(BlocksAndItems.rubyBoots)){
			return "gruble:textures/armour/ruby_1.png";
		}
		if(stack.getItem().equals(BlocksAndItems.rubyLeggings)){
			return "gruble:textures/armour/ruby_2.png";
		}
		if(stack.getItem().equals(BlocksAndItems.gorrHelmet)||stack.getItem().equals(BlocksAndItems.gorrChest)||stack.getItem().equals(BlocksAndItems.gorrBoots)){
			return "gruble:textures/armour/gorr_1.png";
		}
		if(stack.getItem().equals(BlocksAndItems.gorrLeggings)){
			return "gruble:textures/armour/gorr_2.png";
		}
		if(stack.getItem().equals(BlocksAndItems.nyrtHelmet)||stack.getItem().equals(BlocksAndItems.nyrtChest)||stack.getItem().equals(BlocksAndItems.nyrtBoots)){
			return "gruble:textures/armour/nyrt_1.png";
		}
		if(stack.getItem().equals(BlocksAndItems.nyrtLeggings)){
			return "gruble:textures/armour/nyrt_2.png";
		}
		else{
			return null;
		}
	}
	
	@Override
	public void registerIcons(IIconRegister reg){
		if(this == BlocksAndItems.sapphireHelmet){
			this.itemIcon = reg.registerIcon("gruble:sapphireHelmet");
		}
		if(this == BlocksAndItems.sapphireChest){
			this.itemIcon = reg.registerIcon("gruble:sapphireChest");
		}
		if(this == BlocksAndItems.sapphireLeggings){
			this.itemIcon = reg.registerIcon("gruble:sapphireLeggings");
		}
		if(this == BlocksAndItems.sapphireBoots){
			this.itemIcon = reg.registerIcon("gruble:sapphireBoots");
		}
		if(this == BlocksAndItems.rubyHelmet){
			this.itemIcon = reg.registerIcon("gruble:rubyHelm");
		}
		if(this == BlocksAndItems.rubyChest){
			this.itemIcon = reg.registerIcon("gruble:rubyChest");
		}
		if(this == BlocksAndItems.rubyLeggings){
			this.itemIcon = reg.registerIcon("gruble:rubyLegs");
		}
		if(this == BlocksAndItems.rubyBoots){
			this.itemIcon = reg.registerIcon("gruble:rubyBoots");
		}
		if(this == BlocksAndItems.gorrHelmet){
			this.itemIcon = reg.registerIcon("gruble:gorrHelmet");
		}
		if(this == BlocksAndItems.gorrChest){
			this.itemIcon = reg.registerIcon("gruble:gorrChestplate");
		}
		if(this == BlocksAndItems.gorrLeggings){
			this.itemIcon = reg.registerIcon("gruble:gorrLeggings");
		}
		if(this == BlocksAndItems.gorrBoots){
			this.itemIcon = reg.registerIcon("gruble:gorrBoots");
		}
		if(this == BlocksAndItems.nyrtHelmet){
			this.itemIcon = reg.registerIcon("gruble:nyrtHelmet");
		}
		if(this == BlocksAndItems.nyrtChest){
			this.itemIcon = reg.registerIcon("gruble:nyrtChestplate");
		}
		if(this == BlocksAndItems.nyrtLeggings){
			this.itemIcon = reg.registerIcon("gruble:nyrtLeggings");
		}
		if(this == BlocksAndItems.nyrtBoots){
			this.itemIcon = reg.registerIcon("gruble:nyrtBoots");
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(stack.getItem() == BlocksAndItems.sapphireBoots){
			int j = EnchantmentHelper.getEnchantmentLevel(GrubleMod.speedBoost.effectId, stack);
			if(j > 0){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
			}
		}
	}
}
