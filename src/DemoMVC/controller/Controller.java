package DemoMVC.controller;
import DemoMVC.entity.Customer;
import DemoMVC.entity.Employee;
import DemoMVC.service.CustomerService;
import DemoMVC.service.EmployeeService;

import java.util.Date;
import java.util.Scanner;

public class Controller {

    private static CustomerService customerService = new CustomerService();
    private static EmployeeService employeeService = new EmployeeService();

    public static Scanner sc = new Scanner(System.in);

    public static void controller(){
//        System.out.println("Please input your choice !");
//        System.out.println("\n 1. Add \n " +
//                "2. Find \n " +
//                "3. Update\n ");
//        int input = Integer.parseInt(SCANNER.nextLine());
//        switch (input) {
//            case 1:
//                customerService.save();
//                break;
//            case 2:
//                customerService.findAll();
//                break;
//            case 3:
//                customerService.update();
//                break;
//        }

        //Tạo dữ liệu khách hàng
        Customer kh1 = new Customer(1, "Huỳnh Nguyễn", new Date(2001,1,1), "Nam", "4573436272", "12342344534", "Diamond", "HaNoi");
        Customer kh2 = new Customer(2, "Nguyễn Nhật Sang", new Date(2000,1,1), "Nam", "4573436272", "12342344534", "Diamond", "HaNoi");
        Customer kh3 = new Customer(3, "Nguyen Thanh Dat", new Date(2003,1,1), "Nam", "4573436272", "12342344534", "Diamond", "HaNoi");
        Customer kh4 = new Customer(4, "Truong Tan Dat", new Date(2005,1,1), "Nam", "4573436272", "12342344534", "Diamond", "HaNoi");
        Customer kh5 = new Customer(5, "Nguyen Anh Tuan", new Date(1999,1,1), "Nam", "4573436272", "12342344534", "Diamond", "HaNoi");
        customerService.themKhachHang(kh1);
        customerService.themKhachHang(kh2);
        customerService.themKhachHang(kh3);
        customerService.themKhachHang(kh4);
        customerService.themKhachHang(kh5);

        //Tạo dữ liệu nhân viên
        Employee nv1 = new Employee(1, "Huỳnh Nguyễn", new Date(2001,1,1), "Nam", "4573436272", "12342344534", "nguyenyl1263@gmai.com", "Đại học", "Nhân viên", "100");
        Employee nv2 = new Employee(2, "Trương Tấn Đạt", new Date(2001,1,1), "Nam", "4573436272", "12342344534", "nguyenyl1263@gmai.com", "Đại học", "Quản lý", "1000");
        Employee nv3 = new Employee(3, "Dương Khắc Trí", new Date(2001,1,1), "Nam", "4573436272", "12342344534", "nguyenyl1263@gmai.com", "Đại học", "Nhân viên", "100");
        Employee nv4 = new Employee(4, "Nguyễn Hữu Phúc", new Date(2001,1,1), "Nam", "4573436272", "12342344534", "nguyenyl1263@gmai.com", "Đại học", "Nhân viên", "100");

        employeeService.themNhanVien(nv1);
        employeeService.themNhanVien(nv2);
        employeeService.themNhanVien(nv3);
        employeeService.themNhanVien(nv4);

        int choiceMenuChinh, choiceKhachHang, choiceNhanVien;
        boolean mainThread, threadKhachHang, threadNhanVien;
        mainThread = true;
        while (mainThread) {
            threadKhachHang =  true;
            threadNhanVien  = true;
            menuChinh();
            choiceMenuChinh = sc.nextInt();
            switch (choiceMenuChinh) {
                case 1:
                    while (threadKhachHang) {
                        menuKhachHang();
                        choiceKhachHang = sc.nextInt();

                        switch (choiceKhachHang) {
                            case 1:
                                System.out.println("Danh sách khách hàng là: ");
                                customerService.xuatDanhSachKhachHang();
                                break;
                            case 2:
                                System.out.println("Thêm thông tin khách hàng mới");
                                Customer khachHangMoi = new Customer();
                                khachHangMoi.nhapDuLieuKhachHang();
                                customerService.themKhachHang(khachHangMoi);
                                break;
                            case 3:
                                System.out.println("\nCập nhật thông tin khách hàng");
                                customerService.xuatDanhSachKhachHang();
                                System.out.print("\nID khách hàng muốn cập nhật thông tin: ");
                                int id = sc.nextInt();
                                System.out.println(customerService.getKhachHang(id));
                                customerService.suaKhachHang(id);
                                break;
                            case 4:
                                System.out.println("\nXoá thông tin khách hàng");
                                customerService.xuatDanhSachKhachHang();
                                System.out.print("\nID khách hàng cần xoá: ");
                                int ID = sc.nextInt();
                                customerService.xoaKhachHang(ID);
                                break;
                            case 0:
                                threadKhachHang = false;
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        }
                    }
                    break;
                case 2:
                    while (threadNhanVien) {
                        menuNhanVien();
                        choiceNhanVien = sc.nextInt();

                        switch (choiceNhanVien) {
                            case 1:
                                System.out.println("Danh sách nhân viên là: ");
                                employeeService.xuatDanhSachNhanVien();
                                break;
                            case 2:
                                System.out.println("Thêm thông tin nhân viên mới");
                                Employee nhanVienMoi = new Employee();
                                nhanVienMoi.nhapDuLieuNhanVien();
                                employeeService.themNhanVien(nhanVienMoi);
                                break;
                            case 3:
                                System.out.println("\nCập nhật thông tin nhân viên");
                                employeeService.xuatDanhSachNhanVien();
                                System.out.print("\nID nhân viên muốn cập nhật thông tin: ");
                                int id = sc.nextInt();
                                System.out.println(employeeService.getNhanVien(id));
                                employeeService.suaNhanVien(id);
                                break;
                            case 4:
                                System.out.println("\nXoá thông tin nhân viên");
                                employeeService.xuatDanhSachNhanVien();
                                System.out.print("\nID nhân viên cần xoá: ");
                                int ID = sc.nextInt();
                                employeeService.xoaNhanVien(ID);
                                break;
                            case 5:
                                System.out.print("Nhập tên nhân viên cần tra cứu: ");
                                sc.nextLine();
                                String ten = sc.nextLine();
                                if(ten == ten){
                                    System.out.println("Danh sách sau khi tra cứu theo tên nhân viên là:");
                                    employeeService.traCuuTheoTenNhanVien(ten).xuatDanhSachNhanVien();
                                } else {
                                    System.out.println("Không tồn tại nhân viên có tên: "+ ten);
                                }
                                break;
                            case 6:
                                System.out.print("Nhập chức vụ cần tra cứu: ");
                                sc.nextLine();
                                String chucvu = sc.nextLine();
                                if(chucvu == chucvu){
                                    System.out.println("Danh sách sau khi tra cứu theo chức vụ là:");
                                    employeeService.traCuuTheoChucVu(chucvu).xuatDanhSachNhanVien();
                                } else {
                                    System.out.println("Không tồn tại nhân viên có chức vụ: "+ chucvu);
                                }
                                break;
                            case 0:
                                threadNhanVien = false;
                                break;
                            default:
                                System.out.println("Loi!");
                                break;
                        }
                    }
                    break;
                case 0:
                    mainThread = false;
                    break;
                default:
                    System.out.println("Lỗi !!!");
                    break;
            }
        }
    }
        public static void menuChinh() {
            System.out.println("\n\n----------- Menu chính ------------");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý nhân viên");
            System.out.println("0. Thoát khỏi chương trình!");
            System.out.println("-----------------------------------");
            System.out.print("Bạn chọn: ");
        }
    public static void menuKhachHang() {
        System.out.println("\n\n----------- Menu quản lý khách hàng ------------");
        System.out.println("1. Xuất danh sách khách hàng");
        System.out.println("2. Thêm thông tin khách hàng mới");
        System.out.println("3. Cập nhật thông tin của khách hàng");
        System.out.println("4. Xoá thông tin của khách hàng");
        System.out.println("0. Trở lại menu chính!");
        System.out.println("------------------------------------------------");
        System.out.print("Bạn chọn: ");
    }
    public static void menuNhanVien() {
        System.out.println("\n\n----------- Menu quản lý nhân viên ------------");
        System.out.println("1. Xuất danh sách nhân viên");
        System.out.println("2. Thêm thông tin nhân viên mới");
        System.out.println("3. Cập nhật thông tin của nhân viên");
        System.out.println("4. Xoá thông tin của nhân viên");
        System.out.println("5. Tra cứu nhân viên theo tên");
        System.out.println("6. Tra cứu nhân viên theo chức vụ");
        System.out.println("0. Trở lại menu chính!");
        System.out.println("------------------------------------------------");
        System.out.print("Bạn chọn: ");
    }
}
