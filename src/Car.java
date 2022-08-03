import java.util.HashMap;

public class Car {
    HashMap<> cars = new HashMap<>();

    private static String model;
    private static int carCost;
    private static int rating;

    public Car(String model, int carCost,int rating) {
        Car.model = model;
        Car.carCost = carCost;
        Car.rating = rating;
    }
    public Car getFord(){
        Car ford = new Car("Ford Mustang",10200,50);
        return ford;
    }
    public Car getBMW(){
        Car bmw = new Car("BMW M3",12000,60);
        return bmw;
    }
    public Car getChevrolet(){
        Car chevrolet = new Car("Chevrolet Cobalt SS",9500,40);
        return chevrolet;
    }
    public Car getSubaru(){
        Car subaru = new Car("Subaru Impreza",13500,70);
        return subaru;
    }
    public Car getAudi(){
        Car audi = new Car("Audi RS", 14000,80);
        return audi;
    }
    public Car getNissan(){
        Car nissan = new Car("Nissan GTR", 15000,90);
        return nissan;
    }

}
