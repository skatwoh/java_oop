/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;


public class SanPham {
    private String ten;
    private double donGia;
    private double giamGia;
    
    public SanPham() {
        
    }

    public SanPham(String ten, double donGia, double giamGia) {
        this.ten = ten;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    
    
    private double getThueNhapKhau() {
        return this.donGia*0.1;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập giảm giá: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }
    public void xuat() {
        System.out.println(ten + "\t" + donGia + "\t" + giamGia + "\t" + getThueNhapKhau() );
    }

    @Override
    public String toString() {
        return "SanPham{" + "ten=" + ten + ", donGia=" + donGia + ", giamGia=" + giamGia 
                +"Thuế nhập khẩu =" +getThueNhapKhau()+'}';
    }
    
}

