package Garage;

public class Motorcycle extends Vehicle{
    int numbersOfWheels;

    public Motorcycle(String registeringsnummer, String farg, int tillverkningar, int numbersOfWheels) {
        super(registeringsnummer, farg, tillverkningar);
        this.numbersOfWheels = numbersOfWheels;
    }

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }

    public void setNumbersOfWheels(int numbersOfWheels) {
        this.numbersOfWheels = numbersOfWheels;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "numbersOfWheels=" + numbersOfWheels +
                ", registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }
}
