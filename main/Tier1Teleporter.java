package main;

import javax.management.RuntimeErrorException;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
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
	
	public TileEntity createNewTileEntity(World world)
	    {
	        try {
				return new TileEntityTeleporter();
			} catch (Exception var3) {
				throw new RuntimeException(var3);
				
			}
	        
	    }
	@Override
	public boolean hasTileEntity(int meta)
	{
		return true;
		
	}
	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, 
										int par6, float par7, float par8, float par9) {
			if(!world.isRemote){
				TileEntityTeleporter t = (TileEntityTeleporter) world.getBlockTileEntity(par2, par3, par4);
				t.processActivate(player, world);
				
			}
		
		return true;
		
		
		
		
	}

}
