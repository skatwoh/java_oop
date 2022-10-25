/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLPH ql = new QLPH();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập");
                    ql.NDSPH();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất");
                    ql.XDSPH();
                    break;
                case 3:
                    System.out.println("Bạn chọn đếm phòng học nhà P");
                    ql.dem();
                    break;
                case 4:
                    System.out.println("Bạn chọn xuất danh sách phòng tầng 3");
                    ql.xuatDSTang3();
                    break;
                case 5:
                    System.out.println("Bạn chọn sắp xếp ");
                    ql.sapXepGiamDan();
                    break;
                    case 6:
                    System.out.println("Bạn chọn kế thừa ");
                    PhongNghiGV gv = new PhongNghiGV("GDQP", "p1", 3, "f");
//                        System.out.println(gv);
                    gv.inThongTin();
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát ");
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
        System.out.println("|1. Nhập danh sách PH              ");
        System.out.println("|2. Xuất danh sách PH              ");
        System.out.println("|3. Đếm phòng học nhà P            ");
        System.out.println("|4. Xuất danh sách PH của tầng 3   ");
        System.out.println("|5. Sắp xếp phòng học theo nhà giảm");
        System.out.println("|6. Kế thừa                         ");
        System.out.println("|0. Thoát                          ");
        System.out.println("-----------------------------------");
        System.out.println("Mời bạn chọn: ");
    }
}
