public class Audi implements Car{
    private final String model = "Audi RS";
    private final int carCost = 14000;
    private final int rating = 80;

    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
