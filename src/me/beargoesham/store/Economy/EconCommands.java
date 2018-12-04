package me.beargoesham.store.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EconCommands implements CommandExecutor {

    EconManager manager;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("econ")) {
            if(sender instanceof Player) {
                Player p = (Player) sender;
                if(p.hasPermission("shops.econ")) {
                    if(args.length < 1 || args.length > 3) {
                        if(args[0].equalsIgnoreCase("set")) {
                            Player target = Bukkit.getPlayer(args[1]);
                            int amount = Integer.parseInt(args[2]);
                            manager.setBalance(amount, target);
                            p.sendMessage(ChatColor.RED + "[Economy] " + ChatColor.GOLD + "You set " + target.getName() + "'s balance to: " + amount);
                            target.sendMessage(ChatColor.RED + "[Economy] " + ChatColor.GOLD + p.getName() + " has set your balance to: " + amount);
                        } else if(args[0].equalsIgnoreCase("add")) {
                        Player target = Bukkit.getPlayer(args[1]);
                        int amount = Integer.parseInt(args[2]);
                        manager.addBalance(amount, target);
                        p.sendMessage(ChatColor.RED + "[Economy] " + ChatColor.GOLD + "added " + amount + " to " + target.getName() + "'s balance.");

                        }
                    } else {
                        p.sendMessage(ChatColor.RED + "[Economy] " + ChatColor.GOLD + "Invalid Usage. /econ set|give|take|reset <player> <amount>");
                        p.playSound(p.getLocation(), Sound.NOTE_BASS_GUITAR, 20, 1);
                    }
                }

            } else {

            }
        }


        return false;
    }

}
