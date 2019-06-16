package com.xyberviri.bukkit.acc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ACC
  extends JavaPlugin {
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       sender.sendMessage("this can only check permissions for players.");
    } else {
       Player player = (Player)sender;
       player.sendMessage("[ACC]: '" + args[0] + "' - " + player.hasPermission(args[0]));
    } 
    
     return true;
  }
}
