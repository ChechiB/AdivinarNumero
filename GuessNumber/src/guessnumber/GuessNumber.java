/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;
import java.util.Scanner;

/**
 *
 * @author Chechi
 */
public class GuessNumber {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntradaTerminal entrada = new EntradaTerminal();
        Validacion validacionTexto = new ValidacionTexto();
        Validacion validacionNumero = new ValidacionNumero(1,2);
        Validacion validacionLength = new ValidacionLength(9);
        

        
        AlgoritmoAdivinar persona = new AlgoritmoPersona();
        AlgoritmoAdivinar maquina = new AlgoritmoMaquina();
        String nombre= "";
        String opcion;
        String mensaje;
        
        do{
            System.out.println(">Ingrese su nombre: ");
            entrada.datoEntrada();
            nombre =entrada.getEntrada();
            if(validacionTexto.esValido(nombre)&& validacionLength.esValido(nombre) ){
                mensaje= String.format(">Bienvenido %s ", nombre);
                System.out.println(mensaje + "\n Ingresa \"1\" para adivinarle el numero a Samus o \"2\" para que Samus adivine su numero.");
                entrada.datoEntrada();
                opcion = entrada.getEntrada();
                    
                    if("1".equals(opcion)){
                        maquina.adivinarNumero();                  
                    }else if ("2".equals(opcion)){
                        persona.adivinarNumero();
                    }else{
                            System.out.println(validacionNumero.getMensaje());
                    } 
            }else{
                System.out.println(validacionTexto.getMensaje());
                System.out.println(validacionLength.getMensaje());
            } 
            
        }while(true);
        
    }  
    
}
