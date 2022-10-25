/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_ph26583;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLChicken ql = new QLChicken();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn nhập");
                    ql.NDS();
                    break;
                case 2:
                    System.out.println("Bạn chọn xuất");
                    ql.XDS();
                    break; 
                  case 3:
                    System.out.println("Bạn chọn in");
                    ql.inTheoKhoangGia();
                    break;
                    case 4:
                    System.out.println("Bạn chọn 4");
                    ql.sapXepTang();
                    break;
                    case 5:
                    System.out.println("Bạn chọn 5");
                    ql.getClass();
                    break;
                    case 6:
                    System.out.println("Bạn chọn 6");
                    ql.khoiTao();
                    break;
                    case 7:
                    System.out.println("Bạn chọn 7");
                    LittleChicken cv = new LittleChicken(100, "gà", "hong", 200);
                    cv.inThongTin();
                    break;
                    case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Mục bạn chọn không có");
                    break;
            }
    }
  }  
    public static void menu() {
        System.out.println("==================menu==============");
        System.out.println("|1.Nhập                             |");
        System.out.println("|2. Xuất                            |");
        System.out.println("|3. In các phần tử theo khoảng giá  |");
        System.out.println("|4.Sắp các phần tử tăng dần theo giá|");
        System.out.println("|5.Tính giá TB                      |");
        System.out.println("|6.Khởi tạo                         |");
        System.out.println("|7.Kế thừa                          |");
        System.out.println("|0.Thoát                            |");
        System.out.println("====================================");
        System.out.println("Mời chọn :                          |");
    }
}
