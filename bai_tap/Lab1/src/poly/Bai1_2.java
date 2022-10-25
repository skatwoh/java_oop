/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

public class Bai1_2 {

    
    public static void main(String[] args) {
        System.out.println("Bài 1_2");
        Scanner sc = new Scanner(System.in);
        double dai;
        double rong;
        
        System.out.print("Mời nhập chiều dài: ");
        dai = sc.nextDouble();
        System.out.print("Mời nhập chiều rộng: ");
        rong = sc.nextDouble();
        
        System.out.println("\nThông tin bạn cần là: ");
        System.out.println("Chu vi là: " +(dai+rong)*2 );
        System.out.println("Diện tích là: "+(dai*rong));
        System.out.println("Cạnh nhỏ nhất là: "+Math.min(dai, rong));
    }
}