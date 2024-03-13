package net.octoberserver.blankodintweaks;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.octoberserver.blankodintweaks.proxy.CommonProxy;
import org.apache.logging.log4j.Logger;

@Mod(modid = BlankOdinTweaks.MODID, name = BlankOdinTweaks.NAME, version = BlankOdinTweaks.VERSION)
public class BlankOdinTweaks {
    public static final String MODID = "blankodintweaks";
    public static final String NAME = "Blank Odin Tweaks";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @SidedProxy(clientSide = "net.octoberserver.blankodintweaks.proxy.ClientProxy", serverSide = "net.octoberserver.blankodintweaks.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static BlankOdinTweaks instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
