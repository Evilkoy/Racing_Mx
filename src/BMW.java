public class BMW implements Car{
    private final String model = "BMW M3";
    private final int carCost = 12000;
    private final int rating = 60;
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
