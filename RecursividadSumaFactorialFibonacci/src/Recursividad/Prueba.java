
package Recursividad;

public class Prueba 
{
    public static void mostrarDecs (int numero) 
    {
        if (numero > 0) 
        {
            System.out.println(numero);
            mostrarDecs(numero - 1);
            
        }
    }
    
    public static void mostrarAcs (int numero) 
    {
        if (numero > 0) 
        {
            
            mostrarAcs(numero - 1);
            System.out.println(numero);
            
        }
    } 
    public static void main(String[] args) 
    {
        //mostrarDecs(3);
        mostrarAcs(3);
    }
}
