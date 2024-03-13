package net.octoberserver.blankodintweaks.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.octoberserver.blankodintweaks.BlankOdinTweaks;

public class OsmiumMechanicalComponent extends Item {
    public OsmiumMechanicalComponent() {
        this.setRegistryName("osmium_mechanical_component");
        this.setUnlocalizedName(BlankOdinTweaks.MODID + ".osmium_mechanical_component");
        this.setMaxStackSize(64);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
