package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.items.Materials;
import me.lucasgithuber.elementmanipulation.machines.Machines;
import me.lucasgithuber.elementmanipulation.misc.MiscItems;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import org.bstats.bukkit.Metrics;

public final class ElementManipulation extends AbstractAddon {

    private static ElementManipulation i;

    public static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                    .resolver(StandardTags.color())
                    .resolver(StandardTags.decorations())
                    .resolver(StandardTags.gradient())
                    .resolver(StandardTags.rainbow())
                    .build()
            )
            .build();

    public ElementManipulation() {
        super("haiman233", "Element-Manipulation-CN", "master", "options.auto-update");
    }

    @Override
    public void enable() {
        i = this;
        // Setup
        Categories.setup(this);
        Elements.setup(this);
        Materials.setup(this);
        Machines.setup(this);
        MiscItems.setup(this);
        //Drugs.setup(this);
        /*PortalCorners.setup(this);*/
        new Metrics(this, 13718);
    }

    @Override
    public void disable() {
        // Set instance to null
        i = null;
    }

    public static ElementManipulation i() {
        return i;
    }
}