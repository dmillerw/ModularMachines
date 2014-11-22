package dmillerw.machine.core.lib;

import dmillerw.machine.core.block.MMBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author dmillerw
 */
public class TabMMachine extends CreativeTabs {

    public static final TabMMachine TAB = new TabMMachine();

    public TabMMachine() {
        super("mmachine");
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(MMBlocks.casing);
    }
}
