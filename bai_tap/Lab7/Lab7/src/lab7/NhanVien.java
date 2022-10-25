/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;


public class NhanVien {
    //Khai báo thuộc tính, phương thức như bình thường
    //thuộc tính: hoTen, luong
    //hàm tạo
    //set, get
    //toString
    //nhap()
    //inThongTin()
    private String hoTen;
    private double luong;

    public NhanVien() {
    }
    
    public NhanVien(String hoTen, double luong){
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", luong=" + luong + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập lương: ");
        luong = Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println(toString());
    }
}
