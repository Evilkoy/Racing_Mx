import java.util.HashMap;

public class UpgradeService {
    private HashMap<String, Upgrade> upgrades = new HashMap<>() {{
        put("engine", new Upgrade("Engine", 0, 3000));
        put("gear", new Upgrade("Gear", 0, 3000));
        put("tyres", new Upgrade("Tyres", 0, 3000));
        put("turbo", new Upgrade("Turbo", 0, 3000));
        put("body", new Upgrade("Body", 0, 3000));
    }};
    public Upgrade getUpgrade(String name){
        return upgrades.get(name);
    }
}
