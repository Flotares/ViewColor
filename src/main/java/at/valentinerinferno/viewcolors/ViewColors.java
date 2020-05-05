package at.valentinerinferno.viewcolors;

import at.valentinerinferno.viewcolors.commands.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class ViewColors extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("colors").setExecutor(new Color());
    }


}
