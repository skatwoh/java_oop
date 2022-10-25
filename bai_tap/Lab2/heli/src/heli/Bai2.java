/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Bai2 {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double delta, x1, x2, x;
     System.out.println("Moi ban nhap so a: ");
     double a = sc.nextDouble();
     System.out.println("Moi ban nhap so b: ");
     double b = sc.nextDouble();
     System.out.println("Moi ban nhap so c: ");
     double c = sc.nextDouble();
     
     delta = Math.pow(b, 2) - 4*a*c;
     if(a == 0) {
         x = -c/b;
         System.out.println("Phuong trinh co nghiem la x = "+x);
     } else {
         if(delta < 0) {
             System.out.println("Phuong trinh vo ngiem");
         } else if (delta == 0) {
             x = -b/(2*a);
             System.out.println("Phuong trinh co nghiem kep la x ="+x);
         } else {
             x1 = (-b+Math.sqrt(delta))/(2*a);
             x2 = (-b-Math.sqrt(delta))/(2*a);
             System.out.printf("Phuong trinh co 2 nghiem phan biet la x1 = %f\n x2 = %f", x1, x2);
         }
     }
    }
    
}
