/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


public class SinhVien extends HocSinh{
    private String maSV;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String maSV, String email) {
        this.maSV = maSV;
        this.email = email;
    }

    public SinhVien(String maSV, String email, String ID, String truongHoc, int maHS) {
        super(ID, truongHoc, maHS);
        this.maSV = maSV;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString()+"\nmaSV=" + maSV + ", email=" + email + '}';
    }

    @Override
    public void inThongTin() {
        System.out.println(toString());
    }

    
    
    
}
