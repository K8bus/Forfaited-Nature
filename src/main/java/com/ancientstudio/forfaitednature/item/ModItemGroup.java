package com.ancientstudio.forfaitednature.item;

import com.ancientstudio.forfaitednature.ForfaitedNature;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup METALS;

    public static void registerItemGroups() {
        METALS = FabricItemGroup.builder(new Identifier(ForfaitedNature.MOD_ID, "metals"))
                .displayName(Text.translatable("itemgroup.metals"))
                .icon(() -> new ItemStack(ModItems.MAGNESIUM_INGOT)).build();
    }
}

