/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.ArrayList;


public class Lab5 {

    
    public static void main(String[] args) {
        // Khai báo ArrayList(list) KHÔNG định kiểu => lưu được nhiều kiểu
        //=> Khi lấy ra phải ép về kiểu gốc
        ArrayList lstK = new ArrayList();// Khai báo ArrayList(list) KHÔNG định kiểu
        lstK.add(1); //Thêm vào list 1 số nguyên
        lstK.add(5.5);//Thêm vào list 1 số thực
        lstK.add("chuỗi");//Thêm vào list 1 chuỗi
        lstK.add(true);//Thêm vào list 1 giá trị boolean
        
        //=>Khi lấy ra phải éo về kiểu gốc
        Integer i = (Integer) lstK.get(0);
        String ch = (String) lstK.get(2);
        
    }
    
}
