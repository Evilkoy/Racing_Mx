public class MoneyService {
    public static Player purchaseStartCar(Player player, Car car) {
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
}
