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
class EntradaTerminal {
    String entradaTeclado= "";
    
    public EntradaTerminal ()  {
        entradaTeclado=""; }
 
    public void datoEntrada ()  {         
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        
    } 
 
    public String getEntrada () {
        return entradaTeclado;
 } 
} 
