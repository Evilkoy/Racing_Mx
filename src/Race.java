public class Race {
    private static int league = 1;
    private static int raceRate = 125;

    private static void leagues(int pos) {
        if (pos < 4 && league < 4) {
            league += 1;
            System.out.println("Welcome to the next league, it will be harder");
        } else if (pos > 9 && league > 1) {
            league -= 1;
            System.out.println("You are going to previous league");
        }
        raceRate = 125 * league;
    }

    private static void reward(Player player, int pos) {
        int reward = (int) league * (6000 / pos);
        if (pos > 9) {
            player.setMoney(player.getMoney() - 5000);
            System.out.println("You lose 5000$");
        } else {
            player.setMoney(player.getMoney() + reward);
            System.out.println("Your reward: " + reward + "$");
        }
    }

    public static void race(Player player, int upgradeRating) {
        int pos = getPosition(player, upgradeRating);
        System.out.println("League - " + league + "/4");
        System.out.println("Your position is " + pos + "/12");
        reward(player, pos);
        leagues(pos);
        InOutService.pause();
        UpgradeShop us = new UpgradeShop();
        us.message(player);
    }

    private static int getPosition(Player player, double upgradeRating) {
        double rating = player.getMyCar().getRating() + upgradeRating;
        System.out.println("Your rating is - " + rating);
        double pos = 12 * (1 - (rating / raceRate));
        pos += ((Math.random() * 3) - 1);
        if (pos < 1) {
            pos = 1;
        }
        return (int) pos;
    }
}
