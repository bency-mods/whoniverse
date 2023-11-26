package net.bency.whoniverse.item;

import net.bency.whoniverse.Whoniverse;
import net.bency.whoniverse.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WHONIVERSE_INGREDIENTS = Registry.register(Registries.ITEM_GROUP, new Identifier(Whoniverse.MOD_ID, "whoniverse_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.whoniverse_ingredients"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.RAW_STEEL);
                    }).build());
    public static final ItemGroup WHONIVERSE_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(Whoniverse.MOD_ID, "whoniverse_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.whoniverse_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.SMOOTH_STEEL);
                    }).build());
    public static void registerItemGroups() {
        Whoniverse.LOGGER.info("Registering item groups for: " + Whoniverse.MOD_ID);
    }
}
