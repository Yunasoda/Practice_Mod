package net.yunasoda.practicemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yunasoda.practicemod.PracticeMod;
import net.yunasoda.practicemod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRACTICE_TAB = CREATIVE_MODE_TABS.register("practice_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.practice_tab"))
                    .displayItems((itemDisplayParameters, output)-> {
                    output.accept(ModItems.SAPPHIRE.get());
                    output.accept(ModItems.RAW_SAPPHIRE.get());
                    output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                    output.accept(ModBlocks.SOUND_BLOCK.get());

                    output.accept(ModItems.STRAWBERRY.get());

                    output.accept(ModBlocks.SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
