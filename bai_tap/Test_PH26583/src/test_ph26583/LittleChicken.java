/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_ph26583;


public class LittleChicken extends Chicken{
    private double weight;

    public LittleChicken() {
    }

    public LittleChicken(double weight) {
        this.weight = weight;
    }

    public LittleChicken(double weight, String name, String color, int price) {
        super(name, color, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "LittleChicken{" + "weight=" + weight + '}';
    }
    
    @Override
    public void inThongTin(){
        System.out.println(toString());
    }
}
