package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;

/**
 * Nether reactor core, the structure center of the old pocket edition nether.
 */
public class BlockNetherReactor extends BlockSolid {

    public BlockNetherReactor() {
        this(0);
    }

    public BlockNetherReactor(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return NETHER_REACTOR;
    }

    @Override
    public String getName() {
        return "Nether Reactor";
    }

    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 15;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= ItemTool.TIER_WOODEN) {
            return new Item[]{
                    Item.get(NETHER_REACTOR, 0, 1)
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
