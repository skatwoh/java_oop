/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Test123 {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        int thang, nam;
        System.out.println("Mời nhập Lháng:");
        thang = nhapThang();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng a có 31 ngày \n", thang);
                break;
                
    }   
}
    public static int nhapThang() {
        Scanner sc = new Scanner(System.in);
        int thang;
        do {
            System.out.print("Moi nhap thang: ");
            thang = Integer.parseInt(sc.nextLine());
            
        } while(thang <1 || thang > 12);
        return thang;
    }
    
}
