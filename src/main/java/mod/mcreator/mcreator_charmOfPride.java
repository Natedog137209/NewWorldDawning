package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.Block;

import java.util.Random;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unchecked")
public class CharmOfPride {

	public CharmOfPride() {
	}

	public static Item block;
	public static Object instance;

	public void load() {
          
          GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{" X ", " S ", " R ", 'X', <Botania:manaResource:16>, 'S', <ForbiddenMagic:PrideShard> 'R', <Botania:rune:15>});
     }

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	static {
		block = (new ItemcharmOfPride(429));
		Item.itemRegistry.addObject(429, "CharmOfPride", block);

	}

	static class ItemcharmOfPride extends Item {

		public ItemcharmOfPride(int par1) {
			setMaxDamage(0);
			maxStackSize = 16;
			setUnlocalizedName("CharmOfPride");
			setTextureName("Charm of Pride");
			setCreativeTab(mcreator_newWorldTab.tab);
		}

		public int getItemEnchantability() {
			return 0;
		}

		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
			return 1.0F;
		}

	}
}
