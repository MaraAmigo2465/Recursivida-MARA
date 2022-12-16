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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] array={1,2,3,4,5}; //declaramos los posibles resultados
int elementoBuscar=3; //declaramos el valor que buscaremos
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
//Planeamos donde se almacena lo que buscamos y de damos pauta al inicio
System.out.println(posElementoEncontrado);
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
if(indice==array.length || array[indice]==elementoBuscar){
    //verifica y compara el indice con los valoresen el array y que compare el elemento que busca 
if(indice==array.length){
return -1;
//El elemento buscado, se e restara 1 para mostrar el resultado de numeroBuscado - 1
}else{
return indice;
//SI no es encontrado se mostrara solo el indice
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1);
//SI DE LO CONTRARIO DETORNARA ARRAY, ELEMENTOBUSCADO Y EL INDICE DE TODOS LOS NUMEROS
}
}
}
