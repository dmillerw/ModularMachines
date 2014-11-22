package dmillerw.machine.core.block;

import cpw.mods.fml.common.registry.GameRegistry;
import dmillerw.machine.core.tile.TileCasing;
import net.minecraft.block.Block;

/**
 * @author dmillerw
 */
public class MMBlocks {

    public static Block casing;

    public static void initialize() {
        casing = new BlockCasing().setBlockName("casing");
        GameRegistry.registerBlock(casing, "casing");
        GameRegistry.registerTileEntity(TileCasing.class, "MMachine:casing");
    }
}
