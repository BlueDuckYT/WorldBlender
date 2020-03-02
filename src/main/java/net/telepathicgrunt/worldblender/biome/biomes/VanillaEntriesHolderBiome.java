package net.telepathicgrunt.worldblender.biome.biomes;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.dimension.EndDimension;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.EndGatewayConfig;
import net.minecraft.world.gen.feature.EndSpikeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureRadiusConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.MultipleWithChanceRandomFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.SeaGrassConfig;
import net.minecraft.world.gen.feature.SingleRandomFeature;
import net.minecraft.world.gen.feature.structure.BuriedTreasureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.OceanRuinConfig;
import net.minecraft.world.gen.feature.structure.OceanRuinStructure;
import net.minecraft.world.gen.feature.structure.ShipwreckConfig;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.CountConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;


public class VanillaEntriesHolderBiome extends Biome
{
	public VanillaEntriesHolderBiome()
	{
		super((new Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.NOPE, SurfaceBuilder.AIR_CONFIG)).precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.0F).scale(0.0F).temperature(0.0F).downfall(0.0F).waterColor(0).waterFogColor(0).parent((String) null));

		//DefaultBiomeFeatures.addEndCities(this); //handle this separately in PerformBiomeBlending
		//DefaultBiomeFeatures.addStructures(this); //handle this separately in PerformBiomeBlending
		this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
		this.addStructureFeature(Feature.STRONGHOLD.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.JUNGLE_TEMPLE.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.BURIED_TREASURE.configure(new BuriedTreasureConfig(0.01F)));
		this.addStructureFeature(Feature.SHIPWRECK.configure(new ShipwreckConfig(true)));
		this.addStructureFeature(Feature.OCEAN_RUIN.configure(new OceanRuinConfig(OceanRuinStructure.Type.COLD, 0.3F, 0.9F)));
		this.addStructureFeature(Feature.WOODLAND_MANSION.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.OCEAN_MONUMENT.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.VILLAGE.configure(new VillageConfig("village/desert/town_centers", 6)));
		this.addStructureFeature(Feature.PILLAGER_OUTPOST.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.DESERT_PYRAMID.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.SWAMP_HUT.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.IGLOO.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.END_CITY.configure(IFeatureConfig.NO_FEATURE_CONFIG));
		this.addStructureFeature(Feature.NETHER_BRIDGE.configure(IFeatureConfig.NO_FEATURE_CONFIG));

		DefaultBiomeFeatures.addBamboo(this);
		DefaultBiomeFeatures.addBambooJungleVegetation(this);
		DefaultBiomeFeatures.addBerryBushes(this);
		DefaultBiomeFeatures.addBirchTrees(this);
		DefaultBiomeFeatures.addBlueIce(this);
		DefaultBiomeFeatures.addDeadBushes(this);
		DefaultBiomeFeatures.addDefaultFlowers(this);
		DefaultBiomeFeatures.addDenseGrass(this);
		DefaultBiomeFeatures.addDesertFeatures(this);
		DefaultBiomeFeatures.addDesertLakes(this);
		DefaultBiomeFeatures.addDoubleFlowers(this);
		DefaultBiomeFeatures.addExtraDefaultFlowers(this);
		DefaultBiomeFeatures.addExtraEmeraldOre(this);
		DefaultBiomeFeatures.addExtraGoldOre(this);
		DefaultBiomeFeatures.addExtraKelp(this);
		DefaultBiomeFeatures.addExtraReedsAndPumpkins(this);
		DefaultBiomeFeatures.addExtraReedsPumpkinsCactus(this);
		DefaultBiomeFeatures.addForestTrees(this);
		DefaultBiomeFeatures.addFossils(this);
		DefaultBiomeFeatures.addFreezeTopLayer(this);
		DefaultBiomeFeatures.addGrass(this);
		DefaultBiomeFeatures.addGrassAndDeadBushes(this);
		DefaultBiomeFeatures.addHugeMushrooms(this);
		DefaultBiomeFeatures.addIcebergs(this);
		DefaultBiomeFeatures.addInfestedStone(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addJunglePlants(this);
		DefaultBiomeFeatures.addJungleTreeForest(this);
		DefaultBiomeFeatures.addKelp(this);
		DefaultBiomeFeatures.addLakes(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addMushrooms(this);
		DefaultBiomeFeatures.addOakAndJungleTrees(this);
		DefaultBiomeFeatures.addOakAndSpruceTrees(this);
		DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addReedsAndPumpkins(this);
		DefaultBiomeFeatures.addReedsPumpkinsCactus(this);
		DefaultBiomeFeatures.addSavannaTrees(this);
		DefaultBiomeFeatures.addScatteredOakAndSpruceTrees(this);
		DefaultBiomeFeatures.addScatteredOakTrees(this);
		DefaultBiomeFeatures.addScatteredSpruceTrees(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultBiomeFeatures.addShatteredSavannaTrees(this);
		DefaultBiomeFeatures.addSparseBerryBushes(this);
		DefaultBiomeFeatures.addSparseGrass(this);
		DefaultBiomeFeatures.addSparseOakTrees(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addStoneVariants(this);
		DefaultBiomeFeatures.addSwampClayDisks(this);
		DefaultBiomeFeatures.addSwampVegetation(this);
		DefaultBiomeFeatures.addTaigaConifers(this);
		DefaultBiomeFeatures.addTaigaGrassAndMushrooms(this);
		DefaultBiomeFeatures.addTaigaGrassDeadBushesMushrooms(this);
		DefaultBiomeFeatures.addTaigaLargeFerns(this);
		DefaultBiomeFeatures.addTaigaRocks(this);
		DefaultBiomeFeatures.addTallBirchForestTrees(this);
		DefaultBiomeFeatures.addTallGrass(this);
		DefaultBiomeFeatures.addVeryDenseGrass(this);
		DefaultBiomeFeatures.func_222320_ai(this);
		DefaultBiomeFeatures.func_222283_Y(this);
		DefaultBiomeFeatures.func_222285_H(this);
		DefaultBiomeFeatures.func_222309_aj(this);
		DefaultBiomeFeatures.func_222316_G(this);
		DefaultBiomeFeatures.func_222340_ak(this);
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(32, 0.3D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(40, 0.8D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(48, 0.4D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(48, 0.3D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(48, 0.8D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeaGrassConfig(64, 0.6D)).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.configure(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.HUGE_BROWN_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_BROWN_MUSHROOM_CONFIG).withChance(0.025F), Feature.HUGE_RED_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_RED_MUSHROOM_CONFIG).withChance(0.05F), Feature.DARK_OAK_TREE.configure(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG).withChance(0.6666667F),
				Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.BIRCH_TREE_CONFIG).withChance(0.2F), Feature.FANCY_TREE.configure(DefaultBiomeFeatures.FANCY_TREE_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.OAK_TREE_CONFIG))).createDecoratedFeature(Placement.DARK_OAK_TREE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.configure(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.HUGE_RED_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_RED_MUSHROOM_CONFIG).withChance(0.025F), Feature.HUGE_BROWN_MUSHROOM.configure(DefaultBiomeFeatures.HUGE_BROWN_MUSHROOM_CONFIG).withChance(0.05F), Feature.DARK_OAK_TREE.configure(DefaultBiomeFeatures.DARK_OAK_TREE_CONFIG).withChance(0.6666667F),
				Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.BIRCH_TREE_CONFIG).withChance(0.2F), Feature.FANCY_TREE.configure(DefaultBiomeFeatures.FANCY_TREE_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.OAK_TREE_CONFIG))).createDecoratedFeature(Placement.DARK_OAK_TREE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.END_GATEWAY.configure(EndGatewayConfig.func_214702_a(EndDimension.SPAWN, true)).createDecoratedFeature(Placement.END_GATEWAY.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.CHORUS_PLANT.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.CHORUS_PLANT.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.RANDOM_RANDOM_SELECTOR.configure(new MultipleWithChanceRandomFeatureConfig(ImmutableList.of(Feature.field_227248_z_.configure(DefaultBiomeFeatures.LILAC_CONFIG), Feature.field_227248_z_.configure(DefaultBiomeFeatures.ROSE_BUSH_CONFIG), Feature.field_227248_z_.configure(DefaultBiomeFeatures.PEONY_CONFIG), Feature.FLOWER.configure(DefaultBiomeFeatures.LILY_OF_THE_VALLEY_CONFIG)), 2)).createDecoratedFeature(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(5))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.RANDOM_SELECTOR.configure(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.BIRCH_TREE_WITH_BEEHIVES_CONFIG).withChance(0.2F), Feature.FANCY_TREE.configure(DefaultBiomeFeatures.FANCY_TREE_WITH_BEEHIVES_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.configure(DefaultBiomeFeatures.OAK_TREE_WITH_BEEHIVES_CONFIG))).createDecoratedFeature(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.configure(DefaultBiomeFeatures.FOREST_FLOWER_CONFIG).createDecoratedFeature(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(100))));
		this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.ICE_SPIKE.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(3))));
		this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.ICE_PATCH.configure(new FeatureRadiusConfig(2)).createDecoratedFeature(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(2))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SPRING_FEATURE.configure(DefaultBiomeFeatures.LAVA_SPRING_CONFIG).createDecoratedFeature(Placement.COUNT_VERY_BIASED_RANGE.configure(new CountRangeConfig(20, 8, 16, 256))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.NETHER_BRIDGE.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SPRING_FEATURE.configure(DefaultBiomeFeatures.NETHER_SPRING_CONFIG).createDecoratedFeature(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 4, 8, 128))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.NETHER_FIRE_CONFIG).createDecoratedFeature(Placement.HELL_FIRE.configure(new FrequencyConfig(10))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.GLOWSTONE_BLOB.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.LIGHT_GEM_CHANCE.configure(new FrequencyConfig(10))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.GLOWSTONE_BLOB.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 128))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG).createDecoratedFeature(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(0.5F, 0, 0, 128))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG).createDecoratedFeature(Placement.CHANCE_RANGE.configure(new ChanceRangeConfig(0.5F, 0, 0, 128))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 14)).createDecoratedFeature(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 10, 20, 128))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blocks.MAGMA_BLOCK.getDefaultState(), 33)).createDecoratedFeature(Placement.MAGMA.configure(new FrequencyConfig(4))));
		this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.SPRING_FEATURE.configure(DefaultBiomeFeatures.ENCLOSED_NETHER_SPRING_CONFIG).createDecoratedFeature(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 10, 20, 128))));
		this.addFeature(GenerationStage.Decoration.RAW_GENERATION, Feature.END_ISLAND.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.END_ISLAND.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.SUNFLOWER_CONFIG).createDecoratedFeature(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(10))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.SUGAR_CANE_CONFIG).createDecoratedFeature(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.configure(DefaultBiomeFeatures.PUMPKIN_PATCH_CONFIG).createDecoratedFeature(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(32))));
		this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.END_SPIKE.configure(new EndSpikeFeatureConfig(false, ImmutableList.of(), (BlockPos) null)).createDecoratedFeature(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.TOP_LAYER_MODIFICATION, Feature.VOID_START_PLATFORM.configure(IFeatureConfig.NO_FEATURE_CONFIG).createDecoratedFeature(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.SIMPLE_RANDOM_SELECTOR.configure(new SingleRandomFeature(ImmutableList.of(Feature.CORAL_TREE.configure(IFeatureConfig.NO_FEATURE_CONFIG), Feature.CORAL_CLAW.configure(IFeatureConfig.NO_FEATURE_CONFIG), Feature.CORAL_MUSHROOM.configure(IFeatureConfig.NO_FEATURE_CONFIG)))).createDecoratedFeature(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(20, 400.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEA_PICKLE.configure(new CountConfig(20)).createDecoratedFeature(Placement.CHANCE_TOP_SOLID_HEIGHTMAP.configure(new ChanceConfig(16))));

	}

}