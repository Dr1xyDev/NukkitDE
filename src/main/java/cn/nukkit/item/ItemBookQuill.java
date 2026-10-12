package cn.nukkit.item;

/**
 * Book and quill, writable by the player before being signed.
 */
public class ItemBookQuill extends Item {

    public ItemBookQuill() {
        this(0, 1);
    }

    public ItemBookQuill(Integer meta) {
        this(meta, 1);
    }

    public ItemBookQuill(Integer meta, int count) {
        super(BOOK_AND_QUILL, meta, count, "Book and Quill");
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
