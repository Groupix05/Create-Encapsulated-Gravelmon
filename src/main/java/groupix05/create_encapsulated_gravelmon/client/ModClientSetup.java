package groupix05.create_encapsulated_gravelmon.client;

import com.twispan.create_encapsulated.CreateEncapsulated;
import groupix05.create_encapsulated_gravelmon.registries.ModFluids;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

public class ModClientSetup {

    private static final int FROST_HEAL_COLOR = 0x93B3B7;

    public static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        ResourceLocation flow = ResourceLocation.fromNamespaceAndPath(CreateEncapsulated.MODID, "block/liquid_medium_flow");
        ResourceLocation still = ResourceLocation.fromNamespaceAndPath(CreateEncapsulated.MODID, "block/liquid_medium_still");

        registerFrostHealFluidRendering(event, ModFluids.FROST_HEAL_TYPE.get(), still, flow);
    }

    private static void registerFrostHealFluidRendering(
            RegisterClientExtensionsEvent event,
            FluidType fluidType,
            ResourceLocation still,
            ResourceLocation flow
    ) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            @Override
            public @NotNull ResourceLocation getStillTexture() { return still; }

            @Override
            public ResourceLocation getOverlayTexture() { return still; }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() { return flow; }

            @Override
            public int getTintColor() { return 0xFF000000 | ModClientSetup.FROST_HEAL_COLOR; }
        }, fluidType);
    }
}