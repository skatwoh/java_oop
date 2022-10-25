/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        //Nhập email đúng định dạng
        Scanner sc = new Scanner(System.in);
        String email, mauEmail ="\\w+@\\w+(\\.\\w+){1,2}";
        String phone, mauPhone ="0\\d{9,10}";
        String chungMinh, mauChungMinh="[0-9]{9}";

        while (true) {
            System.out.print("Mời nhập email: ");
            email = sc.nextLine();
            if (email.matches(mauEmail)) {
                System.out.println("Email đúng định dạng.");
                break;
            } else {
                System.out.println("Email sai định dạng.");
            }
        }
        System.out.println("\n Email nhập là"+email);
        while (true) {            
            System.out.print("Mời nhập phone: ");
            phone = sc.nextLine();
            
            if (phone.matches(mauPhone)) {
                System.out.println("Số điện thoại đúng định dạng.");
                break;
            } else {
                System.out.println("Số điện thoại sai dịnh dạng.");
            }
        }
        System.out.println("\n Số điện thoại bạn nhập là: "+phone);
        while (true) {            
            System.out.print("Mời nhập CMND: ");
            chungMinh = sc.nextLine();
            
            if (chungMinh.matches(mauChungMinh)) {
                System.out.println("CMND dúng định dạng.");
                break;
            } else {
                System.out.println("CMND sai dịnh dạng.");
            }
        }
        System.out.println("\n CMND bạn nhập là: "+chungMinh);
    }

}