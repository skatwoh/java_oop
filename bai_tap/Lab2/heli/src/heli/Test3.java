/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;

public class Test3 {

      //Nếu điểm <5: Trượt, còn lại thì Đạt
        //C1: Dùng toán tử điều kiện
        //C2: dùng if...else
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập điểm: ");
        double diem = Double.parseDouble(sc.nextLine());
        //C1:
        if(diem > 0 && diem < 5){
            System.out.println("Trượt");
        } else {
            System.out.println("Đạt");
        }
        //C2: toán tử điều kiện
        String xepLoai = diem < 5 ? "Trượt" : "Đạt";
        System.out.println("Xếp loại: "+xepLoai);
        //C3: nhiều if
        //Nếu điểm <5: Trượt
        //Nếu điểm từ 5 đến <7: Trung Bình
        //Còn lại: Tốt
        if(diem>0 && diem<5){
            System.out.println("Trượt");
        } else if(diem>7) {
            System.out.println("Trung Bình");
        } else {
            System.out.println("Tốt");
        }
    }
    
}
