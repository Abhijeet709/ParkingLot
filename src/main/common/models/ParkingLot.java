package main.common.models;

import java.util.ArrayList;

public class ParkingLot extends BaseModel{

    private ArrayList<ParkingFloor> floors;
    private ArrayList<EntryGate> entryGates;
    private ArrayList<ExitGate> exitGates;
    private String address;

    public void setFloors(ArrayList<ParkingFloor> floors) {
        this.floors = floors;
    }

    public void setEntryGates(ArrayList<EntryGate> gates) {
        this.entryGates = gates;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setExitGates(ArrayList<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }

    public ArrayList<EntryGate> getEntryGates() {
        return entryGates;
    }

    public ArrayList<ParkingFloor> getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<ExitGate> getExitGates() {
        return exitGates;
    }
}
