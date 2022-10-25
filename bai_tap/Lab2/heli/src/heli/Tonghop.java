/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Tonghop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {            
            menu();
            chon = Integer.parseInt(sc.nextLine());
            
            switch (chon) {
                case 1:
                    nhapTuoi();
                    break;
                case 2:
                    xepLoai();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mục bạn chọn ko có");
                    break;
            }
        }        
    }
    
    public static void menu() {
        System.out.println("\n\n--------------------------------------------------------");
        System.out.println("|1. Nhập tuổi                                |");
        System.out.println("|2. Xếp loại                                 |");
        System.out.println("|0. Thoát                                    |");
        System.out.println("\n\n--------------------------------------------------------");
        System.out.print("Mời bạn chọn 1 mục");
    }

    public static void nhapTuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        
        System.out.println("Tuổi của bạn là: " + tuoi);
    }

    public static void xepLoai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập xếp loai: ");
        int xepLoai = Integer.parseInt(sc.nextLine());
        
        System.out.println("Xếp loại của bạn là: " + xepLoai);
    }
    
}
