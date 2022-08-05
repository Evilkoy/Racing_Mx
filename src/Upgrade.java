import java.util.HashMap;

public class Upgrade {
    private int tier;
    private int cost;
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

    public Upgrade(String type, int tier, int cost) {
        this.type = type;
        this.tier = tier;
        this.cost = cost;
    }

    public Upgrade() {
    }
    public int getRating() {
        return 10 * (2 * tier);
    }
}
