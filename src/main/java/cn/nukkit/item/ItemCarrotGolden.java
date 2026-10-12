package cn.nukkit.item;

/**
 * Golden carrot, the most nutritious food in the game.
 */
public class ItemCarrotGolden extends ItemEdible {

    public ItemCarrotGolden() {
        this(0, 1);
    }

    public ItemCarrotGolden(Integer meta) {
        this(meta, 1);
    }

    public ItemCarrotGolden(Integer meta, int count) {
        super(GOLDEN_CARROT, meta, count, "Golden Carrot");
    }
}
