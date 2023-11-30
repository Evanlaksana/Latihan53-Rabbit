/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan53.rabbit;

/**
 *
 * @author Lenovo
 */
public class Rabbit extends Animal {

    private String color;
    private String name;
   
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}