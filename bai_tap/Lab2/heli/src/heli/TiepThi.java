/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli;


public class TiepThi extends NhanVienAss1{
    private Double doanhSo;
    private Double hueHong;
    
    @Override
    public Double getThuNhap(){
        return super.getLuong() + this.doanhSo + this.hueHong;
    }

    public TiepThi() {
    }

    public TiepThi(Double doanhSo, Double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(Double doanhSo, Double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHueHong() {
        return hueHong;
    }

    public void setHueHong(Double hueHong) {
        this.hueHong = hueHong;
    }
    
    
}
