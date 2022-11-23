package Garage;

public class Bus extends Vehicle{
    int numberOfSeats;

    public Bus(String registeringsnummer, String farg, int tillverkningar, int numberOfSeats) {
        super(registeringsnummer, farg, tillverkningar);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }
}
