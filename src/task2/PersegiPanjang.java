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
public class PersegiPanjang implements MenghitungBidang {
    private double length, width;
    
    public PersegiPanjang(double Length, double Width){
        length = Length;
        width = Width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculateAround() {
        return 2 * (length + width);
    }
    
    
    
    
    
    
}
