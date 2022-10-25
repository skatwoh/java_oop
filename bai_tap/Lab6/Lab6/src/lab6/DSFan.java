/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class DSFan {
    ArrayList<Fan> lstFan = new ArrayList<>();
    
    public void init(){
        lstFan.add(new Fan("a", 200, 2021));
        lstFan.add(new Fan("b", 20000, 2019));
        lstFan.add(new Fan("c", 30000, 2020));
        lstFan.add(new Fan("d", 40000, 2001));
    }
    
    public void inputDSFan(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("Mời nhập thông tin ");
            Fan f = new Fan();
            f.nhap();
            lstFan.add(f);
            
            System.out.print("Bạn có muốn tiếp tục không(Y/N)");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void outputFan(){
        System.out.println("Xuất thông tin: ");
        System.out.println("Tên \t Giá \t Năm \t Trạng thái");
        for (Fan x : lstFan) {
            x.xuat();
        }
    }
    
    public void countFan() {
        int count = 0;
        
        for (Fan x : lstFan) {
            if(x.getPrice() > 500) {
                count++;
            }
        }
        System.out.println("Sản phẩm có giá > 500 là: "+count);
    }
    public void findFan(){
        Comparator<Fan> com = new Comparator<Fan>() {
            @Override
            public int compare(Fan o1, Fan o2) {
                Double d1 = o1.getPrice();
                Double d2 = o2.getPrice();
                return d1.compareTo(d2);//sắp giảm đổi chỗ
            }
        };
        Collections.sort(lstFan, com);
        System.out.println("Tên \t Giá \t Năm");
        for (Fan f : lstFan) {
            if(f.getPrice() == lstFan.get(0).getPrice()){
                f.xuat();
        }
    }
}
}
