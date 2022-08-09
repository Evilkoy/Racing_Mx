import java.util.HashMap;

public class StartScreen {
    private HashMap<Integer, Car> startCars = new HashMap<>();

    public Player showStartCars(Player player) {
        CarService carService = new CarService();
        System.out.println("Available cars:");
        int i = 1;
        for (Car car : carService.getStartCars()) {
            startCars.put(i, car);
            System.out.println(i + ". " + startCars.get(i).getModel() + " - " + startCars.get(i).getCarCost() + "$");
            i++;
        }
        return carChoice(player);
    }

    private Player carChoice(Player player) {
        int i = InOutService.inputInt();
        if (0 < i && i < 4) {
            return purchaseStartCar(player,startCars.get(i));
        } else {
            System.out.println("Wrong choice, try again");
            return carChoice(player);
        }
    }

    public Player purchaseStartCar(Player player, Car car) {
        if (player.getMoney() >= car.getCarCost()){
            player.setMoney(player.getMoney() - car.getCarCost());
            player.setMyCar(car);
            System.out.println("Your new car is "+car.getModel());
            return player;
        }else{
            System.out.println("Not enough money, make another choice");
            return carChoice(player);
        }
    }
}
