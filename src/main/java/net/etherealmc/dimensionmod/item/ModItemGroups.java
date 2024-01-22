package net.etherealmc.dimensionmod.item;

import net.etherealmc.dimensionmod.DimensionMod;
import net.etherealmc.dimensionmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DIMENSION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DimensionMod.MOD_ID,"etherealium_shard"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dimension"))
                    .icon(() -> new ItemStack(ModItems.ETHERALIUMSHARD)).entries((displayContext, entries) -> {
                        //items
                        entries.add(ModItems.ETHERALIUMSHARD);
                        entries.add(ModItems.RAWETHEREALIUM);

                        //blocks
                        entries.add(ModBlocks.ETHEREALIUM_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        DimensionMod.LOGGER.info("Registering item groups for " + DimensionMod.MOD_ID);
    }
}

