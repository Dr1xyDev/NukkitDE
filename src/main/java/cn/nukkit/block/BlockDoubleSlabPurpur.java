package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * Double purpur slab, formed by placing two purpur slabs on top of each other.
 */
public class BlockDoubleSlabPurpur extends BlockSolid {

    public BlockDoubleSlabPurpur() {
        this(0);
    }

    public BlockDoubleSlabPurpur(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return DOUBLE_PURPUR_SLAB;
    }

    @Override
    public double getHardness() {
        return 2;
    }

    @Override
    public double getResistance() {
        return 30;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public String getName() {
        return "Double Purpur Slab";
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= ItemTool.TIER_WOODEN) {
            return new Item[]{
                    Item.get(PURPUR_SLAB, this.meta & 0x07, 2)
            };
        } else {
            return new Item[0];
        }
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
