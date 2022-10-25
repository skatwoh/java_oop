/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

    import java.util.Scanner;

public class Them {

   
    public static void main(String[] args) {
//       Dùng switch –case:
//Nhập tháng, năm => in ra số ngày trong tháng
//Tháng 1,3, 5,7,8,10,12 có 31 ngày
//Tháng 4,6,9,11:  có 30 ngày
//Tháng 2:
//	Năm nhuận: 29 ngày
//	Không nhuận: 28 ngày
    Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập năm: ");
        int year = Integer.parseInt(sc.nextLine());
        
        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.print("Có 31 ngày");
                break;
            case 4,6,9,11:
                System.out.print("Có 30 ngày");
            case 2:
                if(year%4 == 0 && year%100 !=0 || year % 400 == 0) {
                    System.out.print("Có 29 ngày");
                } else {
                    System.out.print("Có 28 ngày");
                }
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
