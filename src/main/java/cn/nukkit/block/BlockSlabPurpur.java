package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;
import cn.nukkit.item.ItemTool;

/**
 * Purpur slab, the upper half is stored in the damage value.
 */
public class BlockSlabPurpur extends BlockSlab {

    public BlockSlabPurpur() {
        this(0);
    }

    public BlockSlabPurpur(int meta) {
        super(meta, DOUBLE_PURPUR_SLAB);
    }

    @Override
    public int getId() {
        return PURPUR_SLAB;
    }

    @Override
    public String getName() {
        return ((this.meta & 0x08) > 0 ? "Upper " : "") + "Purpur Slab";
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= ItemTool.TIER_WOODEN) {
            return new Item[]{
                    toItem()
            };
        } else {
            return new Item[0];
        }
    }

    @Override
    public Item toItem() {
        return new ItemBlock(this, this.meta & 0x07);
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
