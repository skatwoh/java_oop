/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


public class Bai2 {

    
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        
        System.out.println("Mời nhập thông tin sp1: ");
        sp1.nhap();
        System.out.println("Mời nhập thông tin sp2: ");
        sp2.nhap();
        
        System.out.println("Thông tin của các sp là: ");
        System.out.println("Tên | Đơn giá | Giảm giá | Thuế");
        sp1.xuat();
        sp2.xuat();
    }
    
}
