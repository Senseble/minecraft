package main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class TileEntityTeleporter extends TileEntity {
	int x = xCoord;
	int y = yCoord;
	int z = zCoord;
	
	@Override 
	public void readFromNBT(NBTTagCompound nbt){
		super.readFromNBT(nbt);
		nbt.getInteger("x");
		nbt.getInteger("y");
		nbt.getInteger("z");
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt){
		super.writeToNBT(nbt);
		nbt.setInteger("x", x);
		nbt.setInteger("y", y);
		nbt.setInteger("z", z);
	}
	
	public void onJump(EntityPlayer player, World world){
		if(!world.isRemote){
			if(player.isAirBorne){
				EntityPlayerMP entityplayermp = new EntityPlayerMP(null, world, null, null);
				
				
			}
			EnderTeleportEvent event = new EnderTeleportEvent(, this.posX, this.posY, this.posZ, 0.0F);
		}
	}

}
