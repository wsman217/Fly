package me.wsman217.FlyPlugin.commands;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FlyCommands implements CommandExecutor{
	
	Main plugin;
	
	FlyCommands(Main plugin) {
		this.plugin=plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			System.out.println(plugin.getConfig().getString("console_error"));
		}
		
		return false;
	}
}
