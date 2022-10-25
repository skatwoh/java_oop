/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class QLPH {
    ArrayList<PhongHoc> lstPhongHoc = new ArrayList<>();
    
    public void NDSPH(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print("Mời nhập thông tin");
            PhongHoc p = new PhongHoc();
            p.nhap();
            lstPhongHoc.add(p);
            
            System.out.println("Bạn có muốn tiếp tục không?(Y/N)");
            String traLoi = sc.nextLine();
            if(traLoi.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void XDSPH(){
        System.out.println("Thông tin phòng học là: ");
        System.out.println("Tên Phòng \t Tầng \t Nhà");
        for (PhongHoc x : lstPhongHoc) {
            x.inThongTin();
        }
    }
    
    public void dem(){
        int count=0;
        for (PhongHoc x : lstPhongHoc) {
            if(x.getNha().equalsIgnoreCase("P")){
                count++;
            }
        }
        System.out.println("Số phòng học của tầng nhà p là: "+count);
    }
    
    public void xuatDSTang3(){
        System.out.println("Tên phòng \t Tầng \t Nhà");
        for (PhongHoc x : lstPhongHoc) {
            if (x.getTang() == lstPhongHoc.get(2).getTang()) {
                x.inThongTin();
            }
        }
    }
    
    public void sapXepGiamDan(){
        Comparator<PhongHoc> com = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o2.getNha().compareTo(o1.getNha());
            }
        };
        Collections.sort(lstPhongHoc, com);
        
    }
}
