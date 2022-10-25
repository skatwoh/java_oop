/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poly2;

import lt4.SinhVien;


public class Demo3 {

    
    public static void main(String[] args) {
        //ta đang ở gói poly2, muốn dùng SinhVien (SinhVien đang ở gói lt4)
        //=> phải import tengoi.TenLop: import lt4.SinhVien;
        SinhVien sv = new SinhVien("Quốc Khánh", 10);
        sv.inThongTin();
        System.out.println(sv.toString());
        System.out.println(sv);//không gọi toString, mặc định toString được gọi
    }
    
}
