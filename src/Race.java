public class Race {
    private static int raceRate = 200;

    public static void race(Player player, int upgradeRating) {
        int pos = getPosition(player, upgradeRating);
        int reward = (int) (3000 + (3000 / pos));
        System.out.println("Your position is " + pos + "/12");
        player.setMoney(player.getMoney() + reward);
        System.out.println("Your reward: " + reward + "$");
        if (raceRate < 450) {
            raceRate += 20;
        }
        InOutService.pause();
        UpgradeShop us = new UpgradeShop();
        us.message(player);
    }

    private static int getPosition(Player player, double upgradeRating) {
        double rating = player.getMyCar().getRating() + upgradeRating;
        System.out.println("Your rating is - " + rating);
        double pos = 12 * (1 - (rating / raceRate));
        if (pos < 1) {
            pos = 1;
        }
        return (int) pos;
    }
}
