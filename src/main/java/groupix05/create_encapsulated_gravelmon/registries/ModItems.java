package groupix05.create_encapsulated_gravelmon.registries;

import groupix05.create_encapsulated_gravelmon.CreateEncapsulatedGravelmon;
import net.minecraft.world.item.Item;
import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateEncapsulatedGravelmon.MODID);

    public static final boolean LOST_LORE_LOADED = LoadingModList.get().getModFileById("lost_lore") != null;

    public static final DeferredItem<Item> SPLITORANGEAPRICORN = ITEMS.register("split_orange_apricorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPLITPURPLEAPRICORN = ITEMS.register("split_purple_apricorn",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GS_BALL_LID = ITEMS.register("gs_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIME_BALL_LID = ITEMS.register("lime_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FISHING_BALL_LID = ITEMS.register("fishing_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEN2_LURE_BALL_LID = ITEMS.register("gen2_lure_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FEATHER_BALL_LID = ITEMS.register("feather_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUN_BALL_LID = ITEMS.register("sun_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DELTA_BALL_LID = ITEMS.register("delta_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NUCLEAR_BALL_LID = ITEMS.register("nuclear_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LAKE_BALL_LID = ITEMS.register("lake_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAWN_BALL_LID = ITEMS.register("dawn_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SNORE_BALL_LID = ITEMS.register("snore_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_BALL_LID = ITEMS.register("ancient_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> XENO_BALL_LID = ITEMS.register("xeno_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ATOM_BALL_LID = ITEMS.register("atom_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHINY_BALL_LID = ITEMS.register("shiny_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARK_BALL_LID = ITEMS.register("ark_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NUZLOCKE_BALL_LID = ITEMS.register("nuzlocke_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_MAUVE_BALL_LID = ITEMS.register("ancient_mauve_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENT_CORAL_BALL_LID = ITEMS.register("ancient_coral_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GAY_BALL_LID = ITEMS.register("gay_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LESBIAN_BALL_LID = ITEMS.register("lesbian_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BI_BALL_LID = ITEMS.register("bi_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PAN_BALL_LID = ITEMS.register("pan_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRANS_BALL_LID = ITEMS.register("trans_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NON_BINARY_BALL_LID = ITEMS.register("non_binary_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ACE_BALL_LID = ITEMS.register("ace_ball_lid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARO_BALL_LID = ITEMS.register("aro_ball_lid",
            () -> new Item(new Item.Properties()));

    @Nullable
    public static final DeferredItem<Item> MEWTWO_BALL_LID = LOST_LORE_LOADED
            ? ITEMS.register("mewtwo_ball_lid", () -> new Item(new Item.Properties())) : null;
}
