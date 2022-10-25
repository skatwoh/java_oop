/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;



public class Bai1 {

    
    public static void main(String[] args) {
       SanPham sp = new SanPham();
       
        System.out.println("Mời nhập thông tin: ");
        sp.nhap();
        
        System.out.println("Thông tin sản phẩm là: ");
        System.out.println("Tên sản phẩm|\tĐơn giá|\tGiảm giá|\tThuế nhập khẩu");
        sp.xuat();
    }
    
}
