/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;


public class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        tenSp = sc.nextLine();
        System.out.print("Mời nhập giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập hãng: ");
        hang = sc.nextLine();
    }
    public void xuat(){
        System.out.println(tenSp +"\t"+ donGia +"\t"+ hang);
    }
}
