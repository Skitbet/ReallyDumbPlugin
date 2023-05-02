package com.skitbet.dumbplugin;

import com.skitbet.dumbplugin.features.RainbowSheep;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class DumbPlugin extends JavaPlugin {

    RainbowSheep rainbowSheep;

    @Override
    public void onEnable() {
        rainbowSheep = new RainbowSheep();
        rainbowSheep.startSheepRunnable(this);

        getCommand("sheep").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (Objects.equals(label, "sheep")) {
            rainbowSheep.spawnSheep(((Player) sender).getLocation());
        }
        return true;
    }
}