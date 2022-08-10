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
            return MoneyService.purchaseCar(player,startCars.get(i));
        } else {
            System.out.println("Wrong choice, try again");
            return carChoice(player);
        }
    }
}
