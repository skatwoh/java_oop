/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;


public class Lab7 {

   
    public static void main(String[] args) {
        // Tạo đối tượng NhanVien nv dùng hàm tạo có tham số
        NhanVien nv = new NhanVien("Nguyen Van A", 10000);
        //xuất thông tin
        nv.xuat();
//        System.out.println(nv);

        //Tạo đối tượng TruongPhong tp dùng hàm tạo có tham số
        TruongPhong tp = new TruongPhong("nguyen van b", 10000, 1);
        //xuất thông tin tp
        tp.xuat();

        //Tạo đối tượng TruongPhong tp2 dùng hàm tạo không tham số
        TruongPhong tp2 = new TruongPhong();
        //nhập thông tin tp2
        tp2.nhap();
        //xuất thông tin tp2
        tp2.xuat();
    }
    
}
