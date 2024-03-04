package DemoMVC.entity;

public class Facility {
    private int serviceId;
    private String serviceName;
    private float area;
    private float rentalCost;
    private int maxOccupancy;
    private String rentType;


    @Override
    public String toString() {
        return "Facility{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxOccupancy=" + maxOccupancy +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    public Facility(int serviceId, String serviceName, float area, float rentalCost, int maxOccupancy, String rentType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxOccupancy = maxOccupancy;
        this.rentType = rentType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
