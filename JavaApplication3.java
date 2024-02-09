/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Jorge Aguirre
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorMenu = 0;
        boolean saliendo = false;
        do{
            
            System.out.println("Bienvenido a mi primera prueba práctica en Java, las opciones son las siguientes");
            System.out.println("1) Repetir mi nombre.");
            System.out.println("2) SubMenu de mensajes");
            System.out.println("3) Salir");
            int opcionMenu = input.nextInt();
            input.nextLine();
            if(opcionMenu == 3){
                saliendo = true;
            }
            switch(opcionMenu){
                case 1:
                    System.out.println("Cual es su nombre?");
                    String nombre = input.nextLine();
                    System.out.println("Cuantas veces desea repetir el nombre?");
                    int repet = input.nextInt();
                    System.out.println(" ");
                    for(int i = 0; i < repet; i++ ){
                        System.out.println("Hola mi nombre es " + nombre + " y miren mi prueba!");
                    } 
                    break;
                case 2:
                    int contador = 0;
                    boolean salirbool = false;
                    do{
                        System.out.println("Decida entre las siguientes opciones");
                        System.out.println("1) Bienvenida");
                        System.out.println("2) Despedida");
                        System.out.println("3) Salir");
                        int opcionMenu2 = input.nextInt();
                        input.nextLine(); 
                        switch(opcionMenu2){
                            case 1:
                                System.out.println("Bievenido al menu peinos.SSA");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                salirbool = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                
                        }
                    }while(!salirbool);
                    break;
                    
                case 3:
                    System.out.println("regresando menu principal");
                    break;
            }
            contadorMenu++;
            
        }while(saliendo != true);
        input.close();
        
        
    }
    
}
