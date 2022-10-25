/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Test1 {

    
    public static void main(String[] args) {
      long a, b;
      double x;
      Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập a: ");
        a = Long.parseLong(sc.nextLine());
        System.out.print("Mời nhập b: ");
        b = Long.parseLong(sc.nextLine());
        
        x = (double) -b/a;
        System.out.println("Nghiệm: "+x);
        // boolean kq;
        //...
        //if (kq) <=> if (kq true)
        //if (!kq) <=> if (kq false)
        //a-=5 <=> a = a + 5
    }
    
}
