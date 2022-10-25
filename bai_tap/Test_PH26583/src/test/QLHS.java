/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLHS {

    ArrayList<HocSinh> lstHocSinh = new ArrayList<>();

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nMời nhập thông tin: ");
            HocSinh hs = new HocSinh();
            hs.nhap();
            lstHocSinh.add(hs);

            System.out.println("Bạn có muốn tiếp tục không?(Y/N)");
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
    
    public void xuatDS(){
        System.out.print("Thông tin là: ");
        System.out.print("ID \t Trường Học \t Mã HS");
        for (HocSinh x : lstHocSinh) {
            x.inThongTin();
        }
    }
    
    public void timTheoKhoang(){
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.print("Mời nhập min: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập max: ");
        max = Double.parseDouble(sc.nextLine());
        
        boolean check = false;
        
        System.out.println("Thông tin là: ");
        for (HocSinh x : lstHocSinh) {
            if(x.getMaHS() >= min && x.getMaHS() <= max){
                x.inThongTin();
            }
        }
        if(check == false){
            System.out.println("Khoảng không tồn tại!");
        }
    }
    
    public void sapXep(){
        Comparator<HocSinh> com = new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
               return o1.getTruongHoc().compareTo(o2.getTruongHoc());
            }
        };
        Collections.sort(lstHocSinh, com);
    }
}
