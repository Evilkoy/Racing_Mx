import java.util.HashMap;
import java.util.HashSet;
public class RandomCars {
    private HashMap<Integer,Car> carMap = new HashMap<>();
    private HashSet<Car> carSet = new HashSet<>();

    public HashSet<Car> getCarSet() {
        return carSet;
    }

    public HashMap<Integer, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(){
        carMap.put(0,Car.getAudi());
        carMap.put(1,Car.getBMW());
        carMap.put(2,Car.getChevrolet());
        carMap.put(3,Car.getFord());
        carMap.put(4,Car.getNissan());
        carMap.put(5,Car.getSubaru());
    }
    public void setCarSet(){
        while (carSet.size()<3){
            carSet.add(carMap.get(randomSix()));
        }
    }
    static int randomSix(){
        return (int)(Math.random()*7);
    }
}
