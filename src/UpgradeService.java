import java.util.HashMap;

public class UpgradeService {

    public static HashMap<Integer, Upgrade> getBasicUpgrades() {
        return new HashMap<>() {{
            put(1, new Upgrade("Engine", 0, 3000));
            put(2, new Upgrade("Gear", 0, 3000));
            put(3, new Upgrade("Tyres", 0, 3000));
            put(4, new Upgrade("Turbo", 0, 3000));
            put(5, new Upgrade("Body", 0, 3000));
        }};
    }
}
