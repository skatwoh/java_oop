/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;


public class Lab6 {

    
    public static void main(String[] args) {
        //Nhập họ tên => tách họ, đệm, tên
        Scanner sc = new Scanner(System.in);
        String hoTen;
        System.out.print("Mời nhập họ tên: ");
        hoTen = sc.nextLine();
        
        System.out.println("\nHọ tên bạn vừa nhập: "+hoTen);
        System.out.println("in hoa: "+hoTen.toUpperCase());
        System.out.println("in thường: "+hoTen.toLowerCase());
        System.out.println("Độ dài: "+ hoTen.length());
        
        //tach họ, đệm, tên
        int vtd = hoTen.indexOf(" ");//tìm vị trí xuất hiện đầu tiên của khoảng trắng
        int vtc = hoTen.lastIndexOf(" ");//tìm vị trí xuất hiện cuối cùng của khoảng trắng
        
        String ho = hoTen.substring(0, vtd);
        String dem = hoTen.substring(vtd+1, vtc);
        String ten = hoTen.substring(vtc+1);
        
        System.out.println("\nHọ: "+ho);
        System.out.println("Đệm: "+dem);
        System.out.println("Tên: "+ten);
        System.out.println("Tên in hoa: "+ten.toUpperCase());
    }
    
}
