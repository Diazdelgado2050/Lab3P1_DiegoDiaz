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
        int Eleccion = 0;
        
        while (Eleccion != 4) {
            
            System.out.println("\nMain Menu:");
            System.out.println("1. El ADN mutante ");
            System.out.println("2. Tarjeta de identificacion ASCII");
            System.out.println("3. Codigo de evacuacion");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion del Main Menu:");
            Eleccion = leer.nextInt();
            leer.nextLine();
            
            
            switch (Eleccion){
                case 1:
                    System.out.println("\nEl ADN mutante");
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
                        System.out.println("\nBase predominante: " + nompredominante);
                    }
                    
                    double indice = Math.sqrt(secuenciaADN.length());
                    
                    System.out.println("Indice de estabilidad genetica: " + indice);
                    break;
                    
                case 2:
                    System.out.println("\nTarjeta de identificacion ");
                    System.out.println("1. Tarjeta Normal");
                    System.out.println("2. Tarjeta de emergencia");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opcion: ");
                    
                    int opcion = leer.nextInt();
                    leer.nextLine();
                    
                    if (opcion == 3){
                        System.out.println("Regresando al main menu");
                        break;
                        
                    } else if (opcion != 1 && opcion != 2) {
                        System.out.println("Opcion invalida. regresando al main menu");
                        break;
                 
                    }
                    String codigo = "";
                    
                    if (opcion == 1) {
                  
                        while (codigo.isEmpty()) {
                            System.out.print("\nIngrese un codigo");
                            codigo = leer.nextLine();
                     
                        }
                        codigo = codigo.toLowerCase();
                    String signomas = (opcion == 1) ? "+" : "!";
                    String signoexclamacion = (opcion == 1) ? "+" : "!";
                    
                    int largo = codigo.length() + 6; 
                    String borde = signomas.repeat(largo);
                    
                    System.out.println("\n" + borde);
                    System.out.println(signomas + "  " + codigo + "  " + signoexclamacion);
                    System.out.println(borde);
                    
                    if (opcion == 2) {
                        System.out.println("\n" + borde);
                        System.out.println(signoexclamacion + " " + codigo + " " + signoexclamacion);
                            
                        }
                    
                  
                    int letras = 0;
                    int digitos = 0;
                    int simbolos = 0;
                    int sumadigitos = 0;
                    
                    System.out.println("\nAnalisis:");
                    System.out.print("Caracteres encontrados: ");
                    
                    for (int i = 0; i < codigo.length(); i++) {
                        char c = codigo.charAt(i);
                        System.out.print(c + " "); 
                        
                        if (Character.isLetter(c)) {
                            letras++;
                        } else if (Character.isDigit(c)) {
                            digitos++;
                        sumadigitos += Character.getNumericValue(c);
                        } else {
                        simbolos++;
                        }
                    }
                    
                    System.out.println("\nCantidad de letras: " + letras);
                    System.out.println("Cantidad de digitos: " + digitos);
                    System.out.println("Cantidad de simbolos: " + simbolos);
                    System.out.println("Suma de los digitos: " + sumadigitos);
                    
                    break;

                    }
                    
              
                case 3:
                    
                    System.out.println("\nCodigo de evacuacion");
                    String salida = " ";
                    boolean codvalido = false;

          
                    while (!codvalido) {
                        System.out.print("\nIngrese el codigo de evacuacion: ");
                        salida = leer.nextLine();

                    
                        if (salida.length() == 0) {
                            System.out.println("el codigo no puede estar vacio. intente de nuevo");
                            continue; 
                        }

                     
                        if (salida.length() % 2 != 0) {
                            System.out.println("cada direccion debe tener un numero. intente de nuevo");
                            continue;
                        }

                        salida = salida.toLowerCase();
                        boolean error = false;

                      
                        for (int i = 0; i < salida.length(); i = i + 2) {
                            char dir = salida.charAt(i);
                            char num = salida.charAt(i + 1);

                    
              
            }
            
       
        }
        
      
    }
        }
    }
}
        


