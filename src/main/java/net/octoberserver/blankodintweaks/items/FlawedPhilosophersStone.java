package net.octoberserver.blankodintweaks.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.octoberserver.blankodintweaks.BlankOdinTweaks;

import javax.annotation.Nullable;
import java.util.List;

public class FlawedPhilosophersStone extends Item {
    public FlawedPhilosophersStone() {
        this.setRegistryName("flawed_philosophers_stone");
        this.setUnlocalizedName(BlankOdinTweaks.MODID + ".flawed_philosophers_stone");
        this.setMaxStackSize(1);
        this.setMaxDamage(499);
        this.setNoRepair();
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack){
        ItemStack stack = itemstack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.setCount(1);

        return stack;
    }

    @Override
    public boolean hasContainerItem(@Nullable ItemStack stack){
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, @Nullable ITooltipFlag advanced){
        final int damage = stack.getMaxDamage() - stack.getItemDamage() + 1;
        tooltip.add("§f還可使用: §c" + damage + " §f次");
    }
}
