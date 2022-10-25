/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.util.Scanner;

public class TruongPhong extends NhanVien {//Truongphong kế thừa Nhanvien
    //=> TruongPhong dùng được tài sản(thuộc tính, phương thức)của cha (NhanVien) nếu cha cho phép.
    //Cho phép: public, protected, và (default nếu cùng gói)
    //khai báo thuộc tính, phương thức như bình thường

    private double trachNhiem;

    //Hàm tạo
    public TruongPhong() {
//        super();//gọi hàm tạo không tham số của cha
//        trachNhiem =0;
    }

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);//gọi hàm tạo 2 tham số của cha
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap();//gọi phương thức nhập của cha để nhập ho tên, lương
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập trách nhiệm: ");
        trachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\ttrachNhiem=" + trachNhiem + '}';
    }

    @Override
    public void xuat() {
//        super.xuat(); // Gọi inThongTin của cha
//        System.out.println("Trách nhiệm: "+trachNhiem);
        System.out.println(toString());
    }

}
