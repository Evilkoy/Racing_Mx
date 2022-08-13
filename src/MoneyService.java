public class MoneyService {
    public static Player purchaseCar(Player player, Car car) throws Exception {
        if (player.getMoney() < car.getCarCost()) throw new Exception("Not enough money, make another choice");
        player.setMoney(player.getMoney() - car.getCarCost());
        player.setMyCar(car);
        System.out.println("Your new car is " + car.getModel());
        return player;
    }

    public static Upgrade purchaseUpgrade(Player player, Upgrade upgrade) throws Exception {
        if (player.getMoney() < upgrade.getCost()) throw new Exception("Not enough money");
        if (upgrade.getTier() == 3) throw new Exception("This detail is already T3");
        player.setMoney(player.getMoney() - upgrade.getCost());
        upgrade.setTier(upgrade.getTier() + 1);
        upgrade.setCost(upgrade.getCost() + 3000);
        System.out.println("You now have " + upgrade.getType() + " T" + upgrade.getTier());
        return upgrade;
    }
}
