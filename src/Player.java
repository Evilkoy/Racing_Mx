public class Player {
    private String playerName;
    private Car myCar;
    private int money;

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

