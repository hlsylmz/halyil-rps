package Garage;

public class Car extends Vehicle{
    int numbersOfairbag;

    public Car(String registeringsnummer, String farg, int tillverkningar, int numbersOfairbag) {
        super(registeringsnummer, farg, tillverkningar);
        this.numbersOfairbag = numbersOfairbag;
    }

    public int getNumbersOfairbag() {
        return numbersOfairbag;
    }

    public void setNumbersOfairbag(int numbersOfairbag) {
        this.numbersOfairbag = numbersOfairbag;
    }



    @Override
    public String toString() {
        return "Car{" +
                "numbersOfairbag=" + numbersOfairbag +
                ", registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }
}
