package com.mjr.extraplanets.planets.Kepler22b;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

import com.mjr.extraplanets.planets.ExtraPlanets_Planets;
import com.mjr.extraplanets.planets.Kepler22b.worldgen.ChunkProviderKepler22b;
import com.mjr.extraplanets.planets.Kepler22b.worldgen.WorldChunkManagerKepler22b;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderKepler22b extends WorldProviderSpace implements IGalacticraftWorldProvider, ISolarLevel {

	@Override
	public Vector3 getFogColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
		return new Vector3(135 / 255F * f, 206 / 255F * f, 235 / 255F * f);
	}

	@Override
	public Vector3 getSkyColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
		return new Vector3(0 / 255.0F * f, 191 / 255.0F * f, 255 / 255.0F * f);
	}

	@Override
	public boolean canRainOrSnow() {
		return true;
	}

	@Override
	public boolean hasSunset() {
		return true;
	}
	
	@Override
	public boolean canBlockFreeze(int x, int y, int z, boolean byWater)
	{
		return false;
	}
	  
	@Override
	public long getDayLength() {
		return 24000L;
	}

	@Override
	public boolean shouldForceRespawn() {
		return true;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderKepler22b.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerKepler22b.class;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getStarBrightness(float par1) {
		float f1 = this.worldObj.getCelestialAngle(par1);
		float f2 = 1.0F - (MathHelper.cos(f1 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

		if (f2 < 0.0F) {
			f2 = 1.0F;
		}

		if (f2 > 1.0F) {
			f2 = 1.0F;
		}

		return f2 * f2 * 0.7F;
	}

	@Override
	public double getHorizon() {
		return 44.0D;
	}

	@Override
	public int getAverageGroundLevel() {
		return 44;
	}

	@Override
	public boolean canCoordinateBeSpawn(int var1, int var2) {
		return true;
	}

	@Override
	public float getGravity() {
		return 0.030F;
	}

	@Override
	public int getHeight() {
		return 800;
	}

	@Override
	public double getMeteorFrequency() {
		return 0.0D;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 1.0D;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier >= ExtraPlanets_Planets.kepler22b.getTierRequirement();
	}

	@Override
	public float getFallDamageModifier() {
		return 0.95F;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 5.0F;
	}

	@Override
	public CelestialBody getCelestialBody() {
		return ExtraPlanets_Planets.kepler22b;
	}

	@Override
	public boolean hasBreathableAtmosphere() {
		return true;
	}

	@Override
	public float getThermalLevelModifier() {
		return 0F;
	}

	@Override
	public float getWindLevel() {
		return 3.0F;
	}

	@Override
	public double getSolarEnergyMultiplier() {
		return 8.0D;
	}
}