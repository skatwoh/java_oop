/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

public class Bai1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập số b: ");
        double b = sc.nextDouble();
        System.out.println("Mời bạn nhập số c: ");
        double c = sc.nextDouble();
        
        System.out.println("\nThông tin bạn cần là: ");
        System.out.printf("Delta = "+(Math.pow(b, 2)-4*a*c));
    }
    
}
