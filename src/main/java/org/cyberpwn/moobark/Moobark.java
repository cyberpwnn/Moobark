package org.cyberpwn.moobark;

import ninja.bytecode.shuriken.bukkit.bukkit.plugin.Instance;
import ninja.bytecode.shuriken.bukkit.bukkit.plugin.ShurikenPlugin;
import ninja.bytecode.shuriken.bukkit.util.text.C;
import ninja.bytecode.shuriken.bukkit.util.text.TXT;

public class Moobark extends ShurikenPlugin {
    @Instance
    public static Moobark instance;

    @Override
    public void start()
    {

    }

    @Override
    public void stop() {

    }

    @Override
    public String getTag(String subTag) {
        return TXT.makeTag(C.DARK_GRAY, C.BLUE, C.DARK_GRAY, C.GRAY, "Moobark");
    }
}
