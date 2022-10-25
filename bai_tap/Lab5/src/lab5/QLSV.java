/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {

    //Khai báo ArrayList(list) chứa SinhVien
    ArrayList<SinhVien> lstSinhVien = new ArrayList<>();

    //Thực hiên các ý như Ass(Y1->Y9)
    //Y11. Khởi tạo(gán dữ liệu). Thêm 3 phần tử vào list
    public void khoiTao() { //Thêm 3 phần tử vào list
        lstSinhVien.add(new SinhVien("Hoa", 9));
        lstSinhVien.add(new SinhVien("Linh", 8));
        lstSinhVien.add(new SinhVien("Hoan", 10));
    }

    //Xây dựng các phương thức như Ass
    //Y1. Nhập danh sách nhân viên từ bàn phím
    public void nhapDSSV() {//Nhập DSSV: Nhập SV=> thêm vào list. Hỏi tiếp tục
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Mời nhập thông tin sv");
            SinhVien sv = new SinhVien(); //Tạo đối tượng sinh viên
            sv.nhap();//nhập thông tin cho sinh viên
            lstSinhVien.add(sv); //Thêm sinh viên vào list

            //hỏi tiếp tục
            System.out.print("Bạn có muốn tiếp tục không (Y/N): ");
            String traloi = sc.nextLine();
            if (traloi.equalsIgnoreCase("N")) { //equalsIgnoreCase: so sánh ko phân biệt hoa/thường
                break;
            }
        }
    }

    //Y2. Xuất danh sách sinh viên ra màn hình
    public void xuatDSSV() {//Duyệt list => xuất DSSV
        System.out.println("Xuất list: ");
        System.out.println("Họ tên \t Điểm");
        for (SinhVien x : lstSinhVien) {
            x.xuat();
        }
    }
    //tương tự xây dựng các ký Ass còn lại
    //Y7. Sắp xếp nhân viên thep họ và tên.

    public void sapTheoHoTen() {
        //Nhớ import java.util.Comparator;
        //Tạo đối tượng Comparator để định nghĩa tiêu chí so sánh giữa 2 SinhVien
        //là so sánh theo họ tên
        Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());//giảm đổi chỗ o1 vs o2
            }
        };

        //Thực hiện sắp xếp
        Collections.sort(lstSinhVien, com);//nhớ import

        //Xuấ dữ liệu sau khi sắp
        System.out.println("\nSau khi sắp tăng: ");
        xuatDSSV();
    }

    public void sapTheoHoTen_Lambda() {
        lstSinhVien.sort((o1, o2) -> {
            return o1.getHoTen().compareTo(o2.getHoTen());
        });
        //Xuấ dữ liệu sau khi sắp
        System.out.println("\nSau khi sắp tăng: ");
        xuatDSSV();
    }
//Y8. Sắp xếp nhân viên theo thu nhập.

    public void sapTheoDiem() {
        Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                Double d1 = o1.getDiem();
                Double d2 = o2.getDiem();
                return d1.compareTo(d2);//sắp giảm đổi chỗ
            }
        };
        //Thực hiện sắp xếp
        Collections.sort(lstSinhVien, com);//nhớ import

        //Xuất dữ liệu sau khi sắp
        System.out.println("\nSau khi sắp tăng: ");
        xuatDSSV();
    }

    public void sapTheoDiem_Lambda() {
        lstSinhVien.sort((o1, o2) -> {
            Double d1 = o1.getDiem();
            Double d2 = o2.getDiem();
            return d1.compareTo(d2);
        });
        //Xuất dữ liệu sau khi sắp
        System.out.println("\nSau khi sắp tăng: ");
        xuatDSSV();
    }

    public void xoaSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên sv cần xóa: ");
        String hoTen = sc.nextLine();

        for (SinhVien x : lstSinhVien) {
            if (x.equals(hoTen)) {
                lstSinhVien.remove(x);
                break;
            }
        }
    }

    //Y6. tìm các nhân viên theo khoảng lương nhập từ bàn phím
    public void timTheoKhoangDiem() {
        Scanner sc = new Scanner(System.in);
        double min, max;
        System.out.println("Mời nhập min: ");
        min = Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập max: ");
        max = Double.parseDouble(sc.nextLine());
        // nếu thêm đc true/flase càng tốt
        System.out.println("DSSV có điểm từ min đến max là: ");
        System.out.println("Họ tên \t Điểm");
        for (SinhVien x : lstSinhVien) {
            if (x.getDiem() >= min && x.getDiem() <= max) {
                x.xuat();
            }

        }
    }
    //Y3. tìm và hiển thị nhân viên theo mã nhập từ bàn phím
    public void timTheoHoTen(){
        Scanner sc = new Scanner(System.in);
        String hoTenCanTim;
        System.out.print("Mời nhập họ tên cần tìm: ");
        hoTenCanTim = sc.nextLine();
        
        System.out.println("DSSV tìm được là: ");
        System.out.println("Hộ tên \t điểm");
        for(SinhVien x : lstSinhVien) {
            if(x.getHoTen().equalsIgnoreCase(hoTenCanTim)){
                x.xuat(); 
            }
        }
    }
}
