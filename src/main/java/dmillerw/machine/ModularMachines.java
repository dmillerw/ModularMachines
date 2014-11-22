package dmillerw.machine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dmillerw.machine.core.CommonProxy;

/**
 * @author dmillerw
 */
@Mod(modid = "MMachine", name = "Modular Machines", version = "%MOD_VERSION%")
public class ModularMachines {

    @Mod.Instance("MMachine")
    public static ModularMachines instance;

    @SidedProxy(serverSide = "dmillerw.machine.core.CommonProxy", clientSide = "dmillerw.machine.client.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
