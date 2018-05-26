/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

/**
 *
 * @author Chechi
 */
public class AlgoritmoPersona implements AlgoritmoAdivinar {
    protected EntradaTerminal entrada = new EntradaTerminal();
    protected String signo;
            
    public void adivinarNumero(){
        int numeroMinimo = 0, numeroMaximo = 0;
        int intentos = 10;  
        int numeroRandom = (int)(Math.random()*100);
        System.out.println(">Piensa un numero del 1 al 100");
        System.out.println(">Si su numero es mayor ingrese \"+\", si es menor ingrese \"-\" . Si no ingrese igual \"=\" ");
        for (int i = 0; i <intentos; i++){
            System.out.println(">Es " + numeroRandom + " el numero que estas pensado?");
            entrada.datoEntrada();
            signo = entrada.getEntrada();
            
                if( "+".equals(signo)){
                   numeroMinimo = numeroRandom;
                    if(numeroMinimo < numeroMaximo){
                        numeroRandom = numeroMinimo + ((int)(Math.random()*(numeroMaximo - numeroMinimo)));
                    }else{
                        numeroRandom = numeroMinimo + ((int)(Math.random()*(100 - numeroMinimo)));
                    }
                }else if ("-".equals(signo)){
                    numeroMaximo = numeroRandom;
                    numeroRandom = numeroMaximo - ((int)(Math.random()*(numeroRandom-numeroMinimo)));
                }else if ("=".equals(signo)){
                    System.out.println(">¡He ganado!");
                    break;
                }else{
                    System.out.println(">Ingrese el signo correspondiente.");
                  i = --i;
            }
                
                if (i == (intentos-1)){
                    System.out.println(">Has agotado tus " + intentos + " intentos.\n ¡Mejor suerte la proxima vez!");
                }

        }
    }
}
