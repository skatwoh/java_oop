/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;


public class HocSinh {
    private String ID;
    private String truongHoc;
    private int maHS;

    public HocSinh() {
    }

    public HocSinh(String ID, String truongHoc, int maHS) {
        this.ID = ID;
        this.truongHoc = truongHoc;
        this.maHS = maHS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "ID=" + ID + ", truongHoc=" + truongHoc + ", maHS=" + maHS + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập ID: ");
        ID = sc.nextLine();
        System.out.print("Mời nhập trường học: ");
        truongHoc = sc.nextLine();
        System.out.print("Mời nhập max hs: ");
        maHS = Integer.parseInt(sc.nextLine());
    }
    
    public void inThongTin(){
        System.out.print(toString());
    }
}
