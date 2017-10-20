package thebetweenlands.common.recipe.misc;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;
import thebetweenlands.api.aspect.ItemAspectContainer;
import thebetweenlands.common.item.herblore.ItemAspectVial;
import thebetweenlands.common.registries.ItemRegistry;

public class RecipesAspectVials extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        ItemStack vial = null;
        for (int i = 0; i < inv.getSizeInventory(); ++i) {
            ItemStack stack = inv.getStackInSlot(i);
            if(!stack.isEmpty()) {
                if(stack.getItem() instanceof ItemAspectVial && ItemAspectContainer.fromItem(stack).getAspects().size() == 1) {
                    if(vial != null) {
                        return false;
                    }
                    vial = stack;
                } else {
                    return false;
                }
            }
        }
        return vial != null;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ItemStack vial = ItemStack.EMPTY;
        for (int i = 0; i < inv.getSizeInventory(); ++i) {
            ItemStack stack = inv.getStackInSlot(i);
            if(!stack.isEmpty()) {
                if(stack.getItem() instanceof ItemAspectVial && ItemAspectContainer.fromItem(stack).getAspects().size() == 1) {
                    vial = stack;
                }
            }
        }
        return new ItemStack(ItemRegistry.DENTROTHYST_VIAL, vial.getCount(), vial.getItemDamage() == 1 ? 2 : 0);
    }

    @Override
    public boolean isDynamic() {
        return true;
    }

    @Override
    public boolean canFit(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return ItemStack.EMPTY;
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
        return NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);
    }
}
