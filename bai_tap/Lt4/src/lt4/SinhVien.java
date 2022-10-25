/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt4;

import java.util.Scanner;


public class SinhVien {
    //Khai báo thuộc tính <=> giống khai báo biến
    private String hoTen;
    private double diem;
    
    //Hàm tạp không tham số

    public SinhVien() {
    }
    
    
    //Hàm tạo 2 tham số
    public SinhVien(String hoTen, double diem) {
        this.diem = diem;
        this.hoTen = hoTen;
    }
    //bổ sung các phương thức getter và setter để đọc ghi các trường đã che dấu
    //các phương thức set: gán dữ liệu cho các thuộc tính (trường)
    //các phương thức get: lấy dữ liệu của các thuộc tính (trường)

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    //Khai báo các phương thức <=> giống khai báo hàm (function)
    public void nhap(){ //Nhập thông tin cho các thuộc tính
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Mời nhập điểm: ");
        diem = Double.parseDouble(sc.nextLine()); 
    }
    public void xuat(){// xuất thông tin
        System.out.println(hoTen + "\t" + diem);
    }
    public void inThongTin(){// xuất thông tin
        System.out.println(hoTen + "\t" + diem +"\t" + getXepLoai());
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", diem=" + diem 
                + "\tXếp loại: "+getXepLoai(diem) +'}';
    }
    
    //Nạp chồng phương thức getXepLoai
    public String getXepLoai() {
        if(diem < 5) {
            return "Trượt";
        } else {
            return "Đạt";
        }
    }
    public String getXepLoai(double diem){
        if(diem < 5) {
            return "Trượt";
            } else if (diem<7){
                return "TB";
        } else {
            return "Đạt";
        }
    }
}
