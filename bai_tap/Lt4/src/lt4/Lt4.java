/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lt4;

public class Lt4 {

    public static void main(String[] args) {
        //Tạo 2 đối tượng SinhVien sv1, sv2
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        //Nhập thông tin cho sv1, sv2.
        System.out.println("Mời nhập thông tin sv1: ");
        sv1.nhap();
        System.out.println("Mời nhập thông tin sv2: ");
        sv2.nhap();

        //Xuất thông tin sv1, sv2
        System.out.println("\nThông tin sv là:");
        System.out.println("Tên \t Điểm");
        sv1.xuat(); //sv1.inThongTin();
        sv2.xuat();

        //Tên của sv2 là
        //System.out.println("Tên của sv2: " + sv2.hoTen);
        System.out.println("Tên của sv2: "+sv2.getHoTen());
        //Sửa tên của sv2 thành tên mình
        //sv2.hoTen = "Đào Quốc Khánh";
        sv2.setHoTen("Đào Quốc Khánh");
        //Sua điểm của sv2 thành 10
        //sv2.diem = 10;
        sv2.setDiem(10);
        //In thông tin sv2 sau khi sửa
        System.out.println("Thông tin sv2 sau khi sửa là: ");
        //sv2.inThongTin();
        System.out.println("sv2");
    }

}
