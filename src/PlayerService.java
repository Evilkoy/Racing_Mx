public class PlayerService {

    public static Player getNewPlayer() {
        StartScreen startScreen = new StartScreen();
        System.out.println("Enter your name");
        Player player = new Player(InOutService.inputLine(), startScreen.showStartCars(), 20000);
        startScreen.purchaseStartCar(player);
        return player;
    }
}