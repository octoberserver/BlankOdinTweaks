package net.octoberserver.blankodintweaks.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("blankodintweaks:flawed_philosophers_stone")
    public static FlawedPhilosophersStone flawedPhilosophersStone;

    @GameRegistry.ObjectHolder("blankodintweaks:osmium_mechanical_component")
    public static OsmiumMechanicalComponent osmiumMechanicalComponent;

    @GameRegistry.ObjectHolder("blankodintweaks:rose_gold_ingot")
    public static RoseGoldIngot roseGoldIngot;

    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().register(new FlawedPhilosophersStone());
        e.getRegistry().register(new OsmiumMechanicalComponent());
        e.getRegistry().register(new RoseGoldIngot());
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        flawedPhilosophersStone.initModel();
        osmiumMechanicalComponent.initModel();
        roseGoldIngot.initModel();
    }
}
