/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli;


public class TruongPhong extends NhanVienAss1{
    private Double trachNhiem;

    TruongPhong(String maNV, String hoTen, double luong, Double doanhSo, Double hueHong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @Override
    public Double getThuNhap(){
        return super.getLuong() + this.trachNhiem;
    }

    public TruongPhong() {
    }

    public TruongPhong(String maNV, String hoTen, double luong, Double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public Double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    
}
