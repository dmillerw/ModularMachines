package dmillerw.machine.core.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dmillerw.machine.core.block.prefab.BlockMMTile;
import dmillerw.machine.core.tile.TileCasing;
import dmillerw.machine.core.tile.prefab.TileCore;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

/**
 * @author dmillerw
 */
public class BlockCasing extends BlockMMTile {

    public BlockCasing() {
        super(Material.iron);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return Blocks.iron_block.getIcon(0, 0);
    }

    @Override
    public TileCore getTileEntity(int meta) {
        return new TileCasing();
    }
}
