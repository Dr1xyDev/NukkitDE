package cn.nukkit.block;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityDamageByBlockEvent;
import cn.nukkit.event.entity.EntityDamageEvent.DamageCause;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import cn.nukkit.potion.Effect;
import cn.nukkit.utils.BlockColor;

/**
 * Magma block, burns entities standing on it unless they resist fire.
 */
public class BlockMagma extends BlockSolid {

    public BlockMagma() {
        this(0);
    }

    public BlockMagma(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return MAGMA_BLOCK;
    }

    @Override
    public String getName() {
        return "Magma Block";
    }

    @Override
    public double getHardness() {
        return 0.5;
    }

    @Override
    public double getResistance() {
        return 0.5;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public int getLightLevel() {
        return 3;
    }

    @Override
    public boolean hasEntityCollision() {
        return true;
    }

    @Override
    public void onEntityCollide(Entity entity) {
        if (entity.ticksLived % 10 != 0 || entity.hasEffect(Effect.FIRE_RESISTANCE)) {
            return;
        }

        entity.attack(new EntityDamageByBlockEvent(this, entity, DamageCause.FIRE, 1));
    }

    @Override
    public Item[] getDrops(Item item) {
        if (item.isPickaxe() && item.getTier() >= ItemTool.TIER_WOODEN) {
            return new Item[]{
                    Item.get(MAGMA_BLOCK, 0, 1)
            };
        } else {
            return new Item[0];
        }
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.ADOBE_BLOCK_COLOR;
    }
}
