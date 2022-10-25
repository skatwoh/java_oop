/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử mảng: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Moi nhap phan tu thu %d: ", i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());

        }

        System.out.print("Xuất mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        Arrays.sort(arr);
        System.out.print("\nXuat mang sap tang: " + Arrays.toString(arr));
        //sap mang giam dan
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // neu tang thi đổi dấu
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = tmp;
                }
            }
        }
        int min = arr[0];
        for (int j : arr) {
            if (min > n) {
                min = n;
            }
        }
        System.out.printf("\nSố nho nhất trong mảng là: %d", min);

        double tong=0;
        int dem=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 3 == 0){
                tong = (tong + arr[i]);
                dem++;
            }
        }
        System.out.println("\nTổng: "+(tong/dem));
    }
}
