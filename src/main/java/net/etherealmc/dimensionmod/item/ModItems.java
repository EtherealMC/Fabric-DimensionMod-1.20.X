package net.etherealmc.dimensionmod.item;

import net.etherealmc.dimensionmod.DimensionMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ETHERALIUMSHARD = registerItem("etherealium_shard", new Item(new FabricItemSettings()));
    public static final Item RAWETHEREALIUM = registerItem("raw_etherealium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ETHERALIUMSHARD);
        entries.add(RAWETHEREALIUM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DimensionMod.MOD_ID,name),item);
    }

    public static void registerModItems() {
        DimensionMod.LOGGER.info("Registering mod items for "+ DimensionMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
