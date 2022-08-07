import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StartScreen {
    private HashMap<Integer, Car> startCars = new HashMap<>();

    public Player getNewPlayer() {
        System.out.println("Enter your name");
        return new Player(inputLine(), 20000, showStartCars());
    }

    private Car showStartCars() {
        CarService carS = new CarService();
        System.out.println("Available cars:");
        Iterator<Car> iterator = carS.getStartCars().iterator();
        int i = 1;
        while (iterator.hasNext()) {
            startCars.putIfAbsent(i, iterator.next());
            System.out.println(i + ". " + startCars.get(i).getModel() + " - " + startCars.get(i).getCarCost() + "$");
            i++;
        }
        return carChoise();
    }

    private Car carChoise() {
        int i = checkInt();
        switch (i) {
            case (1):
            case (2):
            case (3):
                System.out.println("Your new car is " + startCars.get(i).getModel());
                return startCars.get(i);
            default:
                return carChoise();
        }
    }

    private String inputLine() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            return sc.nextLine();
        } else {
            return inputLine();
        }
    }

    private int checkInt() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            return checkInt();
        }
    }

    public HashMap<Integer, Car> getStartCars() {
        return startCars;
    }

    public void setStartCars(HashMap<Integer, Car> threeCars) {
        this.startCars = threeCars;
    }
}
