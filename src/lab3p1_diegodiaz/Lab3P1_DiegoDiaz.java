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
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int EleccionEjer = 0;
        
        while (EleccionEjer != 4) {
            
            System.out.println("Main Menu:");
            System.out.println("1. El ADN mutante ");
            System.out.println("2. Tarjeta de identificacion ASCII");
            System.out.println("3. Codigo de evacuacion");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion del Main Menu");
            EleccionEjer = leer.nextInt();
            leer.nextLine();
            
            
            switch (EleccionEjer){
                case 1:
                    System.out.println("El ADN mutante");
                    boolean secuencia = false;
                    String secuenciaADN = "";
                    
                    while (secuencia) {
                        System.out.println("Inhrese la secuencian de ADN: ");
                        secuenciaADN = leer.nextLine().toUpperCase();
                        
                        secuencia = true;
                        
                        for (int i = 0; i < secuenciaADN.length(); i++) {
                            char letrasecuencia = secuenciaADN.charAt(i);
                            
                            if (letrasecuencia != 'A' || letrasecuencia != 'T' || letrasecuencia != 'C' || letrasecuencia != 'G' ) {
                                System.out.println("La secuencia tiene una base : " + letrasecuencia + "no valida. intente de nuevo");
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
                            case 'A' = contadorA + 1; break;
                            case 'T' = contadorT + 1; break;
                            case 'C' = contadorC + 1; break;
                            case 'G' = contadorG + 1; break;
                       
                        }
                        
                    }
                    
            }
       
        }
        
        
                
        
        
    }
    
}
