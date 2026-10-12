package cn.nukkit.item;

/**
 * Firework star, defines the color and effect of a firework rocket.
 */
public class ItemFireworkStar extends Item {

    public ItemFireworkStar() {
        this(0, 1);
    }

    public ItemFireworkStar(Integer meta) {
        this(meta, 1);
    }

    public ItemFireworkStar(Integer meta, int count) {
        super(FIREWORK_STAR, meta, count, "Firework Star");
    }
}
