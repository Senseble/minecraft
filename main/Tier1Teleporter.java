package main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Tier1Teleporter extends Block{

	public Tier1Teleporter(int id) {
		super(id, Material.rock);
		setCreativeTab(CreativeTabs.tabRedstone);
		setHardness(3.0f);
		setStepSound(Block.soundStoneFootstep);
		setTickRandomly(true);
		setUnlocalizedName("Tier1Teleporter");
		
		
	}
	
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		if(!world.isRemote){
			
		}
	}
	

}
