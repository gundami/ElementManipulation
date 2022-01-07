package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Items;
import org.bukkit.NamespacedKey;

public class RecipeTypes {
    public static final RecipeType EM_DECONSTRUCTOR = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_deconstructor_recipetype"), Items.EMDeconstructor, "", "&8使用元素台提取");
    public static final RecipeType EM_JUNCTIONTABLE = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_junctiontable_recipetype"), Items.EMJunctionTable, "", "&8使用聚构机连合");
}
