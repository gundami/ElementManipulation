package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.Machines;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class RecipeTypes {
    public static final SlimefunItemStack INFO_BOOK = new SlimefunItemStack(
            "INFO_BOOK",
            Material.BOOK,
            ChatColor.GREEN + "信息",
            ChatColor.DARK_GREEN + "这是一本指南书"
    );
    public static final RecipeType EM_DECONSTRUCTOR = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_deconstructor_recipetype"), Machines.EMDeconstructor, "", "&8使用元素台提取");
    public static final RecipeType INFO = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_info_recipetype"), INFO_BOOK, "", ChatColor.DARK_GREEN + "这是一本指南书, 你需要按照 \"配方\" 的提示进行制作");
}
