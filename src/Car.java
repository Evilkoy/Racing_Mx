public class Car {

    private String model;
    private int carCost, rating;

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public void setRating(int rating) {
        this.rating = rating;
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

    public Car(String model, int carCost, int rating) {
        this.model = model;
        this.carCost = carCost;
        this.rating = rating;
    }

    public static Car getFord() {
        return new Car("Ford Mustang", 10200, 50);
    }

    public static Car getBMW() {
        return new Car("BMW M3", 12000, 60);
    }

    public static Car getChevrolet() {
        return new Car("Chevrolet Cobalt SS", 9500, 40);
    }

    public static Car getSubaru() {
        return new Car("Subaru Impreza", 13500, 70);
    }

    public static Car getAudi() {
        return new Car("Audi RS", 14000, 80);
    }

    public static Car getNissan() {
        return new Car("Nissan GTR", 15000, 90);
    }

}
