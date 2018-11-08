package me.wsman217.FlyPlugin.messages;

import org.bukkit.ChatColor;
import me.wsman217.FlyPlugin.Main;

public class Messages {
	public final String MSG_PLAYERSONLY, MSG_NOPERMISSION, MSG_FLYON, MSG_FLYOFF;

	public Messages(Main plugin) {

		MSG_PLAYERSONLY = ChatColor.translateAlternateColorCodes('&',
				plugin.getConfig().getString("Error_Messages.Console_Error"));

		MSG_NOPERMISSION = ChatColor.translateAlternateColorCodes('&',
				plugin.getConfig().getString("Messages.Insufficient_Perms"));

		MSG_FLYON = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Messages.Fly_On"));

		MSG_FLYOFF = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Messages.Fly_Off"));
		
	}
}
