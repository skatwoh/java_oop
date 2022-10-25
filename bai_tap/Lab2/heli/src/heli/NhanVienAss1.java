/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli;

import java.util.Scanner;


public class NhanVienAss1 {
    private String maNV;
    private String hoTen;
    private double luong;
    
    public Double getThuNhap(){
        return this.luong;
        
    }
    
    public Double getThueTN(){
        if(this.getThuNhap() < 9000000){
            return 0.0;
        } else if(this.getThuNhap() < 15000000){
            return  this.getThuNhap()*0.1;
        } else {
            return this.getThuNhap()*0.12;
        }
    }
    
    public NhanVienAss1(String maNV, String hoTen, double luong) {
       this.maNV = maNV;
       this.hoTen = hoTen;
       this.luong = luong;
    }

    public NhanVienAss1() {
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVienAss1{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập mã nhân viên: ");
       maNV = sc.nextLine();
        System.out.print("Mời nhập tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập lương của nhân viên: ");
        luong = Double.parseDouble(sc.nextLine());
        
        System.out.print("Chức vụ(\n\t1. Trưởng phòng \n\t2. Tiếp thị \n\t3. Hành chính): \n");
        int cv = Integer.parseInt(sc.nextLine());
        
        if(cv == 1){
            System.out.print("Tiền trách nhiệm: ");
            Double trachNhiem = Double.parseDouble(sc.nextLine());
            NhanVienAss1 nv = new TruongPhong(maNV, hoTen, luong, trachNhiem);
        } else{
            System.out.print("Tiền doanh số:  ");
            Double doanhSo = Double.parseDouble(sc.nextLine());
            System.out.print("Tiền huê hồng:  ");
            Double hueHong = Double.parseDouble(sc.nextLine());
            NhanVienAss1 nv = new TruongPhong(maNV, hoTen, luong, doanhSo, hueHong);
        }
    }
    
    public void xuat(){
        System.out.println(toString());
    }
    
    
}
