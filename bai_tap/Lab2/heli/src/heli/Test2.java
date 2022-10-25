/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Test2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        try {
            //Nội dung đặt trong try
            System.out.print("Mời bạn nhập tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Tuổi bạn vừa nhập là: "+tuoi);
        } catch (Exception e) {
            //xử lý lỗi đặt trong catch
            System.out.println("Vui lòng nhập tuổi là số!");
        }
    }
    
}
