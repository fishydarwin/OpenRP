package openrp.time.expansions;

import java.util.regex.Pattern;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import openrp.OpenRP;
import openrp.time.utils.TimeHandler;

public class PAPI_Time extends PlaceholderExpansion {

	private OpenRP plugin;

	public PAPI_Time(OpenRP plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean persist() {
		return true;
	}

	@Override
	public boolean canRegister() {
		return true;
	}

	@Override
	public String getAuthor() {
		return plugin.getDescription().getAuthors().toString();
	}

	@Override
	public String getIdentifier() {
		return "orptime";
	}

	@Override
	public String getVersion() {
		return plugin.getDescription().getVersion();
	}

	@Deprecated
	@Override
	public String onPlaceholderRequest(Player player, String identifier) {

		if (player == null) {
			return "";
		}

		switch (identifier) {
		default:
			if (identifier.startsWith("in_")) {
				if (identifier.split("_").length == 3) {
					String[] split = identifier.split(Pattern.quote("_"));
					if (plugin.getServer().getWorld(split[1]) != null) {
						switch (split[2]) {
						default:
							return null;
						case "second":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getSecond()).toString();
									s = th.getSecond() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "minute":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getMinute()).toString();
									s = th.getMinute() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "hour":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getHour()).toString();
									s = th.getHour() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "day":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getDay()).toString();
									s = th.getDay() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "month":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getMonth()).toString();
									s = th.getMonth() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "year":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									return ((Integer) th.getYear()).toString();
								}
							}
							return "";
						}
					}
				}
			}
			return null;
		case "world_second":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					String s = ((Integer) th.getSecond()).toString();
					s = th.getSecond() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_minute":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					String s = ((Integer) th.getMinute()).toString();
					s = th.getMinute() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_hour":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					String s = ((Integer) th.getHour()).toString();
					s = th.getHour() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_day":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					String s = ((Integer) th.getDay()).toString();
					s = th.getDay() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_month":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					String s = ((Integer) th.getMonth()).toString();
					s = th.getMonth() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_year":
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(player.getLocation().getWorld())) {
					return ((Integer) th.getYear()).toString();
				}
			}
			return "";
		}
	}

	@Override
	public String onRequest(OfflinePlayer player, String identifier) {

		if (player == null) {
			return "";
		}

		switch (identifier) {
		default:
			if (identifier.startsWith("in_")) {
				if (identifier.split("_").length == 3) {
					String[] split = identifier.split(Pattern.quote("_"));
					if (plugin.getServer().getWorld(split[1]) != null) {
						switch (split[2]) {
						default:
							return null;
						case "second":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getSecond()).toString();
									s = th.getSecond() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "minute":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getMinute()).toString();
									s = th.getMinute() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "hour":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getHour()).toString();
									s = th.getHour() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "day":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getDay()).toString();
									s = th.getDay() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "month":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									String s = ((Integer) th.getMonth()).toString();
									s = th.getMonth() < 10 ? "0" + s : s;
									return s;
								}
							}
							return "";
						case "year":
							for (TimeHandler th : plugin.getTime().getTimes()) {
								if (th.getWorld().getName().equals(split[1])) {
									return ((Integer) th.getYear()).toString();
								}
							}
							return "";
						}
					}
				}
			}
			return null;
		case "world_second":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					String s = ((Integer) th.getSecond()).toString();
					s = th.getSecond() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_minute":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					String s = ((Integer) th.getMinute()).toString();
					s = th.getMinute() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_hour":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					String s = ((Integer) th.getHour()).toString();
					s = th.getHour() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_day":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					String s = ((Integer) th.getDay()).toString();
					s = th.getDay() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_month":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					String s = ((Integer) th.getMonth()).toString();
					s = th.getMonth() < 10 ? "0" + s : s;
					return s;
				}
			}
			return "";
		case "world_year":
			if (plugin.getServer().getPlayer(player.getName()) == null) {
				return "";
			}
			for (TimeHandler th : plugin.getTime().getTimes()) {
				if (th.getWorld().equals(plugin.getServer().getPlayer(player.getName()).getLocation().getWorld())) {
					return ((Integer) th.getYear()).toString();
				}
			}
			return "";
		}

	}

}
