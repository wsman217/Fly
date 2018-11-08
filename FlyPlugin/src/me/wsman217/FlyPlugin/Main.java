package me.wsman217.FlyPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import me.wsman217.FlyPlugin.messages.Messages;

public class Main extends JavaPlugin {
	public Messages messages;

	@Override
	public void onEnable() {
		saveDefaultConfig();

		System.out.println("NightVision has been ENABLED");
		System.out.println("Author: wsman217");

		messages = new Messages(this);

		getCommand("fly").setExecutor(new me.wsman217.FlyPlugin.commands.FlyCommands(this));
	}

	@Override
	public void onDisable() {
		System.out.println("NightVision has been DISABLED");
		System.out.println("Author: wsman217");
	}
}
