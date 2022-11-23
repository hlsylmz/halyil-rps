package Garage;

public class Boat extends Vehicle{
    int length;

    public Boat(String registeringsnummer, String farg, int tillverkningar, int length) {
        super(registeringsnummer, farg, tillverkningar);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "length=" + length +
                ", registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }
}

