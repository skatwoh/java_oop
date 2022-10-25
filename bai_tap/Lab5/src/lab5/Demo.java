/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLSV ql = new QLSV();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập DSSV");
                    ql.nhapDSSV();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất DSSV");
                    ql.xuatDSSV();
                    break;
                case 3:
                    System.out.println("Bạn chọn xóa SV");
                    ql.xoaSinhVien();
                    break;
                case 7:
                    System.out.println("Bạn chọn sắp xếp theo tên");
                    ql.sapTheoDiem();
                    System.out.println("đã sắp");
                    ql.xuatDSSV();
                    break;
                case 11:
                    System.out.println("Bạn chọn khởi tạo");
                    ql.khoiTao();
                    System.out.println("Đã khởi tạo thành công!");
                    ql.xuatDSSV();
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mục bạn chọn không có");
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("|1. Nhập DSSV                     |");
        System.out.println("|2. Xuất DSSV                     |");
        System.out.println("|3. Xóa SV                        |");
        System.out.println("|7. Sắp xếp theo tên              |");
        System.out.println("|8. Sắp xếp theo điểm             |");
        System.out.println("|11. Khởi tạo                     |");
        System.out.println("|0. Thoát                         |");
        System.out.println("-----------------------------------");
        System.out.println("Mời chọn: ");
    }

}
