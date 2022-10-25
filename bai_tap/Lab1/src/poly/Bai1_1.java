/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

public class Bai1_1 {

    public static void main(String[] args) {
        System.out.println("Bài 1_1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Mời nhập điểm TB: ");
        double diem = sc.nextDouble();
        
        System.out.println("\nThông tin bạn vừa nhâp là: ");
        System.out.printf("Họ và tên: %s\n", hoTen);
        System.out.printf("Điểm TB: %.2f\n", diem);
    }
    
}
