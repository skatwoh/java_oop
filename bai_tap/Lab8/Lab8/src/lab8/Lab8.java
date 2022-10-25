/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

import javax.xml.transform.Source;

public class Lab8 {

    public static void main(String[] args) {
        XHelper hp = new XHelper();

        System.out.println("Tổng 2 số: " + hp.sum(4, 5));
        
        int a[]={5,6,3,2};
        System.out.println("Tổng các phần tử mảng: "+hp.sum(a));
    
    
    //static
    //ngoài cashc gội thông thường, có thể gọi trực tiếp TenLop.TenThuocTinh
    //TenLop.TenPhuongThuc() mà ko cần tạo đối tượng.
        System.out.println("\nStatic");
        XHelper.esum();
        XHelper.phuongThucStatic();
        System.out.println("Tổng 2 số: "+XHelper.esum(4,5));
    }
}
