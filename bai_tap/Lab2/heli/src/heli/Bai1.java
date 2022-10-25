/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Bai1 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b;
      System.out.println("Moi ban nhap so a: ");
      a = sc.nextInt();
      System.out.println("Moi ban nhap so b: ");
      b = sc.nextInt();
      if(a == 0) {
          if( b == 0) {
              System.out.println("Phuong trinh vo so nghiem");
          } else {
              System.out.println("Phuong trinh vo nghiem");
          }
      } else {
          float x = (float) -b/a;
          System.out.println("Phuong trinh co nghiem duy nhat la: "+x);
      }
    }
    
}
