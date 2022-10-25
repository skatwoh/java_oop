/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QLSP {
    ArrayList<SanPham> lstSanPham = new ArrayList<>();

    //Thực hiên các ý như Ass(Y1->Y9)
    //Y11. Khởi tạo(gán dữ liệu). Thêm 3 phần tử vào list
    public void khoiTao() { //Thêm 3 phần tử vào list
        lstSanPham.add(new SanPham("Hoa", 90000,"Ha Noi"));
        lstSanPham.add(new SanPham("Nuoc", 80000,"Ninh Binh"));
        lstSanPham.add(new SanPham("Ao", 10000,"Lao Cai"));
       
    }
    public void nhapDSSP() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Mời nhập thông tin sp");
            SanPham sp = new SanPham(); 
            sp.nhap();
            lstSanPham.add(sp); 

            //hỏi tiếp tục
            System.out.print("Bạn có muốn tiếp tục không (Y/N): ");
            String traloi = sc.nextLine();
            if (traloi.equalsIgnoreCase("N")) { //equalsIgnoreCase: so sánh ko phân biệt hoa/thường
                break;
            }
        }
    }

    
    public void xuatDSSP() {
        System.out.println("Xuất list: ");
        System.out.println("Tên \t Đơn Giá \t Xuất Xứ");
        for (SanPham x : lstSanPham) {
            x.xuat();
        }
    }
    //tương tự xây dựng các ký Ass còn lại
    //Y7. Sắp xếp nhân viên thep họ và tên.

    public void sapTheoDonGia() {
        //Nhớ import java.util.Comparator;
        //Tạo đối tượng Comparator để định nghĩa tiêu chí so sánh giữa 2 SinhVien
        //là so sánh theo họ tên
        Comparator<SanPham> com = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                Double d1 = o1.getDonGia();
                Double d2 = o2.getDonGia();
                return d2.compareTo(d1);
            }
        };

        //Thực hiện sắp xếp
        Collections.sort(lstSanPham, com);//nhớ import

        //Xuấ dữ liệu sau khi sắp
        System.out.println("\nSau khi sắp tăng: ");
        xuatDSSP();
    }

}
