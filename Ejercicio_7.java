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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
int a = 254; //400 + 50 + 2
//declaramos un valor
System.out.println(invertirNum(a, 2));
//definimos un indice y la almacenamos con su indice
}
public static int invertirNum(int num, int pos){
//Si es menor que 10 devuelvo el numero (el ultimo numero)
if(num < 10){
return num;
//si el numero declarado el mayor de 10 devuelve el numero sin cambio
}else{
//modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo
return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
}
}
}
