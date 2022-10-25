/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;


public class Test {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        System.out.println("Mời nhập số phần tử mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        //Khai báo mảng số nguyên có n phần tử
        int []arr = new int[n];
        //nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Moi nhap phan tu thu %d: ", i+1);
            arr[i] = Integer.parseInt(sc.nextLine());
            
        }
        // xuất mảng
        System.out.print("Xuất mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        //Xuất mảng for-each
        System.out.println("\nXuat mang for-each: ");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        //sap mang tang dan
        Arrays.sort(arr);
        System.out.print("\nXuat mang sap tang: "+ Arrays.toString(arr));
        //sap mang giam dan
    for(int i =0; i<arr.length -1;i++) {
        for (int j = i+1; j<arr.length; j++) {
            if(arr[i] < arr[j]) { // neu tang thi đổi dấu
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[i] = tmp;
            }
        }
    }
        System.out.print("\nXuat mang sap giam: "+ Arrays.toString(arr));
    //tổng các phần tử mảng
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: "+sum);
    //Tính trung bình các phần tử mảng
        average = sum / arr.length;
        System.out.println("Trung bình các phần tử trong mảng là: "+average);
}
    
}
