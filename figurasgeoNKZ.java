/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nkz;

import java.util.Scanner;

public class figurasgeo {

    float pi = 3.14159f;
    String formageo;       
    float area;
    float perimetro;
         
    public figurasgeo(String formageo, float area){
        this.formageo = formageo;
        this.area = area;
        this.perimetro = calcularPerimetro();
    }
   
    float calcularPerimetro() {
        switch (formageo) {
            case "cuadrado":
                float lado = (float) Math.sqrt(area);
                return 4 * lado;
            case "circulo":
                float radio = (float) Math.sqrt(area / pi);
                return 2 * pi * radio;
            case "triangulo":
                System.out.println("Introduce los tres lados del triangulo para calcular el perimetro:");
                Scanner sc = new Scanner(System.in);
                float lado1 = sc.nextFloat();
                float lado2 = sc.nextFloat();
                float lado3 = sc.nextFloat();
                return lado1 + lado2 + lado3;
            default:
                System.out.println("Forma geometrica no reconocida.");
                return 0;
        }
    }
   
    void imprimirdatos(){
        System.out.println("La forma geometrica calculada fue: " + this.formageo);
        System.out.println("El area fue de: " + this.area);
        System.out.println("El perimetro fue de: " + this.perimetro);   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculador de Formas Geometricas | Nikolaz Nessi\n\n");
        System.out.println("Introduce el tipo de forma geometrica que quieres calcular el perimetro: (ejemplo: cuadrado, circulo, triangulo)");
        String formageo = sc.nextLine();
        
        System.out.println("\nIntroduce el area a calcular:");
        float area = sc.nextFloat();
        
        figurasgeo figura = new figurasgeo(formageo, area);
        figura.imprimirdatos();
        
        sc.close();
    }
}
