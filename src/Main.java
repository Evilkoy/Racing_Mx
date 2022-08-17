public class Main {
    public static void main(String[] args) {
        Player player = PlayerService.getNewPlayer();
        UpgradeShop us = new UpgradeShop();
        us.message(player);
    }
}