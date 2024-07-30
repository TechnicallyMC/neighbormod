package net.technically.neighbormod.init;

import net.technically.neighbormod.NeighborMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class NeighbormodModItems {
	//** Registry Define **//
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeighborMod.MODID);

	//** Key Items **//
	public static final RegistryObject<Item> BASEMENT_DOOR = block(NeighbormodModBlocks.BASEMENT_DOOR);
	public static final RegistryObject<Item> CROWBAR = registerSimpleItem("crowbar");
	public static final RegistryObject<Item> BASEMENT_DOOR_OPEN = block(NeighbormodModBlocks.BASEMENT_DOOR_OPEN);

	//** Keys **//

	public static final RegistryObject<Item> RED_LOCK = block(NeighbormodModBlocks.RED_LOCK);
	public static final RegistryObject<Item> BLUE_LOCK = block(NeighbormodModBlocks.BLUE_LOCK);
	public static final RegistryObject<Item> GREEN_LOCK = block(NeighbormodModBlocks.GREEN_LOCK);
	public static final RegistryObject<Item> SMALL_LOCK = block(NeighbormodModBlocks.SMALL_LOCK);
	public static final RegistryObject<Item> RED_KEY = key("red");
	public static final RegistryObject<Item> BLUE_KEY = key("blue");
	public static final RegistryObject<Item> GREEN_KEY = key("green");
	public static final RegistryObject<Item> SMALL_KEY = key("small");

	//** Random Items **//
	public static final RegistryObject<Item> MILK = unstackable("milk");

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
	private static RegistryObject<Item> registerSimpleItem(String itemName) {
		return REGISTRY.register(itemName, () -> new Item(new Item.Properties()));
	}

	private static RegistryObject<Item> key(String color) {
		return REGISTRY.register(color + "_key", () -> new Item(new Item.Properties().stacksTo(1)));
	}

	private static RegistryObject<Item> unstackable(String name) {
		return REGISTRY.register(name, () -> new Item(new Item.Properties().stacksTo(1)));
	}
}
