public class PlayerService {
    public static Player getNewPlayer() {
        StartScreen startScreen = new StartScreen();
        System.out.println("Enter your name");
        return new Player(InOutService.inputLine(), 20000, startScreen.showStartCars());
    }
}
