package com.skitbet.dumbplugin.util;

import org.bukkit.DyeColor;

import java.util.Random;

public class CC {

    public static DyeColor getRandomColor() {
        DyeColor[] dyes = {
                DyeColor.RED,
                DyeColor.ORANGE,
                DyeColor.YELLOW,
                DyeColor.GREEN,
                DyeColor.BLUE,
                DyeColor.MAGENTA
        };

        return dyes[new Random().nextInt(dyes.length)];
    }

}
