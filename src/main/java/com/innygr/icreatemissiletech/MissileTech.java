package com.innygr.icreatemissiletech;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/** Early-alpha entry point for iCreate: Missile Tech. */
@Mod(MissileTech.MOD_ID)
public final class MissileTech {
    public static final String MOD_ID = "icreate_missile_tech";
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<Item, Item> MISSILE_FIN = item("missile_fin");
    public static final DeferredHolder<Item, Item> MISSILE_THRUSTER = item("missile_thruster");
    public static final DeferredHolder<Item, Item> MISSILE_FLUID_TANK = item("missile_fluid_tank");
    public static final DeferredHolder<Item, Item> MISSILE_NAVIGATOR = item("missile_navigator");
    public static final DeferredHolder<Item, Item> MISSILE_NOSE_CONE = item("missile_nose_cone");
    public static final DeferredHolder<Item, Item> MISSILE_WARHEAD = item("missile_warhead");
    public static final DeferredHolder<Item, Item> MISSILE_REMOTE = item("missile_remote");

    private static DeferredHolder<Item, Item> item(String name) {
        return ITEMS.register(name, () -> new DescribedItem(name));
    }

    static {
        TABS.register("missile_tech", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.icreate_missile_tech"))
                .icon(() -> new ItemStack(MISSILE_THRUSTER.get()))
                .displayItems((parameters, output) -> {
                    output.accept(MISSILE_FIN.get());
                    output.accept(MISSILE_THRUSTER.get());
                    output.accept(MISSILE_FLUID_TANK.get());
                    output.accept(MISSILE_NAVIGATOR.get());
                    output.accept(MISSILE_NOSE_CONE.get());
                    output.accept(MISSILE_WARHEAD.get());
                    output.accept(MISSILE_REMOTE.get());
                }).build());
    }

    public MissileTech(IEventBus modBus) {
        ITEMS.register(modBus);
        TABS.register(modBus);
    }

    private static final class DescribedItem extends Item {
        private final String descriptionKey;

        private DescribedItem(String path) {
            super(new Item.Properties());
            this.descriptionKey = "tooltip." + MOD_ID + "." + path;
        }

        @Override
        public void appendHoverText(ItemStack stack, Item.TooltipContext context,
                                    List<Component> tooltip, TooltipFlag flag) {
            super.appendHoverText(stack, context, tooltip, flag);
            tooltip.add(Component.translatable(descriptionKey).withStyle(ChatFormatting.GRAY));
            tooltip.add(Component.translatable("tooltip." + MOD_ID + ".alpha_notice")
                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
        }
    }
}
