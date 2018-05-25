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
public class AlgoritmoMaquina implements AlgoritmoAdivinar {
    protected EntradaTerminal entrada = new EntradaTerminal();

    public void adivinarNumero(){
        
        Validacion validacionNumero = new ValidacionNumero(1,100);
        int intentos = 10;
        String opcion;
        int numeroIngresado;  
        int numeroRandom = (int)(Math.random()*100);
        
        for (int i = 0; i <intentos; i++){
            System.out.println("Elija un numero del 1 al 100");
            entrada.datoEntrada();
            opcion =entrada.getEntrada();
            if(validacionNumero.esValido(opcion)){
                numeroIngresado = Integer.parseInt(opcion);
            
                if(numeroIngresado == numeroRandom){
                    System.out.println("Has acertado, felicitaciones!");
                    break;
                } else if (numeroIngresado < numeroRandom){
                    System.out.println("Mi numero es mayor que el ingresado");
                } else{
                    System.out.println("Mi numero es menor que el ingresado");

                }

                if (i == (intentos-1)){
                    System.out.println("Has agotado tus " + intentos + " intentos.\n Mejor suerte la proxima vez!");
                }
            }else {  
                i = --i;
                System.out.println(validacionNumero.getMensaje());
            }
        }
    }
}
