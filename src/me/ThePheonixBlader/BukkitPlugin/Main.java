package me.ThePheonixBlader.BukkitPlugin;

import java.util.logging.Logger;




import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled!");
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
        playerList.put(player.getName(), playerData(player));
    }

 
    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled!");
    }
}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	if (cmd.getName().equalsIgnoreCase("test")) { 
		if(sender instanceof Player){
		Player player = (Player) sender;
		player.getInventory().addItem(new ItemStack(Material.DIAMOND));
		player.sendMessage("" + ChatColor.AQUA + "Here have A...");
		player.sendMessage("§b§lDIAMOND!!!");
		} else {
		sender.setUsage("You dont have permission to run this command");
		}
		return true;
	} 
	return false; 
   
   }
}   

