public class PlayerService {

    public static Player getNewPlayer() {
        StartScreen startScreen = new StartScreen();
        Player player = new Player();
        System.out.println("Enter your name");
        player.setMoney(20000);
        player.setPlayerName(InOutService.inputLine());
        return startScreen.showStartCars(player);
    }
}