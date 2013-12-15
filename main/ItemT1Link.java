package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemT1Link extends Item{

	public ItemT1Link(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.IT1_UNLOCAL);
		setCreativeTab(CreativeTabs.tabRedstone);
		setMaxStackSize(2);
		
	}

}
