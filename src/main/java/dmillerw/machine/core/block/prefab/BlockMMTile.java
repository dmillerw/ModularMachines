package dmillerw.machine.core.block.prefab;

import dmillerw.machine.core.lib.TabMMachine;
import dmillerw.machine.core.tile.prefab.TileCore;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author dmillerw
 */
public abstract class BlockMMTile extends BlockContainer {

    public BlockMMTile(Material material) {
        super(material);

        setHardness(2F);
        setResistance(2F);
        setCreativeTab(TabMMachine.TAB);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return getTileEntity(meta);
    }

    public abstract TileCore getTileEntity(int meta);
}
