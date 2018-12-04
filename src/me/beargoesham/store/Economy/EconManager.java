package me.beargoesham.store.Economy;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class EconManager {

    public HashMap<UUID, Integer> balances = new HashMap<UUID, Integer>();

    public int getBalance(Player player) {
        UUID uuid = player.getUniqueId();
        int bal = balances.get(uuid);
        return bal;
    }
    public void setBalance(int amount, Player player) {
        UUID uuid = player.getUniqueId();
        balances.put(uuid, amount);
    }
    public void addBalance(int amount, Player player) {
        UUID uuid = player.getUniqueId();
        balances.put(uuid, this.getBalance(player) + amount);
    }
    public void subtractBalance(int amount, Player player) {
        UUID uuid = player.getUniqueId();
        balances.put(uuid, this.getBalance(player) - amount);
    }
    public void resetBalance(Player player) {
        UUID uuid = player.getUniqueId();
        balances.put(uuid, 0);
    }

}
