package cn.nukkit.item;

/**
 * Magma cream, brewed into fire resistance potions.
 */
public class ItemMagmaCream extends Item {

    public ItemMagmaCream() {
        this(0, 1);
    }

    public ItemMagmaCream(Integer meta) {
        this(meta, 1);
    }

    public ItemMagmaCream(Integer meta, int count) {
        super(MAGMA_CREAM, meta, count, "Magma Cream");
    }
}
