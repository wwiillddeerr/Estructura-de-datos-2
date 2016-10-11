
package ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
   
        if(ImparOPar.esPar(numero)) 
        {
            System.out.println("El numero " + numero + " es par.");
        } 
        else 
        {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
    
}
