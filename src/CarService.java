import java.util.HashMap;
import java.util.HashSet;

public class CarService {
    private HashMap<Integer, Car> carMap = new HashMap<>() {{
        put(0, Car.getAudi());
        put(1, Car.getBMW());
        put(2, Car.getChevrolet());
        put(3, Car.getFord());
        put(4, Car.getNissan());
        put(5, Car.getSubaru());
    }};

    public HashSet<Car> getStartCars() {
        HashSet<Car> carSet = new HashSet<>();
        while (carSet.size() < 3) {
            carSet.add(carMap.get(randomSix()));
        }
        return carSet;
    }

    private int randomSix() {
        return (int) (Math.random() * 6);
    }

    public HashMap<Integer, Car> getCarMap() {
        return carMap;
    }
}
