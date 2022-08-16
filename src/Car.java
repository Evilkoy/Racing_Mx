import java.util.HashMap;

public class Car {

    private String model;
    private int carCost;
    private int rating;
    private HashMap<Integer, Upgrade> upgrades;

    public Car(String model, int carCost, int rating, HashMap<Integer, Upgrade> upgrades) {
        this.model = model;
        this.carCost = carCost;
        this.rating = rating;
        this.upgrades = upgrades;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUpgrades(HashMap<Integer, Upgrade> upgrades) {
        this.upgrades = upgrades;
    }

    public void putUpgrade(Integer i, Upgrade upgrade) {
        this.upgrades.put(i, upgrade);
    }

    public String getModel() {
        return model;
    }

    public int getCarCost() {
        return carCost;
    }

    public int getRating() {
        return rating;
    }

    public HashMap<Integer, Upgrade> getUpgrades() {
        return upgrades;
    }

    public static Car getFord() {
        return new Car("Ford Mustang", 10200, 50, UpgradeService.getBasicUpgrades());
    }

    public static Car getBMW() {
        return new Car("BMW M3", 12000, 60, UpgradeService.getBasicUpgrades());
    }

    public static Car getChevrolet() {
        return new Car("Chevrolet Cobalt SS", 9500, 40, UpgradeService.getBasicUpgrades());
    }

    public static Car getSubaru() {
        return new Car("Subaru Impreza", 13500, 70, UpgradeService.getBasicUpgrades());
    }

    public static Car getAudi() {
        return new Car("Audi RS", 14000, 80, UpgradeService.getBasicUpgrades());
    }

    public static Car getNissan() {
        return new Car("Nissan GTR", 15000, 90, UpgradeService.getBasicUpgrades());
    }

}
