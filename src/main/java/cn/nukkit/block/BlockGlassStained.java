package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.utils.BlockColor;
import cn.nukkit.utils.DyeColor;

/**
 * Stained glass, the color is stored in the damage value.
 */
public class BlockGlassStained extends BlockTransparent {

    public BlockGlassStained() {
        this(0);
    }

    public BlockGlassStained(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return STAINED_GLASS;
    }

    @Override
    public String getName() {
        return this.getDyeColor().getName() + " Stained Glass";
    }

    @Override
    public double getHardness() {
        return 0.3;
    }

    @Override
    public double getResistance() {
        return 1.5;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[0];
    }

    @Override
    public BlockColor getColor() {
        return this.getDyeColor().getColor();
    }

    public DyeColor getDyeColor() {
        return DyeColor.getByDyedData(this.meta);
    }
}
