package poly;

import java.util.Scanner;

public class Baitest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên môn học: ");
        String tenMon = sc.nextLine();
        System.out.println("Mời nhập số kì học");
        int kiHoc = Integer.parseInt(sc.nextLine()); // đọc vào 1 chuỗi chuyển chuỗi thành số thực
        System.out.println("Mời nhập giá tiền");
        double giaTien = sc.nextDouble();

        System.out.println("\nThong tin ban nhap la: ");
        System.out.println("Ten mon hoc la: "+tenMon);
        System.out.printf("Ten mon hoc la: %s", tenMon);
        System.out.printf("So ki hoc la: %d", kiHoc);
        System.out.println("So ki học la: "+kiHoc);
        System.out.println("Gia tien hoc la: "+giaTien);
        System.out.printf("Gia tien hoc la: %.2f", giaTien);

    }
}