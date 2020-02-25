package net.telepathicgrunt.allthefeatures.generation.layer;

import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.PerlinNoiseGenerator;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;
import net.telepathicgrunt.allthefeatures.biome.BiomeInit;


@SuppressWarnings("deprecation")
public enum QuadBiomeLayer implements IAreaTransformer0
{
	INSTANCE;

	private static final int FEATURE_BIOME_ID = Registry.BIOME.getId(BiomeInit.FEATURE_BIOME);
	private static final int MOUNTAIN_FEATURE_BIOME_ID = Registry.BIOME.getId(BiomeInit.MOUNTAIN_FEATURE_BIOME);
	private static final int OCEAN_FEATURE_BIOME_ID = Registry.BIOME.getId(BiomeInit.OCEAN_FEATURE_BIOME);
	private static final int FROZEN_OCEAN_FEATURE_BIOME_ID = Registry.BIOME.getId(BiomeInit.FROZEN_OCEAN_FEATURE_BIOME);
	private static PerlinNoiseGenerator perlinGen;
//	private double max = -100000;
//	private double min = 100000;

	public int apply(INoiseRandom noise, int x, int z)
	{
		double perlinNoise = perlinGen.noiseAt((double) x * 0.1D, (double)z * 0.1D, false);
		
//		max = Math.max(max, perlinNoise);
//		min = Math.min(min, perlinNoise);
//		AllTheFeatures.LOGGER.log(Level.DEBUG, "Max: " + max +", Min: "+min + ", perlin: "+perlinNoise);
		
		
		if(perlinNoise > 0.53) {	
			return MOUNTAIN_FEATURE_BIOME_ID;
		}
		else if(perlinNoise > -0.58) {	
			return FEATURE_BIOME_ID;
		}
		else {	
			return noise.random(100)/1000D + perlinNoise%0.4 > 0.2 ? OCEAN_FEATURE_BIOME_ID : FROZEN_OCEAN_FEATURE_BIOME_ID;
		}
	
	}


	public static void setSeed(long seed)
	{
		if (perlinGen == null)
		{
			SharedSeedRandom sharedseedrandom = new SharedSeedRandom(seed);
			perlinGen = new PerlinNoiseGenerator(sharedseedrandom, 0, 0);
		}
	}
}