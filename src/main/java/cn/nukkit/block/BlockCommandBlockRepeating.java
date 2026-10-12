package cn.nukkit.block;

/**
 * Repeating command block, runs its command every tick while powered.
 */
public class BlockCommandBlockRepeating extends BlockCommandBlock {

    public BlockCommandBlockRepeating() {
        this(0);
    }

    public BlockCommandBlockRepeating(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return REPEATING_COMMAND_BLOCK;
    }

    @Override
    public String getName() {
        return "Repeating Command Block";
    }
}
