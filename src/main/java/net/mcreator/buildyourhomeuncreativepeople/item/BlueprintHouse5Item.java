
package net.mcreator.buildyourhomeuncreativepeople.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.buildyourhomeuncreativepeople.BuildyourhomeUncreativePeopleModElements;

@BuildyourhomeUncreativePeopleModElements.ModElement.Tag
public class BlueprintHouse5Item extends BuildyourhomeUncreativePeopleModElements.ModElement {
	@ObjectHolder("buildyourhome__uncreative_people:blueprint_house_5")
	public static final Item block = null;
	public BlueprintHouse5Item(BuildyourhomeUncreativePeopleModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("blueprint_house_5");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
