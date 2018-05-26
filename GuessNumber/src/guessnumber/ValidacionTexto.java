/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javafx.scene.input.KeyCode.Z;


public class ValidacionTexto implements Validacion {

    @Override
    public boolean esValido(String cadena) {
        boolean valido = false;
        Pattern patron = Pattern.compile("[a-zA-z]+");
       
        valido = patron.matcher(cadena).matches();
        return valido;
    }

    @Override
    public String getMensaje() {
        return ">El nombre no puede estar vacio";
    }
    
}
