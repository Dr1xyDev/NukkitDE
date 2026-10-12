package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.level.Level;

/**
 * Frosted ice, left behind on frozen paths and melted by bright light.
 */
public class BlockIceFrosted extends BlockIce {

    public BlockIceFrosted() {
        this(0);
    }

    public BlockIceFrosted(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return ICE_FROSTED;
    }

    @Override
    public String getName() {
        return "Frosted Ice";
    }

    @Override
    public boolean onBreak(Item item) {
        this.getLevel().setBlock(this, new BlockAir(), true);
        return true;
    }

    @Override
    public int onUpdate(int type) {
        if (type == Level.BLOCK_UPDATE_RANDOM
                && this.getLevel().getBlockLightAt((int) this.x, (int) this.y, (int) this.z) >= 12) {
            this.getLevel().setBlock(this, new BlockAir(), true);
            return Level.BLOCK_UPDATE_NORMAL;
        }
        return 0;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
