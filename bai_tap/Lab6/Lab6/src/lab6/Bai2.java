/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.ArrayList;


public class Bai2 {

    
    public static void main(String[] args) {
        ArrayList<SanPham> lstSanPham = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            lstSanPham.add(sp);
        }
        System.out.println("Điện thoại hãng Nokia là: ");
        for (SanPham sanPham : lstSanPham) {
            if(sanPham.getHang().equalsIgnoreCase("Nokia")) {
                sanPham.xuat();
            }
        }
    }
    
}
