/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heli;

import java.util.Scanner;


public class Ass1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLNV ql = new QLNV();
        while (true) {            
            menu();
            chon = Integer.parseInt(sc.nextLine());
            
            switch(chon){
                case 1:
                    System.out.println("Bạn đã chọn 1");
                    ql.nhapDSNV();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn 2.");
                    ql.xuatDSNV();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn 3.");
                    ql.timTheoID();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn 4.");
                    ql.xoaNhanVien();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn 5.");
                    ql.capNhat();
                    break;
                case 6:
                    System.out.println("Bạn đã chọn 6.");
                    ql.timTheoKhoangLuong();
                    break;
                case 7:
                    System.out.println("Bạn đã chọn 7.");
                    ql.sapTheoHoTen();
                    break;
                case 8:
                    System.out.println("Bạn đã chọn 8.");
                    ql.sapTheoLuong();
                    break;
                case 9:
                    System.out.println("Bạn đã chọn 9.");
                    ql.xuatTop5ThuNhap();
                    break;
                    default:
                        System.out.println("Bạn chọn sai!!! Mời chọn lại.");
                        break;
            }
            
        }
        
        
    }
    public static void menu() {
        System.out.println("1.Nhập danh sách nhân viên.");
        System.out.println("2.Xuất danh sách nhân viên.");
        System.out.println("3.Tìm và hiển thị nhân viên theo mã.");
        System.out.println("4.Xóa nhân viên theo mã.");
        System.out.println("5.Cập nhật thông tin nhân viên theo mã.");
        System.out.println("6.Tìm các nhân viên theo khoảng lương.");
        System.out.println("7.Sắp xếp nhân viên theo họ và tên");
        System.out.println("8.Sắp xếp nhân viên theo thu nhập.");
        System.out.println("9.Xuất 5 nhân viên có thu nhập cao nhất.");
        System.out.println("Mời bạn chọn: ");
    }
}
