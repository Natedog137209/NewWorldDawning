package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class mcreator_newWorldTab {

	public Object instance;

	public static CreativeTabs tab = new CreativeTabs("tabnewWorldTab") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return mcreator_charmOfMagic.block;
		}
	};

	public mcreator_newWorldTab() {
	}

	public void load() {
	}

	public void registerRenderers() {
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

}
