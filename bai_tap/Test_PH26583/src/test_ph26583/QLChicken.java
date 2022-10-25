/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_ph26583;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QLChicken {
    ArrayList<Chicken> lstChicken = new ArrayList<>();
    public void khoiTao(){
        lstChicken.add(new Chicken("Gà Núi", "Hồng", 1000));
        lstChicken.add(new Chicken("Gà CN", "Đỏ", 5000));
        lstChicken.add(new Chicken("Gà Tre", "Xanh", 8000));
    }
    
    public void NDS(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print("Mời nhập thông tin: ");
            Chicken c = new Chicken();
            c.nhap();
            lstChicken.add(c);
            
            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            String traLoi = sc.nextLine();
            if(traLoi.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void XDS(){
        System.out.print("Thông tin là :");
        System.out.print("Tên \t Màu \t Giá");
        for (Chicken x : lstChicken) {
            x.inThongTin();
        }
    }
    
    public void inTheoKhoangGia(){
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.print("Mời nhập min: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập max: ");
        max = Double.parseDouble(sc.nextLine());
        
        boolean check = false;
        
        System.out.println("Danh sách giá trong khoảng min max là: ");
        System.out.println("Tên \t Màu \t Giá");
        for (Chicken x : lstChicken) {
            if(x.getPrice() >= min && x.getPrice() <= max){
                x.inThongTin();
            }
        }
        if(check == false){
            System.out.println("Khoảng giá không tồn tại!");
        }
    }
    
    public void sapXepTang(){
        Comparator<Chicken> com = new Comparator<Chicken>() {
            @Override
            public int compare(Chicken o1, Chicken o2) {
                Integer t1 = o1.getPrice();
                Integer t2 = o2.getPrice();
                return t1.compareTo(t2);
            }
        };
        Collections.sort(lstChicken, com);
    }
    
}
