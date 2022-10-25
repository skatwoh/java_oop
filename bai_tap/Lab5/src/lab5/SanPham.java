/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;


public class SanPham {
     private String name;
    private double donGia;
    private String xuatXu;
    
    public SanPham(String name, double donGia, String xuatXu) {
        this.name = name;
        this.donGia = donGia;
        this.xuatXu = xuatXu;
    }

    public String getName() {
        return name;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public String toString() {
        return "SanPham{" + "name=" + name + ", donGia=" + donGia + ", xuatXu=" + xuatXu + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        name = sc.nextLine();
        System.out.print("Mời nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập xuất xứ: ");
        xuatXu = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println(name + "\t" + donGia + "\t" + xuatXu);
    }
    public SanPham() {
    }
    
}
