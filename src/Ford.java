public class Ford implements Car{
    private final String model = "Ford Mustang";
    private final int carCost = 10200;
    private final int rating = 50;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
