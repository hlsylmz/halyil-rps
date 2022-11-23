package Garage;

public abstract class Vehicle {
    String registeringsnummer;
    String farg;
    int  tillverkningar;

    public Vehicle(String registeringsnummer, String farg, int tillverkningar) {
        this.registeringsnummer = registeringsnummer;
        this.farg = farg;
        this.tillverkningar = tillverkningar;
    }

    public String getRegisteringsnummer() {
        return registeringsnummer;
    }

    public void setRegisteringsnummer(String registeringsnummer) {
        this.registeringsnummer = registeringsnummer;
    }

    public String getFarg() {
        return farg;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    public int getTillverkningar() {
        return tillverkningar;
    }

    public void setTillverkningar(int tillverkningar) {
        this.tillverkningar = tillverkningar;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registeringsnummer='" + registeringsnummer + '\'' +
                ", farg='" + farg + '\'' +
                ", tillverkningar=" + tillverkningar +
                '}';
    }


}
