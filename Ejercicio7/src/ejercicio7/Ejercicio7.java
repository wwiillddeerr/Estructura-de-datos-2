
package ejercicio7;

public class Ejercicio7 
{
    public static void mostrarDecs (int numero) 
    {
        if (numero > 0) 
        {
            System.out.println(numero);
            mostrarDecs(numero - 100);           
        }
    }    
    public static void mostrarAcs (int numero) 
    {
        if (numero > 0) 
        {            
            mostrarAcs(numero - 100);
            System.out.println(numero);            
        }
    }
    public static void main(String[] args) 
    {
        mostrarDecs(500);
        //mostrarAcs(500);
    }
}
    

