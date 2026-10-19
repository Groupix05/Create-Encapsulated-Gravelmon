package groupix05.create_encapsulated_gravelmon;

import com.itsfirestorm.world_of_color.api.BottleFillRegistry;
import com.twispan.create_encapsulated.util.FluidItemHandler;
import groupix05.create_encapsulated_gravelmon.client.ModClientSetup;
import groupix05.create_encapsulated_gravelmon.registries.ModFluids;
import groupix05.create_encapsulated_gravelmon.registries.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.fluids.FluidStack;

import java.util.List;

@Mod(CreateEncapsulatedGravelmon.MODID)
public class CreateEncapsulatedGravelmon {
    public static final String MODID = "create_encapsulated_gravelmon";

    private static final ResourceKey<CreativeModeTab> CREATEENCAPSULATED_ITEMS_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath("create_encapsulated", "createencapsulated_items_tab")
    );

    public CreateEncapsulatedGravelmon(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::registerCapabilities);
        modEventBus.addListener(this::commonSetup);
        ModFluids.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(ModClientSetup::onRegisterClientExtensions);
        }
    }

    private void registerFrostHealBottleFill() {
        BottleFillRegistry.register(
                stack -> stack.getFluid() == ModFluids.FROST_HEAL.get(),
                stack -> new ItemStack(
                        BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("gravelmon", "frost_heal"))
                ),
                () -> List.of(new FluidStack(ModFluids.FROST_HEAL.get(), 1))
        );
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(this::registerFrostHealBottleFill);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CREATEENCAPSULATED_ITEMS_TAB) {
            event.accept(ModItems.SPLITORANGEAPRICORN);
            event.accept(ModItems.SPLITPURPLEAPRICORN);
            event.accept(ModItems.GS_BALL_LID);
            event.accept(ModItems.LIME_BALL_LID);
            event.accept(ModItems.FISHING_BALL_LID);
            event.accept(ModItems.GEN2_LURE_BALL_LID);
            event.accept(ModItems.FEATHER_BALL_LID);
            event.accept(ModItems.SUN_BALL_LID);
            event.accept(ModItems.DELTA_BALL_LID);
            event.accept(ModItems.NUCLEAR_BALL_LID);
            event.accept(ModItems.LAKE_BALL_LID);
            event.accept(ModItems.DAWN_BALL_LID);
            event.accept(ModItems.SNORE_BALL_LID);
            event.accept(ModItems.ANCIENT_BALL_LID);
            event.accept(ModItems.XENO_BALL_LID);
            event.accept(ModItems.ATOM_BALL_LID);
            event.accept(ModItems.SHINY_BALL_LID);
            event.accept(ModItems.ARK_BALL_LID);
            event.accept(ModItems.NUZLOCKE_BALL_LID);
            event.accept(ModItems.ANCIENT_MAUVE_BALL_LID);
            event.accept(ModItems.ANCIENT_CORAL_BALL_LID);
            event.accept(ModItems.GAY_BALL_LID);
            event.accept(ModItems.LESBIAN_BALL_LID);
            event.accept(ModItems.BI_BALL_LID);
            event.accept(ModItems.PAN_BALL_LID);
            event.accept(ModItems.TRANS_BALL_LID);
            event.accept(ModItems.NON_BINARY_BALL_LID);
            event.accept(ModItems.ACE_BALL_LID);
            event.accept(ModItems.ARO_BALL_LID);
            if (ModItems.MEWTWO_BALL_LID != null) {
                event.accept(ModItems.MEWTWO_BALL_LID);
            }
        }
    }

    private void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerItem(
                Capabilities.FluidHandler.ITEM,
                (stack, context) -> new FluidItemHandler(stack,
                        new FluidStack(ModFluids.FROST_HEAL.get(), 250)),
                BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("gravelmon", "frost_heal"))
        );
    }
}
