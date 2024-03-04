package DemoMVC.entity;

public class Villa {
    private int villaId;
    private String roomStandrardVilla;
    private float poolArea;
    private int numberOfFloors;

    @Override
    public String toString() {
        return "Villa{" +
                "villaId=" + villaId +
                ", roomStandrard='" + roomStandrardVilla + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public Villa(int villaId, String roomStandrard, float poolArea, int numberOfFloors) {
        this.villaId = villaId;
        this.roomStandrardVilla = roomStandrard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getVillaId() {
        return villaId;
    }

    public void setVillaId(int villaId) {
        this.villaId = villaId;
    }

    public String getRoomStandrardVilla() {
        return roomStandrardVilla;
    }

    public void setRoomStandrardVilla(String roomStandrardVilla) {
        this.roomStandrardVilla = roomStandrardVilla;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
