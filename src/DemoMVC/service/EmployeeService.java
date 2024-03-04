package DemoMVC.service;

import DemoMVC.entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<Employee> danhSachNhanVien;

    private String LABEL = String.format("%s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-20s\t%-15s\t%-15s\t%-15s",
            "ID", "Họ tên", "Ngày sinh", "Giới Tính", "CCCD", "Số ĐT", "Email", "Qualification", "Position", "Salary");

    public EmployeeService() {
        this.danhSachNhanVien = new ArrayList<>();
    }

    public void themNhanVien(Employee employee) {
        this.danhSachNhanVien.add(employee);
    }

    public void xoaNhanVien(int id) {
        int vitri = EmployeeService.this.tonTai(id);
        if (vitri == -1) {
            System.out.println("Không tìm thấy id nhân viên!");
        } else {
            this.danhSachNhanVien.remove(EmployeeService.this.tonTai(id));
        }
    }

    private int tonTai(int id) {
        for (int i = 0; i < this.danhSachNhanVien.size(); i++) {
            if (this.danhSachNhanVien.get(i).getEmployeeId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void suaNhanVien(int id) {
        int viTri = EmployeeService.this.tonTai(id);
        if (viTri == -1) {
            System.out.println("Không tìm thấy id nhân viên!");
        } else {
            System.out.printf("\nCập nhật thông tin nhân viên có ID = %d", id);
            this.danhSachNhanVien.get(viTri).nhapDuLieuNhanVien();
        }
    }

    public void xuatDanhSachNhanVien() {
        System.out.println(this.LABEL);
        for (Employee employee : danhSachNhanVien) {
            System.out.println(employee);
        }
    }

    public Employee getNhanVien(int id) {
        for (int i = 0; i < this.danhSachNhanVien.size(); i++) {
            if (this.danhSachNhanVien.get(i).getEmployeeId() == id) {
                return this.danhSachNhanVien.get(i);
            }
        }
        return null;
    }

    public EmployeeService traCuuTheoTenNhanVien(String ten) {
        EmployeeService result = new EmployeeService();

        for (Employee employee : danhSachNhanVien) {
            if (employee.getFullName().toLowerCase().contains(ten.toLowerCase()) == true) {
                result.themNhanVien(employee);
            }
        }
        return result;
    }

    public EmployeeService traCuuTheoChucVu(String chucvu) {
        EmployeeService result = new EmployeeService();
        for (Employee employee : danhSachNhanVien) {
            if (employee.getPosition().toLowerCase().contains(chucvu.toLowerCase()) == true) {
                result.themNhanVien(employee);
            }
        }
        return result;
    }
}
