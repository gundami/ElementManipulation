package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.items.EMMaterials;
import me.lucasgithuber.elementmanipulation.utils.Metrics;
import net.kyori.adventure.text.minimessage.MiniMessage;

import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;

public final class ElementManipulation extends AbstractAddon{

    private static ElementManipulation i;

    public static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                    .resolver(StandardTags.color())
                    .resolver(StandardTags.decorations())
                    .resolver(StandardTags.gradient())
                    .build()
            )
            .build();

    public ElementManipulation() {
        super("haiman233", "Element-Manipulation-CN", "master", "options.auto-update");
    }

    @Override
    public void enable() {
        i = this;
        // Setup items
        Setup.setup(this);
        Elements.setup(this);
        EMMaterials.setup(this);
        Items.setup(this);
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