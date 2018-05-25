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
public class ValidacionLength implements Validacion{
    private int cadenaLength;
  
    public ValidacionLength(int cadenaLength){
        this.cadenaLength = cadenaLength;
    }
  
    @Override
    public boolean esValido(String cadena) {
        boolean valido = false;
        valido = (cadena.length()>0 && cadena.length() < getLength());
        return valido;
    }

    @Override
    public String getMensaje() {
        return ("La cadena debe ser menor a " + (cadenaLength-1) + " caracteres");
    }

    private int getLength() {
        return cadenaLength;
    }
}
