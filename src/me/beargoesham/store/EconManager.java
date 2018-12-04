package me.beargoesham.store;

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
    public void setBalance(int amount, UUID uuid) {

    }


}
