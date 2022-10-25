/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_ph26583;

import java.util.Scanner;


public class Chicken {
    private String name;
    private String color;
    private int price;

    public Chicken() {
    }

    public Chicken(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chicken{" + "name=" + name + ", color=" + color + ", price=" + price + '}';
    }
    
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        name = sc.nextLine();
        System.out.print("Mời nhập màu: ");
        color = sc.nextLine();
        System.out.print("Mời nhập giá: ");
        price = Integer.parseInt(sc.nextLine());
        
    }
    
    public void inThongTin(){
        System.out.println(toString());
    }
}
