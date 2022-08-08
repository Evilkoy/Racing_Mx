import java.util.HashMap;

public class StartScreen {
    private HashMap<Integer, Car> startCars = new HashMap<>();

    public Car showStartCars() {
        CarService carService = new CarService();
        System.out.println("Available cars:");
        int i = 1;
        for (Car car : carService.getStartCars()) {
            startCars.put(i, car);
            System.out.println(i + ". " + startCars.get(i).getModel() + " - " + startCars.get(i).getCarCost() + "$");
            i++;
        }
        return carChoise();
    }

    private Car carChoise() {
        int i = InOutService.inputInt();
        if (0 < i && i < 4) {
            System.out.println("Your new car is " + startCars.get(i).getModel());
            return startCars.get(i);
        } else {
            return carChoise();
        }
    }
}
