package cn.nukkit.item;

/**
 * Lead, ties mobs to fences and to the player.
 */
public class ItemLead extends Item {

    public ItemLead() {
        this(0, 1);
    }

    public ItemLead(Integer meta) {
        this(meta, 1);
    }

    public ItemLead(Integer meta, int count) {
        super(LEAD, meta, count, "Lead");
    }
}
