package cn.nukkit.item;

/**
 * Fire charge, ignites blocks and can be shot from dispensers.
 */
public class ItemFireCharge extends Item {

    public ItemFireCharge() {
        this(0, 1);
    }

    public ItemFireCharge(Integer meta) {
        this(meta, 1);
    }

    public ItemFireCharge(Integer meta, int count) {
        super(FIRE_CHARGE, meta, count, "Fire Charge");
    }
}
