import java.util.HashMap;

public class UpgradeShop {

    public void message(Player player) {
        int i = 1;
        System.out.println("Your modifications, you can choose one for upgrade");
        System.out.println("Available money - " + player.getMoney());
        for (Upgrade list : player.getMyCar().getUpgrades().values()) {
            System.out.println(i + ". " + list.getType() + " T" + list.getTier() + " - " + list.getCost() + "$");
            i++;
        }
        System.out.println("6. Go to race");
        System.out.println("7. Quit");
        System.out.println("Make your choice");
        upgradeChoice(player);
    }

    private void upgradeChoice(Player player) {
        Car playersCar = player.getMyCar();
        int i = InOutService.inputInt();
        if (i > 0 && i < 6) {
            try {
                playersCar.putUpgrade(i, MoneyService.purchaseUpgrade(player, playersCar.getUpgrades().get(i)));
                message(player);
            } catch (CantBuyException exception) {
                System.out.println(exception.getMessage());
                upgradeChoice(player);
            }
        } else if (i > 7) {
            System.out.println("Not correct, make another choice");
            upgradeChoice(player);
        } else if (i == 6) {
            Race.race(player, getRatings(player));
        }
    }

    public int getRatings(Player player) {
        int sum = 0;
        for (Upgrade list : player.getMyCar().getUpgrades().values()) {
            sum += list.getRating();
        }
        return sum;
    }
}
