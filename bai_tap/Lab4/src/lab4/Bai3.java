/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


public class Bai3 {

    
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("quan", 10000);
        SanPham sp2 = new SanPham("ao", 12000, 1000);
        
        System.out.println("Thông tin sp là:");
        System.out.println("Tên|Đơn giá|Giảm giá|Thuế");
        sp1.xuat();
        sp2.xuat();
    }
    
}
