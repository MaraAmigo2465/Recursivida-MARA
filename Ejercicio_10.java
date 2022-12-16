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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int numero = 123; //declaramos en variable
System.out.println(sumaDigitos(numero)); //la almacenamos
}
public static int sumaDigitos(int numero){
if(numero < 10){ // aremos una verificacion de que ssi la variable es menor que 10
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //de lo contrario la variable se dividira en 10 y se sumara
}
}
}
