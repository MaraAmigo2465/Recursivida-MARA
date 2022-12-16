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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] array={1,2,3,4,5, 6}; //Creamos un array declarando sus valores
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza y donde se almacena
}
public static void mostrarArrayRecursivo(int[] array, int indice){
if (indice != array.length){
//Mostramos el valor en ese indice
//Contando con un 'leght'
System.out.println(array[indice]);
//Llamamos recursivamente a la función de desglose de todas las variables.
mostrarArrayRecursivo(array, indice+1);
//creando una lista contando cada numero por renglon
}
}
}
