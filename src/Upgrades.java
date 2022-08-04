import java.util.HashMap;

public class Upgrades {
    private int tier, cost;
    private String type;

    public void setTier(int tier) {
        this.tier = tier;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTier() {
        return tier;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public Upgrades(String type, int tier, int cost) {
        this.type = type;
        this.tier = tier;
        this.cost = cost;
    }

    public Upgrades() {
    }

    private HashMap<String, Upgrades> details = new HashMap<>() {{
        put("engine", new Upgrades("Engine", 0, 3000));
        put("gear", new Upgrades("Gear", 0, 3000));
        put("tyres", new Upgrades("Tyres", 0, 3000));
        put("turbo", new Upgrades("Turbo", 0, 3000));
        put("body", new Upgrades("Body", 0, 3000));
    }};

    public int getRating() {
        return 10 * (2 * tier);
    } // 20-40-60
}
