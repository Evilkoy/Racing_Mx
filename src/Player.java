public class Player {
    Player player;
    private String playerName;
    private Car myCar;
    private int money;

    public Player(String playerName, int money, Car myCar) {
        this.playerName = playerName;
        this.myCar = myCar;
        this.money = money;
    }
    public Player(){}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Car getMyCar() {
        return myCar;
    }

    public int getMoney() {
        return money;
    }

}

