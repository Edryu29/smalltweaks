package net.edryu.smalltweaks;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "smalltweaks")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class SmallTweaksConfig implements ConfigData {
    @Comment("Default: 96000 - Vanilla: 24000")
    public int VillagerGrowUpTime = 96000;
    @Comment("Default: 60000 - Vanilla: 24000")
    public int AnimalBredGrowUpTime = 60000;
    @Comment("Default: 36000 - Vanilla: 24000")
    public int AnimalSpawnedGrowUpTime = 36000;
}