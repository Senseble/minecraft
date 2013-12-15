package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemT1Link extends Item{



	public ItemT1Link(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.IT1_UNLOCAL);
		setCreativeTab(CreativeTabs.tabRedstone);
		
		
	}
	
	@Override 
	 public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
			NBTTagCompound compound = stack.stackTagCompound;
		stack.writeToNBT(compound);
		compound.setInteger("x", x);
		compound.setInteger("y", y);
		compound.setInteger("z", z);
		player.addChatMessage("Coordinates : " + "x " + x + " y " + y + " z " + z);
			
		
		
        return false;
    }
}
