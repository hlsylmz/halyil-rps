package Garage;

public class Airplane extends Vehicle {
    int winglangd;

    public Airplane(String registeringsnummer, String farg, int tillverkningar, int winglangd) {
        super(registeringsnummer, farg, tillverkningar);
        this.winglangd = winglangd;
    }

    public int getWinglangd() {
        return winglangd;
    }

    public void setWinglangd(int winglangd) {
        this.winglangd = winglangd;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "winglangd=" + winglangd +
                ", registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }
}
