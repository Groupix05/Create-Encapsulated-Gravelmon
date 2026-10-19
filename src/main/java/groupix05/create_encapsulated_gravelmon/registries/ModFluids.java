package groupix05.create_encapsulated_gravelmon.registries;

import groupix05.create_encapsulated_gravelmon.CreateEncapsulatedGravelmon;
import groupix05.create_encapsulated_gravelmon.fluid.FrostHealFluidType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, CreateEncapsulatedGravelmon.MODID);

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateEncapsulatedGravelmon.MODID);

    public static final DeferredHolder<FluidType, FrostHealFluidType> FROST_HEAL_TYPE =
            FLUID_TYPES.register("frost_heal", () -> new FrostHealFluidType(
                    FluidType.Properties.create()
                            .density(2000)
                            .viscosity(6000)
                            .temperature(300)
            ));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> FROST_HEAL =
            FLUIDS.register("frost_heal", () -> new BaseFlowingFluid.Source(ModFluids.FROST_HEAL_PROPERTIES));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FROST_HEAL_FLOWING =
            FLUIDS.register("frost_heal_flowing", () -> new BaseFlowingFluid.Flowing(ModFluids.FROST_HEAL_PROPERTIES));

    public static final BaseFlowingFluid.Properties FROST_HEAL_PROPERTIES =
            new BaseFlowingFluid.Properties(FROST_HEAL_TYPE, FROST_HEAL, FROST_HEAL_FLOWING);
}