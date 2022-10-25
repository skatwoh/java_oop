/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String args[])
    {
        boolean isPrime=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int n=Integer.parseInt(sc.nextLine());
        sc.close();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n + " Là số nguyên tố!");
        else
            System.out.println(n + " Không phải là số nguyên tố!");
    }
}

