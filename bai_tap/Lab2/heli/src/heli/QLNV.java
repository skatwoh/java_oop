/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {

    ArrayList<NhanVienAss1> lstNhanVienAss1 = new ArrayList<>();

    public void khoiTao() {
        lstNhanVienAss1.add(new NhanVienAss1("nv1", "Nguyen Van A", 1000));
        lstNhanVienAss1.add(new NhanVienAss1("nv2", "Nguyen Van B", 2000));
        lstNhanVienAss1.add(new NhanVienAss1("nv3", "Nguyen Van C", 3000));
        lstNhanVienAss1.add(new NhanVienAss1("nv4", "Nguyen Van D", 4000));
        lstNhanVienAss1.add(new NhanVienAss1("nv5", "Nguyen Van E", 5000));
    }

    public void nhapDSNV() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập thông tin nhân viên");
            NhanVienAss1 nv = new NhanVienAss1();
            nv.nhap();
            lstNhanVienAss1.add(nv);

            System.out.print("Bạn có muốn tiếp tục không? (Y/N)");
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatDSNV() {
        System.out.println("Thông tin nhân viên là:");
        System.out.println(" \t  \t ID \t Họ Tên \t Lương");
        for (NhanVienAss1 x : lstNhanVienAss1) {
            x.xuat();
        }
    }

    public void sapTheoHoTen() {
        Comparator<NhanVienAss1> com = new Comparator<NhanVienAss1>() {
            @Override
            public int compare(NhanVienAss1 o1, NhanVienAss1 o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(lstNhanVienAss1, com);
    }

    public void sapTheoLuong() {
        Comparator<NhanVienAss1> com = new Comparator<NhanVienAss1>() {
            @Override
            public int compare(NhanVienAss1 o1, NhanVienAss1 o2) {
                Double d1 = o1.getLuong();
                Double d2 = o2.getLuong();
                return d1.compareTo(d2);
            }
        };
        Collections.sort(lstNhanVienAss1, com);
    }

    public void xoaNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập ID nhân viên cần xóa: ");
        String maNV = sc.nextLine();
        Boolean check = false;

        for (NhanVienAss1 x : lstNhanVienAss1) {
            if (x.getMaNV().equalsIgnoreCase(maNV)) {
                lstNhanVienAss1.remove(x);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }

    public void timTheoKhoangLuong() {
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.println("Mời nhập min: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập max: ");
        max = Double.parseDouble(sc.nextLine());
        Boolean check = false;

        System.out.println("DSNV có lương tỏng khoảng là: ");
        System.out.println("ID \t Họ Tên \t Lương");
        for (NhanVienAss1 x : lstNhanVienAss1) {
            if (x.getLuong() >= min && x.getLuong() <= max) {
                x.xuat();
            }
        }
        if (check == false) {
            System.out.println("Mức lương không tồn tại !");
        }
    }

    public void xuatTop5ThuNhap() {
        lstNhanVienAss1.sort((o1, o2)
                -> {
            Double d1 = o1.getLuong();
            Double d2 = o2.getLuong();
            return d2.compareTo(d1);
        }
        );
        for (int i = 0;i<5 && i < lstNhanVienAss1.size(); i++) {
            System.out.println("------------------");
            lstNhanVienAss1.get(i).xuat();
            
        }
    }
    
    public void timTheoID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập ID cần tìm: ");
        String nhanVienCanTim = sc.nextLine();
        
        System.out.println("Nhân viên được tìm là: ");
        System.out.println("ID \t Họ Tên \t Lương");
        for (NhanVienAss1 x : lstNhanVienAss1) {
            if(x.getMaNV().equalsIgnoreCase(nhanVienCanTim)){
                x.xuat();
            }
        }
    }
    
    public void capNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã nhân viên cần cập nhật: ");
        String maNV = sc.nextLine();
        boolean temp = false;
        for (NhanVienAss1 x : lstNhanVienAss1) {
            if(x.getMaNV().equalsIgnoreCase(maNV)){
                temp = true;
                System.out.println("Cập nhật thông tin nhân viên");
                System.out.print("Mã nhân viên: "+x.getMaNV()+": ");
                String maNVnew = sc.nextLine();
                if(!maNVnew. equalsIgnoreCase("")){
                    System.out.println("Cập nhật mã nhân viên mới: "+maNVnew);
                    x.setMaNV(maNVnew);
                }
                
                System.out.print("Tên nhân viên: "+x.getHoTen()+": ");
                String hoTennew = sc.nextLine();
                if(!hoTennew. equalsIgnoreCase("")){
                    System.out.println("Cập nhật tên nhân viên mới: "+hoTennew);
                    x.setHoTen(hoTennew);
                }
                
                System.out.print("Lương nhân viên: "+x.getLuong()+": ");
                String luongNew = sc.nextLine();
                if(!luongNew. equalsIgnoreCase("")){
                    System.out.println("Cập nhật lương mới: "+luongNew);
                    x.setLuong(Double.parseDouble(luongNew));
                }
                
                if(x instanceof TruongPhong){
                    System.out.print("Lương trách nhiệm: "+((TruongPhong) x).getTrachNhiem()+": ");
                    String trachNhiemnew = sc.nextLine();
                    if(!trachNhiemnew.equalsIgnoreCase("")){
                        System.out.println("Cập nhật lương trách nhiệm mới: "+trachNhiemnew);
                        ((TruongPhong) x).setTrachNhiem(Double.parseDouble(trachNhiemnew));
                    }
                } else if(x instanceof TiepThi){
                    System.out.print("Doanh số: "+((TiepThi) x).getDoanhSo()+": ");
                    String doanhSoNew = sc.nextLine();
                    if(!doanhSoNew.equalsIgnoreCase("")){
                        ((TiepThi) x).setDoanhSo(Double.parseDouble(doanhSoNew));
                    }
                    
                    System.out.print("Huê hồng: "+((TiepThi) x).getHueHong()+": ");
                    String hueHongNew = sc.nextLine();
                    if(!hueHongNew.equalsIgnoreCase("")){
                        ((TiepThi) x).setHueHong(Double.parseDouble(hueHongNew));
                    }
                }
            }
        }
        if(!temp){
            System.out.println("Không tìm thấy nhân viên: "+maNV);
        }

    }
}
