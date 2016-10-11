
package ejercicio3;

import java.util.*;
public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        SumatoriaSimple suma =new SumatoriaSimple();
        
        System.out.println("Introduce el primer numero:");                      
        suma.numero1=reader.nextInt();

        System.out.println("Introduce el segundo numero:");
        suma.numero2=reader.nextInt();
                        
        suma.resultado = suma.numero1 + suma.numero2;
                              
        System.out.println("Resultado");
        suma.sumarNumeros();
    }
}
