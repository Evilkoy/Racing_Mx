import java.util.HashMap;

public class UpgradeShop {
    HashMap<Integer, Upgrade> upgrades;

    void setBasicUpgrades(Player player) {
        upgrades = UpgradeService.getBasicUpgrades();
        message(player);
    }

    public void message(Player player) {
        int i = 1;
        System.out.println("Your modifications, you can choose one for upgrade");
        for (Upgrade list : upgrades.values()) {
            System.out.println(i + ". " + list.getType() + " T" + list.getTier());
            i++;
        }
        System.out.println("6. Close tuning menu");
        System.out.println("Make your choice");
        upgradeChoice(player);
    }

    public void upgradeChoice(Player player) {
        int i = InOutService.inputInt();
        if (i > 0 && i < 6) {
            upgrades.put(i, MoneyService.purchaseUpgrade(player, upgrades.get(i)));
            message(player);
        } else if (i > 6) {
            System.out.println("Not correct, make another choice");
            upgradeChoice(player);
        }
    }

    public int getRatings() {
        int sum = 0;
        for (Upgrade list : upgrades.values()) {
            sum += list.getRating();
        }
        return sum;
    }
}
