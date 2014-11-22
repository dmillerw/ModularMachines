package dmillerw.machine.core.network.nbt.data;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * @author dmillerw
 */
public class ItemStackSerializer extends AbstractSerializer<ItemStack> {

    @Override
    public boolean canHandle(Class<?> fieldType) {
        return fieldType == ItemStack.class;
    }

    @Override
    public void serialize(String name, Object object, NBTTagCompound nbt) {
        NBTTagCompound tag = new NBTTagCompound();
        ((ItemStack) object).writeToNBT(tag);
        nbt.setTag(name, tag);
    }

    @Override
    public ItemStack deserialize(String name, NBTTagCompound nbt) {
        return ItemStack.loadItemStackFromNBT(nbt.getCompoundTag(name));
    }
}