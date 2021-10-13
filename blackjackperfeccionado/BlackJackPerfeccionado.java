/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackperfeccionado;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class BlackJackPerfeccionado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
                
        Scanner ingreso = new Scanner(System.in);
        
        int pideCartas, queCartaEs, nuevaMano;
        float mazos,ultimaCartaBanca, probBlancas, probNegras, cantidadCartasTotal, cantidadCartasMano, jugadores, cartasNegras, cartasBlancas, negrasEnMesa, blancasEnMesa;
        
        
        System.out.println("Cuantos mazos usaran?");
        
        mazos = ingreso.nextFloat();
        
        cantidadCartasTotal = 52*mazos;
        
        cartasNegras = mazos*20;
        cartasBlancas = mazos*32;
        
        probNegras = (cartasNegras / cantidadCartasTotal)*100;
        probBlancas = (cartasBlancas / cantidadCartasTotal)*100;
        
        System.out.println("Probabilidad de NEGRAS:"+ probNegras);
        System.out.println("Probabilidad de BLANCAS :"+ probBlancas);
        
        do {
        System.out.println("\nCuantos jugadores hay en la mesa?");
        
        jugadores = ingreso.nextInt();
        
        cantidadCartasMano = ((jugadores+1)*2)-1;
        
        System.out.println("\nCuantas cartas NEGRAS salieron ?");
        
        //empiezan a salir cartas y cambia el porcentaje
        
        negrasEnMesa = ingreso.nextFloat();
        
        blancasEnMesa = ((jugadores +1)*2)- negrasEnMesa;
        
        cartasNegras = cartasNegras - negrasEnMesa;
        cartasBlancas = cartasBlancas - blancasEnMesa;
        
        cantidadCartasTotal = cantidadCartasTotal - cantidadCartasMano;
        
        probNegras = (cartasNegras / cantidadCartasTotal)*100;
        probBlancas = (cartasBlancas / cantidadCartasTotal)*100;
        
        //ahora la probabilidad cambio
        
        System.out.println("La probabilidad de cartas es: ");
        System.out.println("\nNegras "+probNegras);
        System.out.println("\nBlancas "+probBlancas);
    
        //pide cartas ?
        
        do{
        System.out.println("Alquien pide cartas?\n ");
        System.out.println("Elija una opcion: "
                + "\n- 1 - SI piden cartas"
                + "\n- 5 - NO piden cartas");
                
                pideCartas = ingreso.nextInt();
                
                if (pideCartas == 1){
                        
                     cantidadCartasTotal-=1;    
                     
                     System.out.println("Digite:\n 1 - SI es Negra.\n5 - NO es Negra.");
                
                     queCartaEs = ingreso.nextInt();
                     
                     if (queCartaEs ==1){
                         
                         cartasNegras -= 1;
                         
                         probNegras = (cartasNegras / cantidadCartasTotal)*100;
                         probBlancas = (cartasBlancas / cantidadCartasTotal)*100;
                         
                         //PRUEBA SI BAJA EL NUMERO DE CARTAS
                         
                         System.out.println("cartas restantes"+ cantidadCartasTotal);
                         
                         System.out.println("\nLa probabilidad de cartas es: ");
                         System.out.println("\n- NEGRAS "+probNegras);
                         System.out.println("\n- BLANCAS "+probBlancas);
                         
                     } else
                         
                         cartasBlancas -= 1;
                         
                        probNegras = (cartasNegras / cantidadCartasTotal)*100;
                        probBlancas = (cartasBlancas / cantidadCartasTotal)*100;

                        
                         
                        System.out.println("La probabilidad de cartas es: ");
                        System.out.println("NEGRAS "+probNegras);
                        
                        System.out.println("BLANCAS "+probBlancas); 
                                               
                } else  {
                
                //aqui se termino la mano pero queremos cargar el dato de la 
                //carta que tenia la banca escondida
                
                    System.out.println("Que carta tenia escondida la banca ? "
                            + "\nDigite:"
                            + "\n - 1 Si fue NEGRA "
                            + "\n - 5 Si fue BLANCA " );
                
                ultimaCartaBanca = ingreso.nextFloat();
                
                if (ultimaCartaBanca==1){
                    
                        cartasNegras -= 1;
                        cantidadCartasTotal -=1;
                }
                else {
                
                    cartasBlancas -= 1;
                    cantidadCartasTotal-=1;
                }
     
                }
                    
                    
            } while (pideCartas == 1);
            
            
            System.out.println("Se juega una nueva mano ?"
                    + "\nElija una opcion: "
                    + "\n1 - SI se juega una mano mas."
                    + "\n5 - NO se juega mas.");
            
            nuevaMano = ingreso.nextInt();
        }    while (nuevaMano ==1);
        
            System.out.println("Fin del juego.");
    }
}