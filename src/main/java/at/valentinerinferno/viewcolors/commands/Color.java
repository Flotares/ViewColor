package at.valentinerinferno.viewcolors.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Color implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("viewcolor.color")) {
                player.sendMessage(ChatColor.BLACK + "&0 - this is black\n" +
                        ChatColor.DARK_BLUE + "&1 - this is dark blue\n" +
                        ChatColor.DARK_GREEN + "&2 - this is dark green\n" +
                        ChatColor.DARK_AQUA + "&3 - this is dark turqouise\n" +
                        ChatColor.DARK_RED + "&4 - this is dark red\n" +
                        ChatColor.DARK_PURPLE + "&5 - this is purple\n" +
                        ChatColor.GOLD + "&6 - this is dark yellow\n" +
                        ChatColor.GRAY + "&7 - this is light gray\n" +
                        ChatColor.DARK_GRAY + "&8 - this is dark gray\n" +
                        ChatColor.BLUE + "&9 - this is light blue\n" +
                        ChatColor.GREEN + "&a - this is light green\n" +
                        ChatColor.AQUA + "&b - this is light turquoise\n" +
                        ChatColor.RED + "&c - this is light red\n" +
                        ChatColor.LIGHT_PURPLE + "&d - this is magenta\n" +
                        ChatColor.YELLOW + "&e - this is light yellow\n" +
                        ChatColor.WHITE + "&f - this is white\n");
            } else {
                player.sendMessage(ChatColor.RED + "You don't have permission!");
            }
        } else {
            System.out.println("You cannot do this in the console!");
        }
        return true;
    }
}
