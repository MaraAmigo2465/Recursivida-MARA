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
public class Ejercicio_2 {


public static void main(String[] args) {

        

        int n= 5;

        //Guarda el resultado en una variable

        int resultado=factorialRecursivo(n);

        

        //Muestra el resultado

        System.out.println(resultado);

        

    }

    

    public static int factorialRecursivo(int numero){

        

        int res;

        

        if(numero==1){

            //Se termina la recursión

            return 1;

        }else{

            //Se llama asi misma la funcion, con el valor del numero menos 1

            res = numero * factorialRecursivo(numero-2);

        }

        

        //Devolvemos el valor

        return res;

        

    }

    

}
