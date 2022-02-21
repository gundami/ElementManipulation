    package me.lucasgithuber.elementmanipulation.items;

    import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
    import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
    import lombok.Getter;
    import me.lucasgithuber.elementmanipulation.ElementManipulation;
    import me.lucasgithuber.elementmanipulation.utils.Categories;
    import org.bukkit.Material;
    import org.bukkit.inventory.ItemStack;

    import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

    public final class EMMaterials {
    @Getter
    private static EMRedstone emRedstone;
    @Getter
    private static EMLapis emLapis;
    @Getter
    private static EMEmerald emEmerald;

    public static final SlimefunItemStack EMWaterBucket = new SlimefunItemStack(
        "EM_WATERBUCKET",
        Material.WATER_BUCKET,
        "&f化工水桶",
        "&f一种普通的水桶",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMCarrot = new SlimefunItemStack(
        "EM_CARROT",
        Material.CARROT,
        "&f化工胡萝卜",
        "&f一种普通的胡萝",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMCocoa = new SlimefunItemStack(
        "EM_COCOA",
        Material.COCOA_BEANS,
        "&f化工可可豆",
        "&f一种普通的可可豆",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMNetherWart = new SlimefunItemStack(
        "EM_WART",
        Material.NETHER_WART,
        "&f化工地狱疣",
        "&f一种普通的地狱疣",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMPotato = new SlimefunItemStack(
        "EM_POTATO",
        Material.POTATO,
        "&f化工马铃薯",
        "&f一种普通的马铃薯",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMPumpkinSeeds = new SlimefunItemStack(
        "EM_PUMPKIN_SEEDS",
        Material.PUMPKIN_SEEDS,
        "&f化工南瓜种子",
        "&f一种普通的南瓜种子",
        "&f可在工作台内使用"
    );


    public static final SlimefunItemStack EMRedstone = new SlimefunItemStack(
        "EM_REDSTONE",
        Material.REDSTONE,
        "&f化工红石",
        "&f一种普通的红石",
        "&f可在工作台内使用"
    );

    public static final SlimefunItemStack EMSweetBerries = new SlimefunItemStack(
        "EM_BERRIES",
        Material.SWEET_BERRIES,
        "&f化工甜浆果",
        "&f一种普通的甜浆果",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMWheatSeeds = new SlimefunItemStack(
        "EM_WHEAT_SEEDS",
        Material.WHEAT_SEEDS,
        "&f化工小麦种子",
        "&f一种普通的小麦种子",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMApple = new SlimefunItemStack(
        "EM_APPLE",
        Material.APPLE,
        "&f化工苹果",
        "&f一种普通的苹果",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMBeetrootSeeds = new SlimefunItemStack(
        "EM_BEETROOT_SEEDS",
        Material.BEETROOT_SEEDS,
        "&f化工甜菜种子",
        "&f一种普通的甜菜种子",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMBone = new SlimefunItemStack(
        "EM_BONE",
        Material.BONE,
        "&f化工骨头",
        "&f一种普通的骨头",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMGold = new SlimefunItemStack(
        "EM_GOLD",
        Material.GOLD_INGOT,
        "&f化工金锭",
        "&f一种普通的金锭",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMHoneyBottle = new SlimefunItemStack(
        "EM_HONEY",
        Material.HONEY_BOTTLE,
        "&f化工蜂蜜瓶",
        "&f一种普通的蜂蜜瓶",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMInkSac = new SlimefunItemStack(
        "EM_INK",
        Material.INK_SAC,
        "&f化工墨囊",
        "&f一种普通的墨囊",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMLapisLazuli = new SlimefunItemStack(
        "EM_LAPIS",
        Material.LAPIS_LAZULI,
        "&f化工青金石",
        "&f一种普通的青金石",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMMelonSeeds = new SlimefunItemStack(
        "EM_MELON_SEEDS",
        Material.MELON_SLICE,
        "&fMelon seeds",
        "&fNormal melon seeds",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMPoisonPotato = new SlimefunItemStack(
        "EM_POISON_POTATO",
        Material.POISONOUS_POTATO,
        "&fPoisonous potato",
        "&fNormal poisonous potato",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMSugar = new SlimefunItemStack(
        "EM_SUGAR",
        Material.SUGAR,
        "&fSugar",
        "&fNormal sugar",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMClay = new SlimefunItemStack(
        "EM_CLAY",
        Material.CLAY_BALL,
        "&fClay ball",
        "&fNormal clay",
        "&fUsable in vanilla workbench"
    );
    public static final SlimefunItemStack EMCoal = new SlimefunItemStack(
        "EM_COAL",
        Material.COAL,
        "&fCoal",
        "&fNormal coal",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMDiamond = new SlimefunItemStack(
        "EM_DIAMOND",
        Material.DIAMOND,
        "&fDiamond",
        "&fNormal diamond",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMEmerald = new SlimefunItemStack(
        "EM_EMERALD",
        Material.EMERALD,
        "&fEmerald",
        "&fNormal emerald",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMFlint = new SlimefunItemStack(
        "EM_FLINT",
        Material.FLINT,
        "&fFlint",
        "&fNormal flint",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMGhastTear= new SlimefunItemStack(
        "EM_TEAR",
        Material.GHAST_TEAR,
        "&fGhast tear",
        "&fNormal tear",
        "&f可在工作台内使用"
    );
    public static final SlimefunItemStack EMQuartz = new SlimefunItemStack(
        "EM_QUARTZ",
        Material.QUARTZ,
        "&fNether quartz",
        "&fNormal nether quartz",
        "&f可在工作台内使用"
    );



    public static void setup(ElementManipulation em){

    new EMItem(Categories.EMJunctionCheat, EMCarrot,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,null,     null,     null,    null,  CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,HYDROGEN,HYDROGEN,null,      CARBON,
            CARBON,null,     null,     null,    null,      CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCocoa,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON, null,    null,    null,    null,    CARBON,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,    NITROGEN,
            NITROGEN,    null,    OXYGEN, OXYGEN,     null,         NITROGEN,
            HYDROGEN, null,  null,    null,    null,              HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMNetherWart,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,OXYGEN,  OXYGEN,  HYDROGEN, CARBON,
            CARBON,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN, CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPotato,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,null,null,null,null,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,null,null,null,null,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPumpkinSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,      HYDROGEN,null,null,null,
            null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,null,           OXYGEN,OXYGEN,null,
            null,null,null,           OXYGEN,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone = new EMRedstone(Categories.EMJunctionCheat, EMRedstone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
            null,SlimefunItems.PLASTIC_SHEET,EMCopper,EMCopper,SlimefunItems.PLASTIC_SHEET,null,
    }, new SlimefunItemStack(EMRedstone, 64));
    new EMItem(Categories.EMJunctionCheat,EMSweetBerries,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,HYDROGEN,null,null,            HYDROGEN,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,                       HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,           CARBON,
            CARBON,CARBON,null,null,   CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWheatSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,CARBON,null,null,null,
            null,CARBON,CARBON,null,null,null,
            null,null,null,OXYGEN,OXYGEN,null,
            null,null,null,OXYGEN,null,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMApple,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,      null,      OXYGEN,null,null,
            null,HYDROGEN,HYDROGEN,OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,  OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,      OXYGEN,CARBON,null,
            null,HYDROGEN,OXYGEN,     CARBON,CARBON,null,
            null,null,      OXYGEN,      null,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBeetrootSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,null,null,null,null,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,OXYGEN,OXYGEN,HYDROGEN,CARBON,
            CARBON,HYDROGEN,null,null,HYDROGEN,CARBON,
            CARBON,null,null,null,null,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMBone,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,
            null,OXYGEN,CALCIUM, CALCIUM,OXYGEN,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMGold,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
            null,null,EMAu,EMAu,null,null,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMHoneyBottle,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
            CARBON,null,HYDROGEN,HYDROGEN,null,OXYGEN,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMInkSac,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,null,
            null,null,null,null,null,null,
    }).setUseableInWorkbench(true).register(em);

    emLapis = new EMLapis(Categories.EMJunctionCheat, EMLapisLazuli,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,CALCIUM,
            SODIUM,EMAluminum,new ItemStack(Material.BLUE_DYE),new ItemStack(Material.BLUE_DYE),EMAluminum,CALCIUM,
            SODIUM,SILICON,SULFUR,SULFUR,SILICON,CALCIUM,
            SODIUM,SODIUM,OXYGEN,OXYGEN,CALCIUM,CALCIUM,
    }, new SlimefunItemStack(EMLapisLazuli, 64));
    new EMItem(Categories.EMJunctionCheat, EMMelonSeeds,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,HYDROGEN,HYDROGEN,null,null,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            null,HYDROGEN,CARBON,CARBON,HYDROGEN,null,
            null,null,HYDROGEN,HYDROGEN,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMPoisonPotato,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,EMSilver,null,null,CARBON,HYDROGEN,
            HYDROGEN,null,OXYGEN,OXYGEN,null,HYDROGEN,
            CARBON,null,OXYGEN,OXYGEN,null,CARBON,
            CARBON,CARBON,null,null,NITROGEN,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMSugar,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,OXYGEN,OXYGEN,CARBON,HYDROGEN,
            HYDROGEN,CARBON,CARBON,CARBON,CARBON,HYDROGEN,
            HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN,HYDROGEN
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMClay,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMCoal,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON,
            CARBON,CARBON,CARBON,CARBON,CARBON,CARBON
    }).setUseableInWorkbench(true).register(em);
    emEmerald = new EMEmerald(Categories.EMJunctionCheat, EMEmerald,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            BERYLLIUM,BERYLLIUM,SILICON,SILICON,OXYGEN,OXYGEN,
            BERYLLIUM,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            SILICON,SILICON,SILICON,SILICON,SILICON,SILICON,
            EMAluminum,SILICON,SILICON,SILICON,SILICON,OXYGEN,
            EMAluminum,EMAluminum,SILICON,SILICON,OXYGEN,OXYGEN,
    }, new SlimefunItemStack(EMEmerald, 64));
    new EMItem(Categories.EMJunctionCheat, EMFlint,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,null,OXYGEN,null,null,
            null,null,OXYGEN,SILICON,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMGhastTear,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,HYDROGEN,HYDROGEN,null,null,null,
            null,null,HYDROGEN,SODIUM,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMWaterBucket,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,HYDROGEN,null,null,
            null,null,HYDROGEN,new ItemStack(Material.BUCKET),null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);
    new EMItem(Categories.EMJunctionCheat, EMQuartz,  me.lucasgithuber.elementmanipulation.machines.EMJunctionTable.TYPE, new ItemStack[] {
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,OXYGEN,null,null,null,
            null,null,SILICON,OXYGEN,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null
    }).setUseableInWorkbench(true).register(em);

    emRedstone.setUseableInWorkbench(true).register(em);
    emLapis.setUseableInWorkbench(true).register(em);
    emEmerald.setUseableInWorkbench(true).register(em);
    }
}