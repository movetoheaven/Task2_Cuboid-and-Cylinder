/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author lenovo
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double height;

    public Balok(double Length, double Width, double height) {
        super(Length, Width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
  
    @Override
    public double calculateVolume() {
        return super.calculateArea() * height;
    }

    @Override
    public double area() {
        return 2 * (super.calculateArea() + (super.getLength()*height)+(super.getWidth()*height));
    }
    
}
