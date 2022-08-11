public class MoneyService {
    public static Player purchaseCar(Player player, Car car) {
        if (player.getMoney() >= car.getCarCost()){
            player.setMoney(player.getMoney() - car.getCarCost());
            player.setMyCar(car);
            System.out.println("Your new car is "+car.getModel());
            return player;
        }else{
            System.out.println("Not enough money, make another choice");
            return player;
        }
    }
    public static Upgrade purchaseUpgrade(Player player, Upgrade upgrade){
        if(player.getMoney()>= upgrade.getCost()&&upgrade.getTier() < 4){
            player.setMoney(player.getMoney() - upgrade.getCost());
            upgrade.setTier(upgrade.getTier() + 1);
            upgrade.setCost(upgrade.getCost()+3000);
            System.out.println("You now have "+upgrade.getType()+" T"+upgrade.getTier());
            return upgrade;
        }else{
            System.out.println("You cant upgrade this detail");
            return upgrade;
        }
    }
}
