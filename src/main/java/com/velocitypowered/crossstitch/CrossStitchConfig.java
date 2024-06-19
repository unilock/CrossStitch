package com.velocitypowered.crossstitch;

import folk.sisby.kaleido.api.ReflectiveConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;
import folk.sisby.kaleido.lib.quiltconfig.api.values.TrackedValue;
import folk.sisby.kaleido.lib.quiltconfig.api.values.ValueList;
import net.fabricmc.loader.api.FabricLoader;

public class CrossStitchConfig extends ReflectiveConfig {
    public static final CrossStitchConfig CONFIG = CrossStitchConfig.createToml(FabricLoader.getInstance().getConfigDir(), "", "crossstitch", CrossStitchConfig.class);

    @Comment("List of Identifiers of ArgumentTypes to ignore")
    public final TrackedValue<ValueList<String>> ignored = list("", "brigadier:reallyunsupported", "minecraft:testargument");
}
