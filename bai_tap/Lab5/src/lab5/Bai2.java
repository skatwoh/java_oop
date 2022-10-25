/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;


public class Bai2 {

    
    public static void main(String[] args) {
        //Khai báo ArrayList(list) lưu số thực
        ArrayList <Double> lstSoThuc = new ArrayList<>();
        //Thêm 3 phần tử vào list
        lstSoThuc.add(6.0);
        lstSoThuc.add(Double.valueOf(6));
        lstSoThuc.add(8.5);
        
        //in ra phần tử thứ 2
        System.out.println("Phần tử thứ 2: "+lstSoThuc.get(1));
        
        //số phần tử của list là
        System.out.println("Số phần tử là: "+lstSoThuc.size());
        //xuất list for -i
        System.out.println("Xuất list for i: ");
        for (int i = 0; i < lstSoThuc.size(); i++) {
            System.out.println("lstSoThuc.get(i);");
        }
        //xuất list for-each
        System.out.println("Xuất list for each: ");
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }
        //sắp tăng
        Collections.sort(lstSoThuc); 
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }
        //sắp giảm
        Collections.reverse(lstSoThuc); //đảo ngược
        //xuất list for-each
        System.out.println("Xuất list for each: ");
        for (Double x : lstSoThuc) {
            System.out.println(x);
        }
    }
    
}
