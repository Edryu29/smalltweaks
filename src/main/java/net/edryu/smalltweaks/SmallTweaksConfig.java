package net.edryu.smalltweaks;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "smalltweaks")
public class SmallTweaksConfig implements ConfigData {
    @Comment("Villager Grow Up time. Default = 72000 (120 minutes)")
    public int VillagerGrowUp = 96000;
    @Comment("Passive breeded Animals Grow Up time. Default = 72000 (60 minutes)")
    public int AnimalBreedGrowUp = 72000;
    @Comment("Passive wild Animals Grow Up time. Default = 72000 (40 minutes)")
    public int AnimalWildGrowUp = 48000;
}