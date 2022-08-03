public class Nissan implements Car{
    private final String model = "Nissan GTR";
    private final int carCost = 15000;
    private final int rating = 90;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
