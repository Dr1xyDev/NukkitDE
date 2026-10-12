package cn.nukkit.item;

/**
 * Empty map, filled in the world to become a filled map.
 */
public class ItemEmptyMap extends Item {

    public ItemEmptyMap() {
        this(0, 1);
    }

    public ItemEmptyMap(Integer meta) {
        this(meta, 1);
    }

    public ItemEmptyMap(Integer meta, int count) {
        super(EMPTY_MAP, meta, count, "Empty Map");
    }
}
