/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lt4;


public class Demo {

    
    public static void main(String[] args) {
        Product sp1 = new Product();
        Product sp2 = new Product("bò", 1200, 5);
        
        System.out.println("Mời nhập thông tin sp:");
        sp1.nhap();
        
        System.out.println("Thông tin sp là: ");
        System.out.println("Name \t Price \t Num \t Xếp loại");
        sp1.xuat();
        sp2.xuat();
    }
    
}
