package DemoMVC.entity;

import java.util.Date;
import java.util.Scanner;

public class Customer {
    private long id;
    private String fullName;
    private Date dateOfBirth;
    private String gender;
    private String identify;
    private String phoneNumber;
    private String customerType;
    private String address;

    private static Support sp = new Support();
    private static Scanner sc = new Scanner(System.in);

    public Customer() {

    }

    @Override
    public String toString() {
        return String.format("%d"
                + "\t%-25s"
                + "\t%-20s"
                + "\t%-25s"
                + "\t%-25s"
                + "\t%-25s"
                + "\t%-25s"
                + "\t%-25s", this.id, this.fullName, this.gender, sp.xuatNgayThangNam(this.dateOfBirth),this.identify, this.phoneNumber, this.customerType, this.address);
    }

    public Customer(long id, String fullName, Date dateOfBirth, String gender, String identify, String phoneNumber, String customerType, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identify = identify;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.address = address;
    }

    public void nhapDuLieuKhachHang(){
        System.out.println("");
        System.out.print("Họ và tên khách hàng: ");
        this.fullName = sc.nextLine();

        System.out.print("Ngày sinh (dd/MM/yyyy): ");
        this.dateOfBirth = sp.nhapNgayThangNam(sc.nextLine());

        System.out.print("Giới tính: (Nam: 0, Nu: 1): ");
        this.gender = sc.nextLine();

        System.out.println("Số căn cước công dân: ");
        this.identify = sc.nextLine();

        System.out.println("Số điện thoại: ");
        this.phoneNumber = sc.nextLine();

        //Loại khách hàng(mặc định là khách hàng thường)
        this.customerType = "Nomal";

        System.out.print("Địa Chỉ: ");
        this.address = sc.nextLine();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
