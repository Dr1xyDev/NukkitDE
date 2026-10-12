package cn.nukkit.item;

/**
 * Totem of undying, saves the holder from a fatal blow.
 */
public class ItemTotem extends Item {

    public ItemTotem() {
        this(0, 1);
    }

    public ItemTotem(Integer meta) {
        this(meta, 1);
    }

    public ItemTotem(Integer meta, int count) {
        super(TOTEM, meta, count, "Totem of Undying");
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
