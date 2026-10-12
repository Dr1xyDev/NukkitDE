package cn.nukkit.block;

import cn.nukkit.utils.BlockColor;
import cn.nukkit.utils.DyeColor;

/**
 * Stained glass pane, the color is stored in the damage value.
 */
public class BlockGlassPaneStained extends BlockGlassPane {

    public BlockGlassPaneStained() {
        this(0);
    }

    public BlockGlassPaneStained(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return STAINED_GLASS_PANE;
    }

    @Override
    public String getName() {
        return this.getDyeColor().getName() + " Stained Glass Pane";
    }

    @Override
    public boolean canConnect(Block block) {
        return super.canConnect(block) || block.getId() == STAINED_GLASS_PANE;
    }

    @Override
    public BlockColor getColor() {
        return this.getDyeColor().getColor();
    }

    public DyeColor getDyeColor() {
        return DyeColor.getByDyedData(this.meta);
    }
}
