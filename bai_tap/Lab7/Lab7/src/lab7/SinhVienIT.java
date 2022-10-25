/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;


public class SinhVienIT extends SinhVien{//kế thừa lớp trừu tượng SinhVien
    //=>phải viết lại (override) toàn bộ phương thức trừu tượng của cha.
    
   //Khai báo thuộc tính, phương thúc bình thường
    private double java, css;

    @Override
    public double getDiemTB() {
       return (java + css)/2;
    }
}
