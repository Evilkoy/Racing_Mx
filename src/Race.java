public class Race {
    private int raceRate = 200;

    public void race(Player player, int upgradeRating) {
        int pos = getPosition(player, upgradeRating);
        System.out.println("Your position is " + pos + "/12");
        player.setMoney(player.getMoney() + (3000 + (3000 / pos)));
        System.out.println("Your reward: " + (3000 + (3000 / pos)) + "$");
        if (raceRate < 370) {
            raceRate += 30;
        }
    }

    private int getPosition(Player player, double upgradeRating) {
        double rating = player.getMyCar().getRating() + upgradeRating;
        double pos = 12 * (1 - (rating / raceRate));
        if (pos < 1) {
            pos = 1;
        }
        return (int) pos;
    }
}
