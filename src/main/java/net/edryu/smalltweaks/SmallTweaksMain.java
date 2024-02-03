package net.edryu.smalltweaks;

import net.fabricmc.api.ModInitializer;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

public class SmallTweaksMain implements ModInitializer {
    public static SmallTweaksConfig CONFIG = new SmallTweaksConfig();

	@Override
	public void onInitialize() {
        AutoConfig.register(SmallTweaksConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(SmallTweaksConfig.class).getConfig();
	}
}