package net.muddy.propercopper.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.muddy.propercopper.ProperCopper;

public class ModItemGroups {

    public static final ItemGroup ProperCopperCategory = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProperCopper.MOD_ID, "proper_copper"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.proper_copper"))
                    .icon(() -> new ItemStack(Items.HOPPER)).entries((displayContext, entries) ->{

                        entries.add(Items.HOPPER);
                        entries.add(Items.HOPPER_MINECART);
                        entries.add(Items.BRUSH);
                        entries.add(Items.COMPASS);
                        entries.add(Items.SPYGLASS);
                        entries.add(Items.IRON_HELMET);
                        entries.add(Items.IRON_CHESTPLATE);
                        entries.add(Items.IRON_LEGGINGS);
                        entries.add(Items.IRON_BOOTS);
                        entries.add(Items.IRON_GOLEM_SPAWN_EGG);

                    }).build());

    public static void registerItemGroups(){

        ProperCopper.LOGGER.info("Registering Item Groups for " + ProperCopper.MOD_ID);
    }
}
