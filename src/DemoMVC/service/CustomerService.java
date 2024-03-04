package DemoMVC.service;

import DemoMVC.entity.Customer;
import DemoMVC.utils.MyReadFile;
import DemoMVC.utils.MyWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    private final MyWriteFile myWriteFile = new MyWriteFile();

    private final MyReadFile myReadFile = new MyReadFile();
    private final String DATA_PATH = "src/DemoMVC/data/customer.csv";

    private final List<Customer> customerList = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    private ArrayList<Customer> danhSachKhachHang;

    private String LABEL = String.format("%s\t%-25s\t%-25s\t%-20s\t%-25s\t%-25s\t%-25s\t%-25s",
            "ID", "Họ tên", "Giới Tính", "Ngày sinh", "Căn cước công dân", "Số điện thoại" , "Loại khách hàng", "Địa chỉ");
    public CustomerService(){
        this.danhSachKhachHang = new ArrayList<>();
    }
    public void themKhachHang(Customer customer){
        this.danhSachKhachHang.add(customer);
    }
    public void xoaKhachHang(int id){
        int vitri = CustomerService.this.tonTai(id);
        if (vitri == -1) {
            System.out.println("Không tìm thấy id khách hàng!");
        } else {
            this.danhSachKhachHang.remove(CustomerService.this.tonTai(id));
        }
    }
    private int tonTai(int id) {
        for (int i = 0; i < this.danhSachKhachHang.size(); i++) {
            if (this.danhSachKhachHang.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void suaKhachHang(int id){
        int viTri = CustomerService.this.tonTai(id);
        if (viTri == -1) {
            System.out.println("Không tìm thấy id khách hàng!");
        } else {
            System.out.printf("\nCập nhật thông tin khách hàng có ID = %d", id);
            this.danhSachKhachHang.get(viTri).nhapDuLieuKhachHang();
        }
    }
    public void xuatDanhSachKhachHang() {
        System.out.println(this.LABEL);
        for (Customer customer : danhSachKhachHang) {
            System.out.println(customer);
        }
    }

    public Customer getKhachHang(int id) {
        for (int i = 0; i < this.danhSachKhachHang.size(); i++) {
            if (this.danhSachKhachHang.get(i).getId() == id) {
                return this.danhSachKhachHang.get(i);
            }
        }
        return null;
    }

    public void findAll(){
        System.out.println(customerList);
//        List<Customer> customers = myReadFile.readFileCustomer(DATA_PATH);
//        for(Customer customer : customers){
//            System.out.println(customer.toString());
//        }
    }

    public void save(){
        myWriteFile.writeCustomerFile(DATA_PATH, customerList);
//        List<Customer> customers = myReadFile.readFileCustomer(DATA_PATH);
//        long id= customers.get(customers.size()-1).getId()+1;
//        System.out.println("Please input name! \n");
//        String fullName = SCANNER.nextLine();
    }


    public void update(){

    }
}
