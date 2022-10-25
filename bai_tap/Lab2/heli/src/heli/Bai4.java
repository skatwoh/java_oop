/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Bai4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;
        while (true) {            
            menu();
            answer = Integer.parseInt(sc.nextLine());
            switch (answer) {
                case 1:
                    giaiPhuongTrinhBacNhat();
                    break;
                case 2:
                    giaiPhuongTrinhBacHai();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai cu phap moi nhap lai!!!");
                    break;
            }
        }
        
    }
    
    public static void menu() {
        System.out.println("+-----------------------------------+");
        System.out.println("1.Giai phuong trinh bac nhat");
        System.out.println("2.Giai phuong trinh bac hai");
        System.out.println("3.Tinh tien dien");
        System.out.println("4.Thoat");
        System.out.println("+-----------------------------------+");
        System.out.println("Chon chuc nang: ");
        
    }
    
    public static void giaiPhuongTrinhBacNhat() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Moi ban nhap so a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap so b: ");
        b = Integer.parseInt(sc.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat la: " + x);
        }
    }
    
    public static void giaiPhuongTrinhBacHai() {
        Scanner sc = new Scanner(System.in);
        double delta, x1, x2, x;
        System.out.println("Moi ban nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Moi ban nhap so a: ");
        double c = sc.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            x = -c / b;
            System.out.println("Phuong trinh co nghiem la x = " + x);
        } else {
            if (delta < 0) {
                System.out.println("Phuong trinh vo ngiem");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep la x =" + x);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet la x1 = %f\n x2 = %f", x1, x2);
            }
        }
    }
    
    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        double tien1, tien2;
        System.out.println("Moi nhap so dien: ");
        int soDien = sc.nextInt();
        tien1 = soDien * 1000;
        tien2 = 50 * 1000 + (soDien - 50) * 1200;
        
        if (soDien < 0) {
            System.out.println("So dien khong hop le. Moi nhap lai");
        } else if (soDien > 0 && soDien < 50) {
            System.out.println("Tien dien thang nay la: " + tien1);
        } else if (soDien >= 50) {
            System.out.printf("Tien dien thang nay la: %.1f", tien2);
        } else {
            System.out.println("Khong hop le!!!");
        }
    }
}
