/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;


public class SinhVien {
   //Khai báo thuộc tính hoTen, diem
    private String hoTen;
    private double diem;
    //Hàm tạo

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    //set, get
    public double getDiem() {    
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    //toString
    @Override    
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem + '}';
    }

    //nhap()
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập điểm: ");
        diem = Double.parseDouble(sc.nextLine());
    }
    //xuat()
    public void xuat(){
        System.out.println(hoTen + "\t" + diem);
    }
    public SinhVien() {
    }
}
