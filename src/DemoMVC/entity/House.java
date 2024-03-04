package DemoMVC.entity;

public class House {
    private int houseId;
    private String roomStandardHouse;
    private int numberOfFloorHouse;

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", roomStandardHouse='" + roomStandardHouse + '\'' +
                ", numberOfFloorHouse=" + numberOfFloorHouse +
                '}';
    }

    public House(int houseId, String roomStandardHouse, int numberOfFloorHouse) {
        this.houseId = houseId;
        this.roomStandardHouse = roomStandardHouse;
        this.numberOfFloorHouse = numberOfFloorHouse;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getNumberOfFloorHouse() {
        return numberOfFloorHouse;
    }

    public void setNumberOfFloorHouse(int numberOfFloorHouse) {
        this.numberOfFloorHouse = numberOfFloorHouse;
    }
}
