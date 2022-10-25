/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Them {

   public static String yeu(double tuoi){
       String text = "";
       
       if(tuoi < 18 && tuoi >=0){
           text = " No love";
       }else if(tuoi >= 18 && tuoi <= 30){
           text = " Good love";
       }else{
           text = "Nope, never";
       }
       return text;
   }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        String[] ten = {"linh", "van", "trang", "thao", "huy"};
        double[] tuoi= {17, 18, 21, 40, 14};
    
        
        System.out.print("Xuất thông tin: \n");
        for (int i = 0; i< ten.length; i++){
            System.out.println(ten[i] + "\t" + tuoi[i]);
        }
        

        for (int i=0; i<tuoi.length-1; i++){
            for(int j=i+1; j<tuoi.length; j++) {
                if(tuoi[1] <tuoi[j]){
                    double tmp = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tmp;   
                    
                    String tmp2 = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tmp2;

                }
            }
        }
                System.out.print("\nXuất thông tin theo mảng giảm: \n");
                for (int a = 0; a< ten.length; a++){
                System.out.println(ten[a] + "\t" + tuoi[a]);
                }
                
        System.out.print("\n Xuất mảng for-each: \n");
        for(double x: tuoi) {
            System.out.print(x + "\t");
        }
        
        System.out.println("\n thong tin:  ");
        for(int i = 0 ; i< ten.length; i++){
        System.out.printf(" %s %.1f %s \n", ten[i], tuoi[i], yeu(tuoi[i]));
       }

    }
}
