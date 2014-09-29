package me.ThePheonixBlader.BukkitPlugin;

import java.util.logging.Logger;




import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public boolean onCommand(Command sender, Command command, String label, String[] args) {
			if(label.equalsIgnoreCase("test")){
				if(sender instanceof Player){
					Player player = (Player) sender;
					player.getInventory().addItem(new ItemStack(Material.DIAMOND));
					player.sendMessage("" + ChatColor.AQUA + "Here have A...");
					player.sendMessage("§b§lDIAMOND!!!");
				} else {
					sender.setUsage("You dont have permission to run this command");
				}
			}
			return true;
	}
	Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		
		logger.info("Thanks for watching guys! A like would be much appreciated. I'll see you guys... NEXT TIME");
	}

}
