/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

public class Bai2 {

 
    public static void main(String[] args) {
        System.out.println("Bai2");
        Scanner sc = new Scanner(System.in); //tạo đối tượng scanner
        String hoTen;
        int tuoi;
        double diem;
        
        System.out.print("Mời nhâp họ tên: ");
        hoTen = sc.nextLine(); // đọc vào 1 chuỗi
        System.out.print("Mời nhập tuổi: ");
        tuoi = sc.nextInt(); //đọc vào 1 số nguyên
        System.out.print("Mời nhập điểm: ");
        diem = sc.nextDouble(); //đọc vào 1 số thực
        
        System.out.println("\n Thông tin bạn vừa nhập là: printf");
        System.out.printf("Họ tên: %s\n", hoTen);
        System.out.printf("Tuổi: %d\n", tuoi);
        System.out.printf("Điểm: %.2f\n", diem);
        
        System.out.println("\n Thông tin bạn vừa nhập là: ");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm: " + diem);
    
    }
}
