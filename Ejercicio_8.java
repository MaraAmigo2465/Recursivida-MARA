/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos_antonio_giovann;

/**
 *
 * @author 52243
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
String palabra = "Hola";
//DEclaramos una cadena
System.out.println(invertirPalabra(palabra, palabra.length()-1));
//la almacenamos y le damos un conteo con 'length' a la cadena empezando por la ultima palabra
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){
    //si la cadena se compara con un 0 se dara un caracter
return palabra.charAt(longitud)+"";
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
//Si la longitud no es 0, la cadena empezara de la ultima parte de la cadena '-1' y terminadara en el rango 0
}
}
}
