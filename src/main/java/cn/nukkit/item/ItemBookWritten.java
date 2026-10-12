package cn.nukkit.item;

/**
 * Signed book, written content is stored in its compound tag.
 */
public class ItemBookWritten extends Item {

    public ItemBookWritten() {
        this(0, 1);
    }

    public ItemBookWritten(Integer meta) {
        this(meta, 1);
    }

    public ItemBookWritten(Integer meta, int count) {
        super(WRITTEN_BOOK, meta, count, "Written Book");
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
