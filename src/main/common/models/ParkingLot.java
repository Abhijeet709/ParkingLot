package main.common.models;

import java.util.ArrayList;

public class ParkingLot extends BaseModel{

    private ArrayList<ParkingFloor> floors;
    private ArrayList<Gate> gates;
    private String address;

    public void setFloors(ArrayList<ParkingFloor> floors) {
        this.floors = floors;
    }

    public void setGates(ArrayList<Gate> gates) {
        this.gates = gates;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Gate> getGates() {
        return gates;
    }

    public ArrayList<ParkingFloor> getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }
}
