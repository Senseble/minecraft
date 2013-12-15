package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TeleportCoreItem extends Item{

	public TeleportCoreItem(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabRedstone);
		setUnlocalizedName(ItemInfo.CORE_UNLOCAL);
		
	}
	

}
