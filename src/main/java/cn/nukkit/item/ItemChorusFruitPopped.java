package cn.nukkit.item;

/**
 * Popped chorus fruit, smelted in a furnace to craft chorus fruit blocks.
 */
public class ItemChorusFruitPopped extends Item {

    public ItemChorusFruitPopped() {
        this(0, 1);
    }

    public ItemChorusFruitPopped(Integer meta) {
        this(meta, 1);
    }

    public ItemChorusFruitPopped(Integer meta, int count) {
        super(POPPED_CHORUS_FRUIT, meta, count, "Popped Chorus Fruit");
    }
}
