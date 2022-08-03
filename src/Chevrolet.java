public class Chevrolet implements Car{
    private final String model = "Chevrolet Cobalt SS";
    private final int carCost = 9500;
    private final int rating = 40;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
