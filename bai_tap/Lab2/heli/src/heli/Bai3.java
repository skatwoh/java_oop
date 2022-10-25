/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Bai3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tien1, tien2;
        System.out.println("Moi nhap so dien: ");
        int soDien = sc.nextInt();
        tien1=soDien*1000;
        tien2=50*1000 + ( soDien-50)*1200;
        
        if(soDien < 0) {
            System.out.println("So dien khong hop le. Moi nhap lai");
        } else if(soDien > 0 && soDien < 50){
            System.out.println("Tien dien thang nay la: "+tien1);
        } else if(soDien >= 50) {
            System.out.printf("Tien dien thang nay la: %.1f", tien2);
        } else {
            System.out.println("Khong hop le!!!");
        }
    }
    
}
