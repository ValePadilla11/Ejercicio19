/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {


    public static void main(String[] args) {
        double x,h,y,z;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese la longuitud de uno de sus lados:");
        x = entrada.nextDouble();
        y=x*3;
        h=(Math.sqrt(3)*x)/2;
        z=(Math.pow(x,3) * Math.sqrt(3))/4;
        System.out.println("Perimetro: "+y);
        System.out.println("Altura: "+h);
        System.out.println("Area: "+ z);
    }
    
}
