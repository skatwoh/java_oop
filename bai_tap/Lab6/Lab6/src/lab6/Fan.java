/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;


public class Fan {
    private String name;
    private double price;
    private double year;
    
    public Fan(String name, double price, double year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Fan() {
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(double year) {
        this.year = year;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        name = sc.nextLine();
        System.out.print("Mời nhập giá: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập năm sản xuất: ");
        year = Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        System.out.println(name +"\t"+ price +"\t"+ year +"\t"+ getStatus(year) );
    }
    
    @Override
    public String toString() {
        return "Fan{" + "name=" + name + ", price=" + price + ", year=" + year 
                +"\tTrạng thái:"+getStatus(year) +'}';
    }
    
    public String getStatus(double year) {
        if(year>2020) {
            return "Tốt";
        } else {
            return "Bình thường";
        }
    }
}
