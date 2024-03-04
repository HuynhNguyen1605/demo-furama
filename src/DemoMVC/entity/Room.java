package DemoMVC.entity;

public class Room extends Facility{
    private int roomId;
    private String freeService;

    public Room(int serviceId, String serviceName, float area, float rentalCost, int maxOccupancy, String rentType, String customAttribute, boolean availability) {
        super(serviceId, serviceName, area, rentalCost, maxOccupancy, rentType);
        this.roomId = roomId;
        this.freeService = freeService;
    }

    public Room(int serviceId, String serviceName, float area, float rentalCost, int maxOccupancy, String rentType) {
        super(serviceId, serviceName, area, rentalCost, maxOccupancy, rentType);
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceId=" + getServiceId() +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", rentalCost=" + getRentalCost() +
                ", maxOccupancy=" + getMaxOccupancy() +
                ", rentType='" + getRentType() + '\'' +
                ", roomId='" + roomId + '\'' +
                ", freeService=" + freeService +
                '}';
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
