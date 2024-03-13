package net.octoberserver.blankodintweaks.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.octoberserver.blankodintweaks.BlankOdinTweaks;

public class RoseGoldIngot extends Item {
    public RoseGoldIngot() {
        this.setRegistryName("rose_gold_ingot");
        this.setUnlocalizedName(BlankOdinTweaks.MODID + ".rose_gold_ingot");
        this.setMaxStackSize(64);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
