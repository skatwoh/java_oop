/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lt4;

import java.util.Scanner;


public class Product {

        private String name;
        private double price;
        private int num;     
   
//        1.	Tạo lớp Product: name(tên), price(giá), num(int -số lượng) có phạm vi truy cập trong nội bộ lớp
//-	Hàm tạo, set, get
//-	toString
//-	input(): nhập thông tin cho các thuộc tính 
//-	String getStatus(int  so):
//so <2: ít quá
//so <10: tạm được
//còn lại: quá tốt
//2.	Tạo lớp Demo chứa main
//-	Tạo 2 đối tượng Product, dùng hàm tạo có tham số, không tham số
//-	Xuất thông tin, yêu cầu xuất cả getStatus.

    public Product() {
    }
    public Product(String name, double price, int num) {
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        name = sc.nextLine();
        System.out.print("Mời nhập giá: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập số lượng: ");
        num = Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println(name + "\t" + price + "\t" + num +"\t" +getStatus(num));
    }

    @Override
    public String toString() {
        return "Them{" + "name=" + name + ", price=" + price + ", num=" + num 
                +"\tXep loại: "+getStatus(num) +'}';
    }

    
            
    public String getStatus(int num){
        if(num < 2) {
            return "Ít quá";
            } else if (num<10){
                return "Tạm được";
        } else {
            return "Quá tốt";
        }
    }
}
