package dmillerw.machine.core;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dmillerw.machine.core.block.MMBlocks;
import dmillerw.machine.core.network.nbt.data.AbstractSerializer;

/**
 * @author dmillerw
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        MMBlocks.initialize();

        AbstractSerializer.initialize();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
