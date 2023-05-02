package com.skitbet.dumbplugin.features;

import com.skitbet.dumbplugin.util.CC;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Sheep;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class RainbowSheep {

    private List<Sheep> sheepList = new ArrayList<>();

    public void startSheepRunnable(Plugin plugin) {
        new SheepRunnable().runTaskTimer(plugin, 15, 15);
    }

    public void spawnSheep(Location location) {
        for (int i = 0; i < 150; i++) {
            Sheep sheep = (Sheep) location.getWorld().spawnEntity(location, EntityType.SHEEP);
            sheep.setCustomName(ChatColor.RED + "Rainbow");
            sheep.setCustomNameVisible(true);
            sheep.setColor(CC.getRandomColor());
            sheepList.add(sheep);
        }
    }


    public class SheepRunnable extends BukkitRunnable {

        @Override
        public void run() {
            sheepList.forEach(sheep -> {
                sheep.setColor(CC.getRandomColor());
            });
        }
    }

}
