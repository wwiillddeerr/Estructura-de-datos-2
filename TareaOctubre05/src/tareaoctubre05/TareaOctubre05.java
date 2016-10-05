
package tareaoctubre05;

public class TareaOctubre05 
{
    public static void main(String[] args) 
    {
//-------------------------------- EJERCICIO 1 ---------------------------------------------------
//Declarar un arreglo de tipo int o entero que contengan 10 items.
        
//      int arreglo[] = new int [10];
        
//--------------------------------------- EJERCICIO 2 ---------------------------------------------- 
// Declarar un arreglo de tipo entero denominado arregloVariable, que contenga 35 variables. 
// Declara una variable tipo entero o int que se llame valorVariable de valor 24 
// Y el valor de arregloVariable para un localizador de valorVariable en 53. 
// Procede a mostrar en pantalla un mensaje que indique cual es la posición de valorVariable 
// Y el número de arregloVariable para la posición de valorVariable.      
        
        int arregloVariable[] = new int [35];
        int valorVariable = 24;
        arregloVariable[valorVariable] = 53;
        System.out.println("La posicion de valorVariable es: " + valorVariable + 
                           " y el numero de arregloVariable para la posicion de valor variable es: " + arregloVariable[valorVariable]);
    }    
}
