/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        DSFan ds = new DSFan();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập");
                    ds.inputDSFan();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất");
                    ds.outputFan();
                    break;
                case 3:
                    System.out.println("Bạn chọn xuất > 500");
                    ds.countFan();
                    break;
                case 4:
                    System.out.println("Bạn chọn xuất thông tin nhỏ nhất");
                    ds.findFan();
                    break;
                case 5:
                    System.out.println("Bạn chọn khởi tạo");
                    ds.init();
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
        System.out.println("-------------------------------");
        System.out.println("|1. Nhập                      |");
        System.out.println("|2. Xuất                      |");
        System.out.println("|3. Xuất tt > 500             |");
        System.out.println("|4. Xuất tt giá nhỏ nhất      |");
        System.out.println("|5. Khởi tạo                  |");
        System.out.println("|0. Thoát                     |");
        System.out.println("-------------------------------");
        System.out.println("Mời chọn: ");
    }
}
