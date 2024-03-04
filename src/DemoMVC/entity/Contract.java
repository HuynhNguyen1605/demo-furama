package DemoMVC.entity;

public class Contract {
    private int contractId;
    private int bookingId;
    private float depositAmount;
    private float totalPayment;
    private int customerId;

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", bookingId=" + bookingId +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", customerId=" + customerId +
                '}';
    }

    public Contract(int contractId, int bookingId, float depositAmount, float totalPayment, int customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    public float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(float totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
