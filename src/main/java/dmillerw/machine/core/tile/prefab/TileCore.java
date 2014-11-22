package dmillerw.machine.core.tile.prefab;

import dmillerw.machine.core.network.nbt.NBTHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

/**
 * @author dmillerw
 */
public class TileCore extends TileEntity {

    protected NBTHandler nbtHandler;

    public TileCore() {
        this(true);
    }

    public TileCore(boolean scan) {
        nbtHandler = new NBTHandler(this, scan);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);
        nbtHandler.writeAllToNBT(nbtTagCompound);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);
        nbtHandler.readFromNBT(nbtTagCompound);
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        writeToNBT(nbtTagCompound);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, nbtTagCompound);
    }

    public void markForUpdate() {
        if (hasWorldObj()) {
            getWorldObj().markBlockForUpdate(xCoord, yCoord, zCoord);
        }
    }

    public void markForRenderUpdate() {
        if (hasWorldObj()) {
            getWorldObj().markBlockRangeForRenderUpdate(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
        }
    }

    public void updateNeighbors() {
        if (hasWorldObj()) {
            getWorldObj().notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord, getBlockType());
        }
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        writeToNBT(pkt.func_148857_g());
        markForRenderUpdate();
    }
}
