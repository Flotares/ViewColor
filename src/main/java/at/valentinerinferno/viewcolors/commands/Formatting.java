package at.valentinerinferno.viewcolors.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Formatting implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("viewcolors.formatting")) {
                player.sendMessage(ChatColor.BLUE + "&k - " + ChatColor.AQUA + ChatColor.MAGIC + "Obfuscated\n" +
                        ChatColor.RESET + ChatColor.BLUE + "&l - " + ChatColor.AQUA + ChatColor.BOLD + "Bold\n" +
                        ChatColor.RESET + ChatColor.BLUE + "&m - " + ChatColor.AQUA + ChatColor.STRIKETHROUGH + "Strikethrough\n" +
                        ChatColor.RESET + ChatColor.BLUE + "&n - " + ChatColor.AQUA + ChatColor.UNDERLINE + "Underline\n" +
                        ChatColor.RESET + ChatColor.BLUE + "&o - " + ChatColor.AQUA + ChatColor.ITALIC + "Italic\n" +
                        ChatColor.RESET + ChatColor.BLUE + "&r - " + ChatColor.AQUA + "Reset\n");
            } else {
                player.sendMessage(ChatColor.RED + "You don't have permission!");
            }
        } else {
            System.out.println("You cannot do this in the console!");
        }

        return true;
    }
}
