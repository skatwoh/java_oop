/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

public class Lab3 {

    public static void main(String[] args) {
        int x = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", x, i, x * i);
        }
        System.out.println("Bảng cửu chương");
        for (x = 2; x <= 10; x++) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", x, i, x * i);
            }
            System.out.println("");
        }

    }
}
