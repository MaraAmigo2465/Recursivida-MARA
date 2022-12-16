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
public class Ejerccicio_9 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int base = 10; //declaramos la variable
int exponente = -2; //declaramos un exponente
System.out.println(potencia(base, exponente)); //va almacenamos las variables
}
public static double potencia(int base, int exponente) {
if (exponente == 0) { //asemos comparaciones si es que es 0 devolvera 1
return 1; //10^0 = 1
} else if (exponente == 1) { // si comparamosel mismo valor en 1 retornara su base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
    //si en caso de que exponente sea es menor que 0 retornara (base(10), emponente(.1) + 1 y se divide por la misma base
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
//si de lo contrario le restara 1 multiplicado por potencia
}
}
}
