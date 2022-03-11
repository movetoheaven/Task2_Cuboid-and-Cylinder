/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int chose;
        int loop = 0;
        int lengths, widths, heights;
        float r2;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("==========");
            System.out.println("Main Menu");
            System.out.println("1. Calculate Cuboid");
            System.out.println("2. Calculate Cylinder");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            chose = input.nextInt();
            
            if (chose == 1) {
                System.out.print("Input Length: ");
                lengths = input.nextInt();
                System.out.print("Input Width: ");
                widths = input.nextInt();
                System.out.print("Input Height: ");
                heights = input.nextInt();
                
                Balok Cuboid = new Balok(lengths,widths,heights);
                
                System.out.println("Area of ​​Rectangle= " + Cuboid.calculateArea());
                System.out.println("Perimeter of Rectangle= " + Cuboid.calculateAround());
                System.out.println("Volume of Cuboid= " + Cuboid.calculateVolume());
                System.out.println("Surface area of Cuboid= " + Cuboid.area());
                System.out.println("Repeat?(Yes: 1 || Tidak: 0)");
                loop = input.nextInt();
            } else if (chose == 2) {
                System.out.print("Input Height: ");
                heights = input.nextInt();
                System.out.print("Input Circle radius: ");
                r2 = input.nextInt();
                
                Tabung Cylinder = new Tabung(heights, r2);
                
                System.out.println("Area of ​​circle= " + Cylinder.calculateArea());
                System.out.println("Circumference= " + Cylinder.calculateAround());
                System.out.println("Volume of Cylinder= " + Cylinder.calculateVolume());
                System.out.println("Surface area of Cylinder= " + Cylinder.area());
                System.out.print("Repeat?(Yes: 1 || Tidak: 0)");
                loop = input.nextInt();
            }
          
        } while (loop == 1);
        
        
        
        
        
        
        
        
    }
    
}
