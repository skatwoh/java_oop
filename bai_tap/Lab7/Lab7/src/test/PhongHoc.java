/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;


public class PhongHoc {
    private String tenPhong;
    private int tang;
    private String nha;

    public PhongHoc() {
    }

    public PhongHoc(String tenPhong, int tang, String nha) {
        this.tenPhong = tenPhong;
        this.tang = tang;
        this.nha = nha;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public int getTang() {
        return tang;
    }

    public String getNha() {
        return nha;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public void setNha(String nha) {
        this.nha = nha;
    }

    @Override
    public String toString() {
        return "PhongHoc{"     + "tenPhong=" + tenPhong + ", tang=" + tang + ", nha=" + nha + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMời nhập tên: ");
        tenPhong = sc.nextLine();
        System.out.print("Mời nhập tầng: ");
        tang = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập nhà: ");
        nha = sc.nextLine();
    }
    public void inThongTin(){
        System.out.println(toString());
    }
    
}
