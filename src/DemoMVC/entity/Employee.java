package DemoMVC.entity;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private long employeeId;
    private String fullName;
    private Date dateOfBirth;
    private String gender;
    private String identify;
    private String phoneNumber;
    private String email;
    private String qualification;
    private String position;
    private String salary;

    private static Support sp = new Support();
    private static Scanner sc = new Scanner(System.in);

    public Employee() {

    }

    @Override
    public String toString() {
        return String.format("%d"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s"
                + "\t%-15s",this.employeeId, this.fullName, sp.xuatNgayThangNam(this.dateOfBirth), this.gender, this.identify, this.phoneNumber, this.email, this.qualification, this.position, this.salary);
    }

    public Employee(int employeeId, String fullName, Date dateOfBirth, String gender, String identify, String phoneNumber, String email, String qualification, String position, String salary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identify = identify;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public void nhapDuLieuNhanVien(){
        System.out.println("");
        System.out.print("Họ và tên nhân viên: ");
        this.fullName = sc.nextLine();

        System.out.print("Ngày sinh (dd/MM/yyyy): ");
        this.dateOfBirth = sp.nhapNgayThangNam(sc.nextLine());

        System.out.print("Giới tính: (Nam: 0, Nu: 1): ");
        this.gender = sc.nextLine();

        System.out.println("Số căn cước công dân: ");
        this.identify = sc.nextLine();

        System.out.println("Số điện thoại: ");
        this.phoneNumber = sc.nextLine();

        System.out.println("Email: ");
        this.email = sc.nextLine();

        System.out.println("Qualification: ");
        this.qualification = sc.nextLine();

        System.out.println("Position: ");
        this.position = sc.nextLine();

        System.out.println("Salary: ");
        this.salary = sc.nextLine();
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
