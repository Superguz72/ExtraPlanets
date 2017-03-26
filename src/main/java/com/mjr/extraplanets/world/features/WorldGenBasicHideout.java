package com.mjr.extraplanets.world.features;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;

import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;

public class WorldGenBasicHideout  extends WorldGenerator {

	public WorldGenBasicHideout() {

	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		int x = position.getX();
		int y = position.getY();
		int z = position.getZ();
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				try {
					if (world.getBlockState(new BlockPos(x + i, y - 3, z + j)).getBlock() == Blocks.air)
						return false;
				} catch (Exception ex) {
					System.out.println("ExtraPlanets: " + ex.getMessage());
				}
			}
		}
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				for (int k = 0; k < 6; k++) {
					if (world.getBlockState(new BlockPos(x + i, (y + 2) + k, z + j)).getBlock() != Blocks.air)
						return false;
				}
			}
		}
		y = y - 1;
		if (!world.isAreaLoaded(new BlockPos(x + 10, y, z + 10), 10))
			return false;
		else {
			//System.out.println("Spawning Basic Hideout at (x, y, z)" + x + " " + y + " " + z);
			generate_r0(world, rand, x, y, z);
			fillChests(world, rand, x, y, z);
		}
		return true;
	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z) {

		world.setBlockState(new BlockPos(x + 5, y + 0, z + 0), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 0), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 0), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 1), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 2), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 3), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 13, y + 0, z + 4), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 13, y + 0, z + 5), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 13, y + 0, z + 6), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 13, y + 0, z + 7), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 8), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 9), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 10), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 11), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 11), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 11), ExtraPlanets_Blocks.uranusBlocks.getStateFromMeta(8), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 1), Blocks.chest.getStateFromMeta(3), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 2), Blocks.jukebox.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 3), Blocks.quartz_stairs.getStateFromMeta(3), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 3), Blocks.quartz_stairs.getStateFromMeta(3), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 4), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 4), Blocks.oak_stairs.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 1, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 5), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 5), Blocks.bed.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 5), Blocks.bed.getStateFromMeta(1), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 1, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 6), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 6), Blocks.bed.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 6), Blocks.bed.getStateFromMeta(1), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 1, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 7), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 7), Blocks.oak_stairs.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 1, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 8), Blocks.quartz_stairs.getStateFromMeta(2), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 8), Blocks.quartz_stairs.getStateFromMeta(2), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 9), Blocks.jukebox.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 10), Blocks.chest.getStateFromMeta(2), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 4), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 2, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 5), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 2, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 6), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 2, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 7), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 2, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 0), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 1), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 1), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 2), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 2), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 3), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 3), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 4), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 4), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 3, z + 4), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 5), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 5), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 3, z + 5), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 6), Blocks.furnace.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 6), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 3, z + 6), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 7), Blocks.chest.getStateFromMeta(4), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 7), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 13, y + 3, z + 7), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 8), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 8), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 9), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 9), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 10), Blocks.air.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 10), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 11), ExtraPlanets_Blocks.jupiterBlocks.getStateFromMeta(11), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 1), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 1), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 1), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 2), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 3), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 3), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 3), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 3), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 3), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 3), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 4), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 4), Blocks.redstone_lamp.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 4), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 4), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 4), Blocks.redstone_lamp.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 4), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 12, y + 4, z + 4), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 5), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 12, y + 4, z + 5), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 6), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 12, y + 4, z + 6), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 7), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 7), Blocks.redstone_lamp.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 7), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 7), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 7), Blocks.redstone_lamp.getDefaultState(), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 7), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 12, y + 4, z + 7), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 8), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 8), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 8), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 8), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 8), Blocks.double_stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 8), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 9), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 10), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 10), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 10), Blocks.stone_slab.getStateFromMeta(7), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 4), Blocks.lever.getStateFromMeta(0), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 4), Blocks.lever.getStateFromMeta(0), 3);
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 7), Blocks.lever.getStateFromMeta(0), 3);
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 7), Blocks.lever.getStateFromMeta(0), 3);
		return true;

	}

	public boolean fillChests(World world, Random rand, int x, int y, int z) {
		int random = rand.nextInt(15) + 1;
		if (random < 5) {
			int lastNumber = 0;
			for (int i = 0; i < rand.nextInt(4); i++) {
				int randomChests;
				do {
					randomChests = rand.nextInt(9);
				} while (lastNumber == randomChests);
				lastNumber = randomChests;
				TileEntityChest chest;
				switch (randomChests) {
				case 1:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 1, z + 1));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 2:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 1, z + 4));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 3:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 1, z + 7));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 4:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 1, z + 10));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 5:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 2, z + 4));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 6:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 2, z + 7));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 7:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 3, z + 4));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				case 8:
					chest = (TileEntityChest) world.getTileEntity(new BlockPos(x + 6, y + 3, z + 7));

					if (chest != null) {
						for (int j = 0; j < chest.getSizeInventory(); j++) {
							chest.setInventorySlotContents(j, null);
						}

						ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

						WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
					}
					break;
				}
			}
		}
		return false;
	}
}