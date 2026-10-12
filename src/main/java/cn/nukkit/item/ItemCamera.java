package cn.nukkit.item;

/**
 * Camera, placed by the player to record the world.
 */
public class ItemCamera extends Item {

    public ItemCamera() {
        this(0, 1);
    }

    public ItemCamera(Integer meta) {
        this(meta, 1);
    }

    public ItemCamera(Integer meta, int count) {
        super(CAMERA, meta, count, "Camera");
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
