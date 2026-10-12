package cn.nukkit.block;

/**
 * Command block, stores and executes console commands. Unbreakable in survival.
 */
public class BlockCommandBlock extends BlockSolid {

    public BlockCommandBlock() {
        this(0);
    }

    public BlockCommandBlock(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return COMMAND_BLOCK;
    }

    @Override
    public String getName() {
        return "Command Block";
    }

    @Override
    public double getHardness() {
        return -1;
    }

    @Override
    public double getResistance() {
        return 3600;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
}
