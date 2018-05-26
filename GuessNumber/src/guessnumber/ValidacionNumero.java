/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.regex.Pattern;


public class ValidacionNumero implements Validacion {
    private int rangoMaximo;
    private int rangoMinimo;
    
    public ValidacionNumero(int min, int max){
        rangoMaximo= max;
        rangoMinimo = min;
    }
    @Override
    public boolean esValido(String cadena) {
        boolean validacion = false;     
        int numero = Integer.parseInt(cadena);
        Pattern patron = Pattern.compile("[0-9]+");
        
        validacion = ((patron.matcher(cadena).matches())&&((numero == rangoMinimo )|| (numero > rangoMinimo))&&((numero == rangoMaximo)||(numero < rangoMaximo)));
       
        return validacion;
    }

    @Override
    public String getMensaje() {
       return ">Debe ingresar un numero comprendido entre las opciones";
    
    }

   
}
