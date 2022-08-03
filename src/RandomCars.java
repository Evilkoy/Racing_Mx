import java.util.HashMap;
import java.util.HashSet;
public class RandomCars {
    private HashMap<Integer,Car> carMap = new HashMap<>(){{
        put(0,Car.getAudi());
        put(1,Car.getBMW());
        put(2,Car.getChevrolet());
        put(3,Car.getFord());
        put(4,Car.getNissan());
        put(5,Car.getSubaru());
    }};
    private HashSet<Car> carSet = new HashSet<>();

    public HashMap<Integer, Car> getCarMap() {
        return carMap;
    }

    public HashSet<Car> getStartedCars(){
        while (carSet.size()<3){
            carSet.add(carMap.get(randomSix()));
        }
        return carSet;
    }
    int randomSix(){
        return (int)(Math.random()*6);
    }
}
