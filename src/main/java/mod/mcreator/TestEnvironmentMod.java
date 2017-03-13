package mod.mcreator;

import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.IFuelHandler;

@Mod(modid = TestEnvironmentMod.MODID, version = TestEnvironmentMod.VERSION)
public class TestEnvironmentMod implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "TestEnvironmentMod";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "mod.mcreator.ClientProxyTestEnvironmentMod", serverSide = "mod.mcreator.CommonProxyTestEnvironmentMod")
	// @SidedProxy(clientSide="mod.mcreator.ClientProxyTestEnvironmentMod",
	// serverSide="mod.mcreator.CommonProxyTestEnvironmentMod")
	public static CommonProxyTestEnvironmentMod proxy;
	// public static EnumMap<Side, FMLEmbeddedChannel> channels =
	// NetworkRegistry.INSTANCE.newChannel("MCRBUS", new
	// ChannelHandlerTestEnvironmentMod());

	@Instance(MODID)
	public static TestEnvironmentMod instance;

	mcreator_charmOfMagic mcreator_0 = new mcreator_charmOfMagic();
	mcreator_newWorldTab mcreator_1 = new mcreator_newWorldTab();
	mcreator_charmOfGluttony mcreator_2 = new mcreator_charmOfGluttony();
	mcreator_charmOfGreed mcreator_3 = new mcreator_charmOfGreed();
	mcreator_charmOfLust mcreator_4 = new mcreator_charmOfLust();
	mcreator_charmOfEnvy mcreator_5 = new mcreator_charmOfEnvy();
	mcreator_charmOfPride mcreator_6 = new mcreator_charmOfPride();
	mcreator_charmOfWrath mcreator_7 = new mcreator_charmOfWrath();
	mcreator_charmOfSloth mcreator_8 = new mcreator_charmOfSloth();
	mcreator_charmOfDevil mcreator_9 = new mcreator_charmOfDevil();

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (mcreator_0.addFuel(fuel) != 0)
			return mcreator_0.addFuel(fuel);
		if (mcreator_1.addFuel(fuel) != 0)
			return mcreator_1.addFuel(fuel);
		if (mcreator_2.addFuel(fuel) != 0)
			return mcreator_2.addFuel(fuel);
		if (mcreator_3.addFuel(fuel) != 0)
			return mcreator_3.addFuel(fuel);
		if (mcreator_4.addFuel(fuel) != 0)
			return mcreator_4.addFuel(fuel);
		if (mcreator_5.addFuel(fuel) != 0)
			return mcreator_5.addFuel(fuel);
		if (mcreator_6.addFuel(fuel) != 0)
			return mcreator_6.addFuel(fuel);
		if (mcreator_7.addFuel(fuel) != 0)
			return mcreator_7.addFuel(fuel);
		if (mcreator_8.addFuel(fuel) != 0)
			return mcreator_8.addFuel(fuel);
		if (mcreator_9.addFuel(fuel) != 0)
			return mcreator_9.addFuel(fuel);
		return 0;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;
		if (world.provider.dimensionId == -1)
			mcreator_0.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_0.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_1.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_1.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_2.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_2.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_3.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_3.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_4.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_4.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_5.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_5.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_6.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_6.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_7.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_7.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_8.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_8.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == -1)
			mcreator_9.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.dimensionId == 0)
			mcreator_9.generateSurface(world, random, chunkX, chunkZ);

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 1);
		MinecraftForge.EVENT_BUS.register(new mcreator_GlobalEventsTestEnvironmentMod());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		mcreator_0.load();
		mcreator_1.load();
		mcreator_2.load();
		mcreator_3.load();
		mcreator_4.load();
		mcreator_5.load();
		mcreator_6.load();
		mcreator_7.load();
		mcreator_8.load();
		mcreator_9.load();

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		mcreator_0.serverLoad(event);
		mcreator_1.serverLoad(event);
		mcreator_2.serverLoad(event);
		mcreator_3.serverLoad(event);
		mcreator_4.serverLoad(event);
		mcreator_5.serverLoad(event);
		mcreator_6.serverLoad(event);
		mcreator_7.serverLoad(event);
		mcreator_8.serverLoad(event);
		mcreator_9.serverLoad(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		mcreator_0.instance = this.instance;
		mcreator_1.instance = this.instance;
		mcreator_2.instance = this.instance;
		mcreator_3.instance = this.instance;
		mcreator_4.instance = this.instance;
		mcreator_5.instance = this.instance;
		mcreator_6.instance = this.instance;
		mcreator_7.instance = this.instance;
		mcreator_8.instance = this.instance;
		mcreator_9.instance = this.instance;
		mcreator_0.preInit(event);
		mcreator_1.preInit(event);
		mcreator_2.preInit(event);
		mcreator_3.preInit(event);
		mcreator_4.preInit(event);
		mcreator_5.preInit(event);
		mcreator_6.preInit(event);
		mcreator_7.preInit(event);
		mcreator_8.preInit(event);
		mcreator_9.preInit(event);
		proxy.registerRenderers(this);
	}

	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}

}
