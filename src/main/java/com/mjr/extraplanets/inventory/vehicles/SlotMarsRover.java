package com.mjr.extraplanets.inventory.vehicles;

import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.core.network.PacketSimple;
import micdoodle8.mods.galacticraft.core.network.PacketSimple.EnumSimplePacket;
import micdoodle8.mods.galacticraft.core.util.GCCoreUtil;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import com.mjr.extraplanets.items.ExtraPlanets_Items;

public class SlotMarsRover extends Slot {
	private final int index;
	private final BlockPos pos;
	private final EntityPlayer player;

	public SlotMarsRover(IInventory par2IInventory, int par3, int par4, int par5, BlockPos pos, EntityPlayer player) {
		super(par2IInventory, par3, par4, par5);
		this.index = par3;
		this.pos = pos;
		this.player = player;
		System.out.println(this.index + ", " + this.pos);
	}

	@Override
	public void onSlotChanged() {
		if (this.player instanceof EntityPlayerMP) {
			int dimID = GCCoreUtil.getDimensionID(this.player.worldObj);
			GCCoreUtil.sendToAllAround(new PacketSimple(EnumSimplePacket.C_SPAWN_SPARK_PARTICLES, dimID, new Object[] { this.pos }), this.player.worldObj, dimID, this.pos, 20);
		}
	}

	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		switch (this.index) {
		case 1:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 2:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 3:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 4:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 5:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 6:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 7:
			return par1ItemStack.getItem() == GCItems.partBuggy && par1ItemStack.getItemDamage() == 1;
		case 8:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 9:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 10:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 11:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 12:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 0;
		case 13:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 14:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 15:
			return par1ItemStack.getItem() == MarsItems.marsItemBasic && par1ItemStack.getItemDamage() == 3;
		case 16:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 17:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 18:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 19:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 20:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 21:
			return par1ItemStack.getItem() == ExtraPlanets_Items.ELECTRIC_PARTS && par1ItemStack.getItemDamage() == 2;
		case 22:
			return true;
		case 23:
			return true;
		case 24:
			return true;
		}

		return false;
	}

	/**
	 * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case of armor slots)
	 */
	@Override
	public int getSlotStackLimit() {
		return 1;
	}
}