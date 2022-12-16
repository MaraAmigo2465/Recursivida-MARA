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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
int posicion = 5; //declaramos un valor en especifico
int resultado = fibonacciRecursivo(posicion);//almacenamos el valor
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
if (n == 0) {
return 0;
//CASO BASE, si es 1 devuelve un 1 si cumple con las condiciones
} else if (n == 1) {
return 1;
} else {
//Hago la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
//sumamos el numero restado por 1 y sumamos el mismo numero restandole 2 a la variable 'N'
// SI LA variable 'n' es 1 se le ara de esta forma (1) + (-1); dando como resultado el valor declarado enel inicio. 
}
}
}
