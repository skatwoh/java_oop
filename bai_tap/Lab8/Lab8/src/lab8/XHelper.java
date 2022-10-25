/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;


public class XHelper {
    static public int num;
    
    static {
        System.out.println("dshfjdsfsdfysmfdhysjfd");
    }
    
    public  int sum(int ...x){
        int tong = 0;
        for (int i : x) {
            tong+=i;
        }
        return tong;
    }
    
    static public  int esum(int ...x){
        int tong = 0;
        for (int i : x) {
            tong+=i;
        }
        return tong;
    }
    
    static public void phuongThucStatic(){
        System.out.println("Toi la phuong thuc static");
    }
}
