package com.Gruble.blocksitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
public class BlocksAndItems {
	public static Block sapphireOre;
	public static Block rubyOre;
	public static Block gorrOre;
	public static Block nyrtOre;
	public static Block koriOre;
	public static Block koriBlock;
    
    public static Item sapphireIngot;
    public static Item rubyIngot;
    public static Item gorrIngot;
    public static Item nyrtIngot;
    public static Item koriIngot;
    
    public static Item sapphireSword;
    public static Item sapphirePickaxe;
    public static Item sapphireAxe;
    public static Item sapphireSpade;
    public static Item sapphireHoe;
    
    public static Item sapphireHelmet;
    public static Item sapphireChest;
    public static Item sapphireLeggings;
    public static Item sapphireBoots;
    
    public static Item rubySword;
    public static Item rubyPickaxe;
    public static Item rubyAxe;
    public static Item rubySpade;
    public static Item rubyHoe;
    
    public static Item rubyHelmet;
    public static Item rubyChest;
    public static Item rubyLeggings;
    public static Item rubyBoots;
    
    public static Item gorrSword;
    public static Item gorrPickaxe;
    public static Item gorrAxe;
    public static Item gorrSpade;
    public static Item gorrHoe;
    
    public static Item gorrHelmet;
    public static Item gorrChest;
    public static Item gorrLeggings;
    public static Item gorrBoots;
    
    public static Item nyrtSword;
    public static Item nyrtPickaxe;
    public static Item nyrtAxe;
    public static Item nyrtSpade;
    public static Item nyrtHoe;
    
    public static Item nyrtHelmet;
    public static Item nyrtChest;
    public static Item nyrtLeggings;
    public static Item nyrtBoots;
	
	public static int sapphireOreID = 750;
    public static int rubyOreID = 751;
    public static int gorrOreID = 752;
    public static int nyrtOreID = 753;
    public static int koriOreID = 754;
    public static int koriBlockID = 755;
    
    public static int sapphireIngotID = 1200;
    public static int rubyIngotID = 1201;
    public static int koriIngotID = 1202;
    public static int gorrIngotID = 1203;
    public static int nyrtIngotID = 1204;
    
    public static int sapphireSwordID = 1205;
    public static int sapphirePickaxeID = 1206;
    public static int sapphireAxeID = 1207;
    public static int sapphireSpadeID = 1208;
    public static int sapphireHoeID = 1209;
    public static int sapphireHelmetID = 1210;
    public static int sapphireChestID = 1211;
    public static int sapphireLeggingsID = 1212;
    public static int sapphireBootsID = 1213;
    
    public static int rubySwordID = 1214;
    public static int rubyPickaxeID = 1215;
    public static int rubyAxeID = 1216;
    public static int rubySpadeID = 1217;
    public static int rubyHoeID = 1218;
    public static int rubyHelmetID = 1219;
    public static int rubyChestID = 1220;
    public static int rubyLeggingsID = 1221;
    public static int rubyBootsID = 1222;
    
    public static int gorrSwordID = 1223;
    public static int gorrPickaxeID = 1224;
    public static int gorrAxeID = 1225;
    public static int gorrSpadeID = 1226;
    public static int gorrHoeID = 1227;
    public static int gorrHelmetID = 1228;
    public static int gorrChestID = 1229;
    public static int gorrLeggingsID = 1230;
    public static int gorrBootsID = 1231;
    
    public static int nyrtSwordID = 1232;
    public static int nyrtPickaxeID = 1233;
    public static int nyrtAxeID = 1234;
    public static int nyrtSpadeID = 1235;
    public static int nyrtHoeID = 1236;
    public static int nyrtHelmetID = 1237;
    public static int nyrtChestID = 1238;
    public static int nyrtLeggingsID = 1239;
    public static int nyrtBootsID = 1240;
    
    public static Item ingrot = new ItemFood(32, 3, false);
        
    public static ToolMaterial enumToolMaterialSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 2500, 5.0F, 2F, 25);
    public static ArmorMaterial enumArmourMaterialSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 75, new int[]{3, 7, 4, 2}, 25);
    public static ToolMaterial enumToolMaterialRuby = EnumHelper.addToolMaterial("RUBY", 4, 2500, 4F, 3F, 25);
    public static ArmorMaterial enumArmourMaterialRuby = EnumHelper.addArmorMaterial("RUBY", 885, new int[]{4, 10, 5, 4}, 35);
    public static ToolMaterial enumToolMaterialGorr = EnumHelper.addToolMaterial("GORR", 5, 6500, 6F, 3.5F, 5);
    public static ArmorMaterial enumArmourMaterialGorr = EnumHelper.addArmorMaterial("GORR", 5000, new int[]{6, 15, 9, 6}, 10);
    public static ToolMaterial enumToolMaterialNyrt = EnumHelper.addToolMaterial("NYRT", 6, 5505, 7F, 4F, 50);
    public static ArmorMaterial enumArmourMaterialNyrt = EnumHelper.addArmorMaterial("NYRT", 90000, new int[]{10, 30, 20, 10}, 50);
    
    public static CreativeTabs grubleTab = new CreativeTabs("Gruble"){
    	public Item getTabIconItem(){
    		return sapphireChest;
    	}
    };
    
    public static void init(){
    	
    	sapphireOre = new SapphireOre(sapphireOreID, Material.rock).setHardness(2.5F).setResistance(2.5F).setLightLevel(0.00005F).setBlockName("sapphireOre");
    	rubyOre = new RubyOre(rubyOreID, Material.rock).setHardness(2.5F).setResistance(2.5F).setLightLevel(0.00075F).setBlockName("rubyOre");
    	gorrOre = new GorrOre(gorrOreID, Material.rock).setHardness(4F).setResistance(9F).setLightLevel(0.5F).setBlockName("gorrOre");
    	nyrtOre = new NyrtOre(nyrtOreID, Material.rock).setHardness(2.75F).setResistance(2000F).setLightLevel(1.5F).setBlockName("nyrtOre");
    	koriOre = new KoriOre(koriOreID, Material.rock).setHardness(3.56F).setResistance(0.005F).setLightLevel(1.25F).setBlockName("koriOre");
    	koriBlock = new KoriOre(koriBlockID, Material.rock).setHardness(5.25F).setResistance(1.25F).setLightLevel(2.56F).setBlockName("koriBlock");
    	    	
    	sapphireIngot = new GrubleIngots(sapphireIngotID).setUnlocalizedName("sapphireIngot").setCreativeTab(grubleTab);
    	rubyIngot = new GrubleIngots(rubyIngotID).setUnlocalizedName("rubyIngot").setCreativeTab(grubleTab);
    	koriIngot = new GrubleIngots(koriIngotID).setUnlocalizedName("koriIngot").setCreativeTab(grubleTab);
    	gorrIngot = new GrubleIngots(gorrIngotID).setUnlocalizedName("gorrIngot").setCreativeTab(grubleTab);
    	nyrtIngot = new GrubleIngots(nyrtIngotID).setUnlocalizedName("nyrtIngot").setCreativeTab(grubleTab);
    	
    	sapphireSword = new SwordGruble(sapphireSwordID, enumToolMaterialSapphire).setUnlocalizedName("sapphireSword").setCreativeTab(grubleTab);
    	sapphirePickaxe = new PickaxeGruble(sapphirePickaxeID, enumToolMaterialSapphire).setUnlocalizedName("sapphirePickaxe").setCreativeTab(grubleTab);
    	sapphireAxe = new AxeGruble(sapphireAxeID, enumToolMaterialSapphire).setUnlocalizedName("sapphireAxe").setCreativeTab(grubleTab);
    	sapphireSpade = new SpadeGruble(sapphireSpadeID, enumToolMaterialSapphire).setUnlocalizedName("sapphireSpade").setCreativeTab(grubleTab);
    	sapphireHoe = new HoeGruble(sapphireHoeID, enumToolMaterialSapphire).setUnlocalizedName("sapphireHoe").setCreativeTab(grubleTab);
    	sapphireHelmet = new GrubleArmour(enumArmourMaterialSapphire, 5, 0).setUnlocalizedName("sapphireHelmet").setCreativeTab(grubleTab);
    	sapphireChest = new GrubleArmour(enumArmourMaterialSapphire, 5, 1).setUnlocalizedName("sapphireChest").setCreativeTab(grubleTab);
    	sapphireLeggings = new GrubleArmour(enumArmourMaterialSapphire, 5, 2).setUnlocalizedName("sapphireLeggings").setCreativeTab(grubleTab);
    	sapphireBoots = new GrubleArmour(enumArmourMaterialSapphire, 5, 3).setUnlocalizedName("sapphireBoots").setCreativeTab(grubleTab);
    	
    	rubySword = new SwordGruble(rubySwordID, enumToolMaterialRuby).setUnlocalizedName("rubySword").setCreativeTab(grubleTab);
    	rubyPickaxe = new PickaxeGruble(rubyPickaxeID, enumToolMaterialRuby).setUnlocalizedName("rubyPickaxe").setCreativeTab(grubleTab);
    	rubyAxe = new AxeGruble(rubyAxeID, enumToolMaterialRuby).setUnlocalizedName("rubyAxe").setCreativeTab(grubleTab);
    	rubySpade = new SpadeGruble(rubySpadeID, enumToolMaterialRuby).setUnlocalizedName("rubySpade").setCreativeTab(grubleTab);
    	rubyHoe = new HoeGruble(rubyHoeID, enumToolMaterialRuby).setUnlocalizedName("rubyHoe").setCreativeTab(grubleTab);
    	rubyHelmet = new GrubleArmour(enumArmourMaterialRuby, 5, 0).setUnlocalizedName("rubyHelmet").setCreativeTab(grubleTab);
    	rubyChest = new GrubleArmour(enumArmourMaterialRuby, 5, 1).setUnlocalizedName("rubyChest").setCreativeTab(grubleTab);
    	rubyLeggings = new GrubleArmour(enumArmourMaterialRuby, 5, 2).setUnlocalizedName("rubyLeggings").setCreativeTab(grubleTab);
    	rubyBoots = new GrubleArmour(enumArmourMaterialRuby, 5, 3).setUnlocalizedName("rubyBoots").setCreativeTab(grubleTab);
    	
    	gorrSword = new SwordGruble(gorrSwordID, enumToolMaterialGorr).setUnlocalizedName("gorrSword").setCreativeTab(grubleTab);
    	gorrPickaxe = new PickaxeGruble(gorrPickaxeID, enumToolMaterialGorr).setUnlocalizedName("gorrPickaxe").setCreativeTab(grubleTab);
    	gorrAxe = new AxeGruble(gorrAxeID, enumToolMaterialGorr).setUnlocalizedName("gorrAxe").setCreativeTab(grubleTab);
    	gorrSpade = new SpadeGruble(gorrSpadeID, enumToolMaterialGorr).setUnlocalizedName("gorrSpade").setCreativeTab(grubleTab);
    	gorrHoe = new HoeGruble(gorrHoeID, enumToolMaterialGorr).setUnlocalizedName("gorrHoe").setCreativeTab(grubleTab);
    	gorrHelmet = new GrubleArmour(enumArmourMaterialGorr, 5, 0).setUnlocalizedName("gorrHelmet").setCreativeTab(grubleTab);
    	gorrChest = new GrubleArmour(enumArmourMaterialGorr, 5, 1).setUnlocalizedName("gorrChest").setCreativeTab(grubleTab);
    	gorrLeggings = new GrubleArmour(enumArmourMaterialGorr, 5, 2).setUnlocalizedName("gorrLeggings").setCreativeTab(grubleTab);
    	gorrBoots = new GrubleArmour(enumArmourMaterialGorr, 5, 3).setUnlocalizedName("gorrBoots").setCreativeTab(grubleTab);
    	
    	nyrtSword = new SwordGruble(nyrtSwordID, enumToolMaterialNyrt).setUnlocalizedName("nyrtSword").setCreativeTab(grubleTab);
    	nyrtPickaxe = new PickaxeGruble(nyrtPickaxeID, enumToolMaterialNyrt).setUnlocalizedName("nyrtPickaxe").setCreativeTab(grubleTab);
    	nyrtAxe = new AxeGruble(nyrtAxeID, enumToolMaterialNyrt).setUnlocalizedName("nyrtAxe").setCreativeTab(grubleTab);
    	nyrtSpade = new SpadeGruble(nyrtSpadeID, enumToolMaterialNyrt).setUnlocalizedName("nyrtSpade").setCreativeTab(grubleTab);
    	nyrtHoe = new HoeGruble(nyrtHoeID, enumToolMaterialNyrt).setUnlocalizedName("nyrtHoe").setCreativeTab(grubleTab);
    	nyrtHelmet = new GrubleArmour(enumArmourMaterialNyrt, 5, 0).setUnlocalizedName("nyrtHelmet").setCreativeTab(grubleTab);
    	nyrtChest = new GrubleArmour(enumArmourMaterialNyrt, 5, 1).setUnlocalizedName("nyrtChest").setCreativeTab(grubleTab);
    	nyrtLeggings = new GrubleArmour(enumArmourMaterialNyrt, 5, 2).setUnlocalizedName("nyrtLeggings").setCreativeTab(grubleTab);
    	nyrtBoots = new GrubleArmour(enumArmourMaterialNyrt, 5, 3).setUnlocalizedName("nyrtBoots").setCreativeTab(grubleTab);
    	
    	ingrot = new FoodIngrot(32, 5, false);
    	
    	//underworldPortal = new UnderworldPortal();
    }
    
    public static void registries(){
    	GameRegistry.registerBlock(sapphireOre, "sapphireOre");
    	GameRegistry.registerBlock(rubyOre, "rubyOre");
    	GameRegistry.registerBlock(gorrOre, "gorrOre");
    	GameRegistry.registerBlock(nyrtOre, "nyrtOre");
    	GameRegistry.registerBlock(koriOre, "koriOre");
    	GameRegistry.registerBlock(koriBlock, "koriBlock");
    	
    	GameRegistry.registerItem(sapphireIngot, "sapphireIngot");
    	GameRegistry.registerItem(rubyIngot, "rubyIngot");
    	GameRegistry.registerItem(koriIngot, "koriIngot");
    	GameRegistry.registerItem(gorrIngot, "gorrIngot");
    	GameRegistry.registerItem(nyrtIngot, "nyrtIngot");
    	
    	GameRegistry.registerItem(sapphireSword, "sapphireSword");
    	GameRegistry.registerItem(sapphirePickaxe, "sapphirePickaxe");
    	GameRegistry.registerItem(sapphireAxe, "sapphireAxe");
    	GameRegistry.registerItem(sapphireSpade, "sapphireSpade");
    	GameRegistry.registerItem(sapphireHoe, "sapphireHoe");
    	GameRegistry.registerItem(sapphireHelmet, "sapphireHelmet");
    	GameRegistry.registerItem(sapphireChest, "sapphireChest");
    	GameRegistry.registerItem(sapphireLeggings, "sapphireLeggings");
    	GameRegistry.registerItem(sapphireBoots, "sapphireBoots");
    	
    	GameRegistry.registerItem(rubySword, "rubySword");
    	GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
    	GameRegistry.registerItem(rubyAxe, "rubyAxe");
    	GameRegistry.registerItem(rubySpade, "rubySpade");
    	GameRegistry.registerItem(rubyHoe, "rubyHoe");
    	GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
    	GameRegistry.registerItem(rubyChest, "rubyChest");
    	GameRegistry.registerItem(rubyLeggings, "rubyLeggings");
    	GameRegistry.registerItem(rubyBoots, "rubyBoots");
    	
    	GameRegistry.registerItem(gorrSword, "gorrSword");
    	GameRegistry.registerItem(gorrPickaxe, "gorrPickaxe");
    	GameRegistry.registerItem(gorrAxe, "gorrAxe");
    	GameRegistry.registerItem(gorrSpade, "gorrSpade");
    	GameRegistry.registerItem(gorrHoe, "gorrHoe");
    	GameRegistry.registerItem(gorrHelmet, "gorrHelmet");
    	GameRegistry.registerItem(gorrChest, "gorrChest");
    	GameRegistry.registerItem(gorrLeggings, "gorrLeggings");
    	GameRegistry.registerItem(gorrBoots, "gorrBoots");
    	
    	GameRegistry.registerItem(nyrtSword, "nyrtSword");
    	GameRegistry.registerItem(nyrtPickaxe, "nyrtPickaxe");
    	GameRegistry.registerItem(nyrtAxe, "nyrtAxe");
    	GameRegistry.registerItem(nyrtSpade, "nyrtSpade");
    	GameRegistry.registerItem(nyrtHoe, "nyrtHoe");
    	GameRegistry.registerItem(nyrtHelmet, "nyrtHelmet");
    	GameRegistry.registerItem(nyrtChest, "nyrtChest");
    	GameRegistry.registerItem(nyrtLeggings, "nyrtLeggings");
    	GameRegistry.registerItem(nyrtBoots, "nyrtBoots");
    	    	
    	//GameRegistry.registerBlock(underworldPortal, "underworldPortal");
    	
    	GameRegistry.registerItem(ingrot, "ingrot");
    	RenderingRegistry.addNewArmourRendererPrefix("5");
    	    	
    	GameRegistry.addSmelting(sapphireOre, new ItemStack(sapphireIngot, 1), 2.0F);
    	GameRegistry.addSmelting(rubyOre, new ItemStack(rubyIngot, 1), 2.5F);
    	GameRegistry.addSmelting(gorrOre, new ItemStack(gorrIngot, 1), 5F);
    	GameRegistry.addSmelting(nyrtOre, new ItemStack(nyrtIngot, 1), 6F);
    	
    	GameRegistry.addRecipe(new ItemStack(sapphireSword, 1), new Object[]{
    		" X "," X "," C ",'X', sapphireIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphirePickaxe, 1), new Object[]{
    		"XXX", " C "," C ",'X', sapphireIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireSpade, 1), new Object[]{
    		" X "," C "," C ",'X', sapphireIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireAxe, 1), new Object[]{
    		"XX ","XC "," C ",'X', sapphireIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireHoe, 1), new Object[]{
    		"XX "," C "," C ",'X', sapphireIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireHelmet, 1), new Object[]{
    		"   ","XXX","X X",'X', sapphireIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireChest, 1), new Object[]{
    		"X X","XXX","XXX",'X', sapphireIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireLeggings, 1), new Object[]{
    		"XXX","X X","X X",'X', sapphireIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(sapphireBoots, 1), new Object[]{
    		"   ","X X","X X",'X', sapphireIngot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(rubySword, 1), new Object[]{
    		" X "," X "," C ",'X', rubyIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyPickaxe, 1), new Object[]{
    		"XXX", " C "," C ",'X', rubyIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(rubySpade, 1), new Object[]{
    		" X "," C "," C ",'X', rubyIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyAxe, 1), new Object[]{
    		"XX ","XC "," C ",'X', rubyIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyHoe, 1), new Object[]{
    		"XX "," C "," C ",'X', rubyIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyHelmet, 1), new Object[]{
    		"   ","XXX","X X",'X', rubyIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyChest, 1), new Object[]{
    		"X X","XXX","XXX",'X', rubyIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyLeggings, 1), new Object[]{
    		"XXX","X X","X X",'X', rubyIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(rubyBoots, 1), new Object[]{
    		"   ","X X","X X",'X', rubyIngot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(gorrSword, 1), new Object[]{
    		" X "," X "," C ",'X', gorrIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrPickaxe, 1), new Object[]{
    		"XXX", " C "," C ",'X', gorrIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrSpade, 1), new Object[]{
    		" X "," C "," C ",'X', gorrIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrAxe, 1), new Object[]{
    		"XX ","XC "," C ",'X', gorrIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrHoe, 1), new Object[]{
    		"XX "," C "," C ",'X', gorrIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrHelmet, 1), new Object[]{
    		"   ","XXX","X X",'X', gorrIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrChest, 1), new Object[]{
    		"X X","XXX","XXX",'X', gorrIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrLeggings, 1), new Object[]{
    		"XXX","X X","X X",'X', gorrIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(gorrBoots, 1), new Object[]{
    		"   ","X X","X X",'X', gorrIngot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(nyrtSword, 1), new Object[]{
    		" X "," X "," C ",'X', nyrtIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtPickaxe, 1), new Object[]{
    		"XXX", " C "," C ",'X', nyrtIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtSpade, 1), new Object[]{
    		" X "," C "," C ",'X', nyrtIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtAxe, 1), new Object[]{
    		"XX ","XC "," C ",'X', nyrtIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtHoe, 1), new Object[]{
    		"XX "," C "," C ",'X', nyrtIngot, 'C', Items.stick
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtHelmet, 1), new Object[]{
    		"   ","XXX","X X",'X', nyrtIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtChest, 1), new Object[]{
    		"X X","XXX","XXX",'X', nyrtIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtLeggings, 1), new Object[]{
    		"XXX","X X","X X",'X', nyrtIngot
    	});
    	GameRegistry.addRecipe(new ItemStack(nyrtBoots, 1), new Object[]{
    		"   ","X X","X X",'X', nyrtIngot
    	});
    	
    	GameRegistry.addRecipe(new ItemStack(koriBlock, 1), new Object[]{
    		"   ", " xx", " xx", 'x', koriIngot
    	});
    }
}
