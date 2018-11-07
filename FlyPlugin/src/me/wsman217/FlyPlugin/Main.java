package me.wsman217.FlyPlugin;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
private static Main plugin;
	
	public static Main getPlugin() {
		
		return plugin;
	}
 
    @Override
    public void onEnable() {
    	plugin = this;
    	
    	 File file = new File(getDataFolder() + File.separator + "config.yml"); //This will get the config file
    	  
         if (!file.exists()){ //This will check if the file exist
        	 //Situation A, File doesn't exist

        	 getConfig().addDefault("Name", "Value"); //adding default settings
        	 
        	 //Save the default settings
        	 getConfig().options().copyDefaults(true);
        	 saveConfig();
         } else {
        	 //situation B, Config does exist
        	 CheckConfig(); //function to check the important settings
        	 saveConfig(); //saves the config
        	 reloadConfig();    //reloads the config
         }
         
		System.out.println("NightVision has been ENABLED");
		System.out.println("Author: wsman217");
		
		getCommand("fly").setExecutor(new me.wsman217.FlyPlugin.commands.FlyCommands());
    }
   
    @Override
    public void onDisable() {
    	plugin = null;
		System.out.println("NightVision has been DISABLED");
		System.out.println("Author: wsman217");
    }
    
    public void CheckConfig() {
    	 
        if(getConfig().get("Name") == null){ //if the setting has been deleted it will be null
            getConfig().set("Name", "Value"); //reset the setting
            saveConfig();
            reloadConfig();
        }
 
    }
}
