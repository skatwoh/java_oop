/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Scanner;

public class Them {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLSP ql = new QLSP();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập DSSP");
                    ql.nhapDSSP();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất DSSP");
                    ql.xuatDSSP();
                    break;
                case 3:
                    System.out.println("Bạn chọn sắp xếp theo đơn giá");
                    ql.sapTheoDonGia();
                    System.out.println("đã sắp");
                    ql.xuatDSSP();
                    break;
                case 4:
                    System.out.println("Bạn chọn khởi tạo");
                    ql.khoiTao();
                    System.out.println("Đã khởi tạo thành công!");
                    ql.xuatDSSP();
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
        System.out.println("|1. Nhập DSSP                     |");
        System.out.println("|2. Xuất DSSP                     |");
        System.out.println("|3. Sắp xếp theo đơn giá          |");
        System.out.println("|4. Khởi tạo                      |");
        System.out.println("|0. Thoát                         |");
        System.out.println("-----------------------------------");
        System.out.println("Mời chọn: ");
    }

}
