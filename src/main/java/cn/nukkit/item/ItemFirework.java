package cn.nukkit.item;

/**
 * Firework rocket, used for flying with elytra and celebrations.
 */
public class ItemFirework extends Item {

    public ItemFirework() {
        this(0, 1);
    }

    public ItemFirework(Integer meta) {
        this(meta, 1);
    }

    public ItemFirework(Integer meta, int count) {
        super(FIREWORK, meta, count, "Firework Rocket");
    }
}
