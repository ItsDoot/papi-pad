package pw.dotdash.papipad;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class PadExpansion extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "pad";
    }

    @Override
    public String getAuthor() {
        return "doot";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String params) {
        String[] split = params.split("_", 2);

        if (split.length < 2) {
            return null;
        }

        String side = split[0];
        String placeholder = "%" + split[1] + "%";

        String parsed = PlaceholderAPI.setPlaceholders(player, placeholder);

        if (parsed.isEmpty()) {
            return "";
        }

        if ("left".equals(side)) {
            return " " + parsed;
        } else if (side.equals("right")) {
            return parsed + " ";
        } else {
            return null;
        }
    }
}