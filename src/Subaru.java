public class Subaru implements Car{
    private final String model = "Subaru Impreza";
    private final int carCost = 13500;
    private final int rating = 70;

    public String getModel() {
        return model;
    }

    @Override
    public int getCarRating() {
        return rating;
    }
}
