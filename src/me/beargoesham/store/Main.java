package me.beargoesham.store;

import me.beargoesham.store.Economy.EconCommands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public void onEnable() {

        //Config
        getConfig().options().copyDefaults(true);
        saveConfig();

        //Registering
        registerCommands();
        registerListeners();
    }
    public void onDisable() {

    }
    public void registerCommands(){
        getCommand("econ").setExecutor(new EconCommands());
    }
    public void registerListeners() {

    }
}
