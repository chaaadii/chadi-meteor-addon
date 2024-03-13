package com.chadi.addon;

import com.chadi.addon.modules.player.NoJumpDelay;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChadiMeteorAddon extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger("chadi");
    public static final Category CATEGORY = new Category("chadi", Items.GUNPOWDER.getDefaultStack());
    public static final HudGroup HUD_GROUP = new HudGroup("chadi");

    @Override
    public void onInitialize() {
        LOG.info("initializing chadi's meteor addon");

        //modules
        Modules modules = Modules.get();
        modules.add(new NoJumpDelay());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.chadi.addon";
    }
}
