/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;


public class PhongNghiGV extends PhongHoc{
    private String boMon;

    public PhongNghiGV() {
    }

    public PhongNghiGV(String boMon) {
        this.boMon = boMon;
    }

    public PhongNghiGV(String boMon, String tenPhong, int tang, String nha) {
        super(tenPhong, tang, nha);
        this.boMon = boMon;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\tBộ môn=" + boMon +'}';
    }
    
    @Override
    public void inThongTin(){
        System.out.println(toString());
    }
}
