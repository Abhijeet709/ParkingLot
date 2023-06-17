package main.common.models;

import java.util.ArrayList;

public class ParkingFloor {
    private ArrayList<ParkingSpot> spots;
    private int floor;

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setSpots(ArrayList<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ArrayList<ParkingSpot> getSpots() {
        return spots;
    }

    public int getFloor() {
        return floor;
    }
}
