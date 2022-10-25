/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

public class Bai1_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập cạnh: ");
        double canh = sc.nextDouble();
        
        System.out.println("\nThông tin bạn cần là: ");
        System.out.printf("Thể tích khối lập phương là: "+Math.pow(canh, 3));
    }
    
}
