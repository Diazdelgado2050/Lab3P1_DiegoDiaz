/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_diegodiaz;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab3P1_DiegoDiaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int EleccionEjer = 0;
        
        while (EleccionEjer != 4) {
            
            System.out.println("Main Menu:");
            System.out.println("1. El ADN mutante ");
            System.out.println("2. Tarjeta de identificacion ASCII");
            System.out.println("3. Codigo de evacuacion");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion del Main Menu:");
            EleccionEjer = leer.nextInt();
            leer.nextLine();
            
            
            switch (EleccionEjer){
                case 1:
                    System.out.println("El ADN mutante");
                    boolean secuencia = false;
                    String secuenciaADN = "";
                    
                    while (!secuencia) {
                        System.out.println("Ingrese la secuencia de ADN: ");
                        secuenciaADN = leer.nextLine().toUpperCase();
                        
                        secuencia = true;
                        
                        for (int i = 0; i < secuenciaADN.length(); i++) {
                            char letrasecuencia = secuenciaADN.charAt(i);
                            
                            if (letrasecuencia != 'A' && letrasecuencia != 'T' && letrasecuencia != 'C' && letrasecuencia != 'G' ) {
                                System.out.println("La secuencia tiene una base : " + letrasecuencia + " no valida. intente de nuevo");
                                secuencia = false;
                                break;
                                
                            }
                         }
                    }
                    int contadorA = 0;
                    int contadorT = 0;
                    int contadorC = 0;
                    int contadorG = 0;
                    
                    
                    for (int i = 0; i < secuenciaADN.length(); i++) {
                        char letrasecuencia = secuenciaADN.charAt(i);
                        switch (letrasecuencia) {
                            case 'A': contadorA++; 
                            break;
                            case 'T': contadorT++; 
                            break;
                            case 'C': contadorC++;
                            break;
                            case 'G': contadorG++; 
                            break;
                     
                        }
                     
                    }
                    System.out.println("\nReporte Biologico");
                    System.out.println("Adenina (A)" + contadorA);
                    System.out.println("Timina (T)" + contadorT);
                    System.out.println("Citocina (C)" + contadorC);
                    System.out.println("Guanina (G)" + contadorG);
                    
                    int predominante = contadorA;
                    if (contadorT > predominante) {
                        predominante = contadorT;
                        
                    }
                    if (contadorG > predominante) {
                        predominante = contadorG;
                        
                    }
                    if (contadorC > predominante) {
                        predominante = contadorC;
                        
                    }
                    int empate = 0;
                    String nompredominante = "";
                    
                    if (predominante == contadorA) {
                        empate++;
                        nompredominante = ("Adenina (A)");
                        
                    }
                    if (predominante == contadorT) {
                        empate++;
                        nompredominante = ("Timina (T)");
                    }
                    if (predominante == contadorC) {
                        empate++;
                        nompredominante = ("Citosina (C)");
                        
                    }
                    if (predominante == contadorG) {
                        empate++;
                        nompredominante = ("Guanina (G)");
                    }
                    if (empate > 1) {
                        System.out.println("\n Existe un empate entre bases");
                      
                    } else {
                        System.out.println("\nBase predominante" + nompredominante);
                    }
                    
                    double indice = Math.sqrt(secuenciaADN.length());
                    
                    System.out.println("Indice de estabilidad genetica: " + indice);
                    break;
               
            }
       
        }
        
      
    }
    
}
