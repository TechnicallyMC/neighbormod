package net.technically.neighbormod.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.technically.neighbormod.block.BasementDoorOpenBlock;
import net.technically.neighbormod.block.BasementDoorBlock;
import net.technically.neighbormod.NeighborMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.technically.neighbormod.block.LockBlock;

public class NeighbormodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NeighborMod.MODID);
	public static final RegistryObject<Block> BASEMENT_DOOR = REGISTRY.register("basement_door", () -> new BasementDoorBlock());
	public static final RegistryObject<Block> BASEMENT_DOOR_OPEN = REGISTRY.register("basement_door_open", () -> new BasementDoorOpenBlock());
	public static final RegistryObject<Block> RED_LOCK = REGISTRY.register("red_lock", () -> new LockBlock());
	public static final RegistryObject<Block> BLUE_LOCK = REGISTRY.register("blue_lock", () -> new LockBlock());
	public static final RegistryObject<Block> GREEN_LOCK = REGISTRY.register("green_lock", () -> new LockBlock());
	public static final RegistryObject<Block> SMALL_LOCK = REGISTRY.register("small_lock", () -> new LockBlock());
}
