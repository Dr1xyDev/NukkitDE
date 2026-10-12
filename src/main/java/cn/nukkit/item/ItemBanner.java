package cn.nukkit.item;

/**
 * Banner, patterns and colors are stored in its compound tag.
 */
public class ItemBanner extends Item {

    public ItemBanner() {
        this(0, 1);
    }

    public ItemBanner(Integer meta) {
        this(meta, 1);
    }

    public ItemBanner(Integer meta, int count) {
        super(BANNER, meta, count, "Banner");
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
