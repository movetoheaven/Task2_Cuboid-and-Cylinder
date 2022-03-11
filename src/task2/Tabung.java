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
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double height;

    public Tabung(double height, double R) {
        super(R);
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
        return PHI * super.getR() * super.getR() * height;
    }

    @Override
    public double area() {
        return 2 * PHI * super.getR()*(super.getR() + height);
    }
    
    
    
    
}
