
package Garage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.UIManager.get;

public class Garage {
    static ArrayList<Vehicle> vehicleList=new ArrayList<>();

    public static void main(String[] args) {

        vehicleList.add (new Car("trtr100", "vit", 2021,4 ));
        vehicleList.add(new Car("trtr90", "svart", 2020,5 ));
        vehicleList.add(new Boat("trtr80", "vit", 2019,15 ));
        vehicleList.add(new Boat("trtr70","vit",2018,20));
        vehicleList.add(new Airplane("trtr60","vit",2017,50));
        vehicleList.add(new Airplane("trtr50","vit",2016,60));
        vehicleList.add(new Motorcycle("trtr40","vi",2015,2));
        vehicleList.add(new Motorcycle("trtr30","vit",2014,2));
        vehicleList.add(new Bus("trtr20","vit",2013,60));
        vehicleList.add(new Bus("trtr10","vit",2012,50));


        //System.out.println(vehicleList.toString());
        //System.out.println("Fordon med registreringsnummer " + "gck90k " + "finns på plats " + getParkingLotNoByVehicleRegNo("trtr100"));
parkVehicle("trtr80");
lista(vehicleList);
    }

    static int getParkingLotNoByVehicleRegNo(String regNo){
        for(int i = 0; i<vehicleList.size(); i++){
            if(vehicleList.get(i).getRegisteringsnummer().equals(regNo)){
                return i+1; //vi har 10 platser i garaget, index börjar med "0" och platser börjar med "index+1"
            }
        }
        return -1;
    }

    static boolean parkVehicleOnSpecifiedLot(int lot, Vehicle vehicle ){
        if(vehicleList.get(lot)==null){
            vehicleList.add(lot, vehicle);
            return true;
        }
        return false;
    }

    public static void parkVehicle(String registeringsnummer){
        for(int i=0; i<vehicleList.size(); i++){
        if(vehicleList.get(i).getRegisteringsnummer().equals(registeringsnummer)){
            System.out.println("Du kan parkera");
        }
    }


}
public  static void  lista(ArrayList<Vehicle>vehicleList) {
    ArrayList<Vehicle> carlist = new ArrayList<>();
    ArrayList<Vehicle> boatlist = new ArrayList<>();
    ArrayList<Vehicle> buslist = new ArrayList<>();
    ArrayList<Vehicle> motorcyclelist = new ArrayList<>();
    ArrayList<Vehicle> airplanelist = new ArrayList<>();
    for (int i = 0; i < vehicleList.size(); i++) {
        if (vehicleList.get(i) instanceof Car) {
            carlist.add(vehicleList.get(i));
        }if (vehicleList.get(i) instanceof Boat) {
            boatlist.add(vehicleList.get(i));
        }if (vehicleList.get(i) instanceof Bus) {
            buslist.add(vehicleList.get(i));
        }if (vehicleList.get(i) instanceof Motorcycle) {
            motorcyclelist.add(vehicleList.get(i));
        }if (vehicleList.get(i) instanceof Airplane) {
            airplanelist.add(vehicleList.get(i));
        }
    }System.out.println(buslist);
    System.out.println(boatlist);
    System.out.println(carlist);
    System.out.println(motorcyclelist);
    System.out.println(airplanelist);

}
}