package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.lucasgithuber.elementmanipulation.machines.EMJunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

public class Items {
    //elements
    //non-metals
    public static final SlimefunItemStack EMHydrogen = new SlimefunItemStack("EM_HYDROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>氢</gradient>")), "&91 &dH", "&8相对原子质量:1.008", "&a非金属元素");

    private static final Configuration cfg = ElementManipulation.i().getConfig();


    public static final SlimefunItemStack EMOxygen = new SlimefunItemStack("EM_OXYGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>氧</gradient>")), "&98 &dO", "&8相对原子质量:16.00", "&a非金属元素");


    public static final SlimefunItemStack EMCarbon = new SlimefunItemStack("EM_CARBON", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>碳</gradient>")), "&96 &dC", "&8相对原子质量:12.01", "&a非金属元素");


    public static final SlimefunItemStack EMNitrogen = new SlimefunItemStack("EM_NITROGEN", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>氮</gradient>")), "&97 &dN", "&8相对原子质量:14.01", "&a非金属元素");


    public static final SlimefunItemStack EMPhosphorus = new SlimefunItemStack("EM_PHOSPHORUS", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>磷</gradient>")), "&915 &dP", "&8相对原子质量:30.97", "&a非金属元素");


    public static final SlimefunItemStack EMSulfur = new SlimefunItemStack("EM_SULFUR", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>硫</gradient>")), "&916 &dS", "&8相对原子质量:32.06", "&a非金属元素");


    public static final SlimefunItemStack EMSelenium = new SlimefunItemStack("EM_SELENIUM", new ItemStack(Material.LIME_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#38CA08:#25FF09>硒</gradient>")), "&934 &dS	e", "&8相对原子质量:78.96", "&a非金属元素");


    //alkalines
    public static final SlimefunItemStack EMLithium = new SlimefunItemStack("EM_LITHIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>锂</gradient>")), "&93 &dLi", "&8相对原子质量:6.941", "&6碱金属");


    public static final SlimefunItemStack EMSodium = new SlimefunItemStack("EM_SODIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>钠</gradient>")), "&911 &dNa", "&8相对原子质量:22.99", "&6碱金属");


    public static final SlimefunItemStack EMPotassium = new SlimefunItemStack("EM_POTASSIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>钾</gradient>")), "&919 &dK", "&8相对原子质量:39.10", "&6碱金属");


    public static final SlimefunItemStack EMRubidium = new SlimefunItemStack("EM_RUBIDIUM,", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>铷</gradient>")), "&937 &dRb", "&8相对原子质量:85.47", "&6碱金属");


    public static final SlimefunItemStack EMCaesium = new SlimefunItemStack("EM_CAESIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>铯</gradient>")), "&955 &dCs", "&8相对原子质量:132.9", "&6碱金属");


    public static final SlimefunItemStack EMFrancium = new SlimefunItemStack("EM_FRANCIUM", new ItemStack(Material.ORANGE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#F3A33B:#FF953E>钫</gradient>")), "&987 &dFr", "&8相对原子质量:[223]", "&6碱金属");


    //halogens

    public static final SlimefunItemStack EMFluorine = new SlimefunItemStack("EM_FLUORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>氟</gradient>")), "&99 &dF", "&8相对原子质量:19.00", "&b卤族元素");


    public static final SlimefunItemStack EMChlorine = new SlimefunItemStack("CHLORINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>氯</gradient>")), "&917 &dCl", "&8相对原子质量:35.45", "&b卤族元素");


    public static final SlimefunItemStack EMBromine = new SlimefunItemStack("EM_BROMINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>溴</gradient>")), "&935 &dBr", "&8相对原子质量:79.90", "&b卤族元素");


    public static final SlimefunItemStack EMIodine = new SlimefunItemStack("EM_IODINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>碘</gradient>")), "&953 &dI", "&8相对原子质量:126.9", "&b卤族元素");


    public static final SlimefunItemStack EMAstatine = new SlimefunItemStack("EM_ASTATINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>砹</gradient>")), "&985 &dAt", "&8相对原子质量:[210]", "&b卤族元素");


    public static final SlimefunItemStack EMTennessine = new SlimefunItemStack("EM_TENNESSINE", new ItemStack(Material.CYAN_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EEFF00:#97FFE5>石田</gradient>")), "&9117 &dTs", "&8相对原子质量:[294]", "&b卤族元素");

    //elements/alkaline-earths
    public static final SlimefunItemStack EMBerilium = new SlimefunItemStack("EM_BERILIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>铍</gradient>")), "&94 &dBe", "&8相对原子质量:9.012", "&e碱土金属");

    public static final SlimefunItemStack EMMagnesium = new SlimefunItemStack("EM_MAGNESIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>镁</gradient>")), "&912 &dMg", "&8相对原子质量:24.31", "&e碱土金属");

    public static final SlimefunItemStack EMCalcium = new SlimefunItemStack("EM_CALCIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>钙</gradient>")), "&920 &dCa", "&8相对原子质量:40.08", "&e碱土金属");

    public static final SlimefunItemStack EMStrontium = new SlimefunItemStack("EM_STRONTIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>锶</gradient>")), "&938 &dSr", "&8相对原子质量:87.62", "&e碱土金属");

    public static final SlimefunItemStack EMRadium = new SlimefunItemStack("EM_RADIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>镭</gradient>")), "&988 &dRa", "&8相对原子质量:[226]", "&e碱土金属");

    public static final SlimefunItemStack EMBarium = new SlimefunItemStack("EM_BARIUM", new ItemStack(Material.YELLOW_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#EDE342:#BBB816>钡</gradient>")), "&956 &dBa", "&8相对原子质量:137.3", "&e碱土金属");
    //elements/semi-metals
    public static final SlimefunItemStack EMBoron = new SlimefunItemStack("EM_BORON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>硼</gradient>")), "&95 &dB", "&8相对原子质量:10.81", "&3类金属");

    public static final SlimefunItemStack EMSilicon = new SlimefunItemStack("EM_SILICON", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>硅</gradient>")), "&914 &dSi", "&8相对原子质量:28.09", "&3类金属");

    public static final SlimefunItemStack EMGermanium = new SlimefunItemStack("EM_GERMANIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>锗</gradient>")), "&932 &dGe", "&8相对原子质量:72.63", "&7类金属");

    public static final SlimefunItemStack EMArsenic = new SlimefunItemStack("EM_ARSENIC", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>砷</gradient>")), "&933 &dAs", "&8相对原子质量:74.92", "&3类金属");

    public static final SlimefunItemStack EMAntimony = new SlimefunItemStack("EM_ANTIMONY", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>锑</gradient>")), "&951 &dSb", "&8相对原子质量:121.8", "&3类金属");

    public static final SlimefunItemStack EMTellurium = new SlimefunItemStack("EM_TELLURIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>碲</gradient>")), "&952 &dTe", "&8相对原子质量:127.6", "&3类金属");

    public static final SlimefunItemStack EMPolonium = new SlimefunItemStack("EM_POLONIUM", new ItemStack(Material.LIGHT_BLUE_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#48A5B6:#1162A9>钋</gradient>")), "&984 &dPo", "&8相对原子质量:[209]", "&3类金属");
    //elements/others
    public static final SlimefunItemStack EMAluminum = new SlimefunItemStack("EM_ALUMINUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>铝</gradient>")), "&913 &dAl", "&8相对原子质量:26.98", "&7后过渡金属");

    public static final SlimefunItemStack EMGallium = new SlimefunItemStack("EM_GALLIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>镓</gradient>")), "&931 &dGa", "&8相对原子质量:69.72", "&7后过渡金属");

    public static final SlimefunItemStack EMIndium = new SlimefunItemStack("EM_INDIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>铟</gradient>")), "&949 &dIn", "&8相对原子质量:114.8", "&7后过渡金属");

    public static final SlimefunItemStack EMThallium = new SlimefunItemStack("EM_THALLIM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>铊</gradient>")), "&981 &dTl", "&8相对原子质量:204.4", "&7后过渡金属");

    public static final SlimefunItemStack EMNihonium = new SlimefunItemStack("EM_NIHONIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>镍</gradient>")), "&928 &dN	i", "&8相对原子质量:58.69", "&7过渡金属");

    public static final SlimefunItemStack EMTin = new SlimefunItemStack("EM_TIN", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>锌</gradient>")), "&930 &dZn", "&8相对原子质量:65.38", "&7过渡金属");

    public static final SlimefunItemStack EMLead = new SlimefunItemStack("EM_LEAD", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>铅</gradient>")), "&982 &dPb", "&8相对原子质量:207.2", "&7后过渡金属");

    public static final SlimefunItemStack EMFlerovium = new SlimefunItemStack("EM_FLEROVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>鈇</gradient>")), "&9114 &dFl", "&8相对原子质量:[289]", "&7后过渡元素");

    public static final SlimefunItemStack EMBismuth = new SlimefunItemStack("EM_BISMUTH", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>铋</gradient>")), "&983 &dBi", "&8相对原子质量:209.0", "&7后过渡元素");

    public static final SlimefunItemStack EMMoscovium = new SlimefunItemStack("EM_MOSCOVIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>镆</gradient>")), "&9115 &dMc", "&8相对原子质量:[288]", "&7后过渡元素");

    public static final SlimefunItemStack EMLivermorium = new SlimefunItemStack("EM_LIVERMORIUM", new ItemStack(Material.GRAY_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#8B8B8B:#6E6E6E>鉝</gradient>")), "&9116 &dLv", "&8相对原子质量:[293]", "&7后过渡金属");
    //elements/transition metals
    public static final SlimefunItemStack EMCopper = new SlimefunItemStack("EM_COPPER", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>铜</gradient>")), "&929 &dCu", "&8相对原子质量:63.55", "&7过渡金属");
    public static final SlimefunItemStack EMAu = new SlimefunItemStack("EM_GOLD", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>金</gradient>")), "&979 &dAu", "&8相对原子质量:197.0", "&7过渡金属");
    public static final SlimefunItemStack EMScandium = new SlimefunItemStack("EM_SCANDIUM", new ItemStack(Material.MAGENTA_DYE), BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#f08080:#ffdab9>钪</gradient>")), "&921 &dSc", "&8相对原子质量:44.96", "&7过渡金属");
//machines


    public static final SlimefunItemStack EMDeconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.LOOM, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.parse("<gradient:#000000:#FFFFFF>元素台</gradient>")), "&8将物品解构成元素",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));


    public static final SlimefunItemStack EMJunctionTable= new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&a聚构机",
            "&7将元素聚构成物品",
            "",
            MachineLore.energy(4096) + "/物品"
    );

    public static void setup(ElementManipulation em) {
        new EMJunctionTable(Categories.EMMachines, EMJunctionTable, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null, null, SlimefunItems.FISH_JERKY, null, null, null, null
        }, 4096).register(em);
    }
}
