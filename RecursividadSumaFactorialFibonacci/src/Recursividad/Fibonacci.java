
package Recursividad;

public class Fibonacci 
{
    public static int fibonacci (int numero) 
    {
        if (numero == 0 || numero == 1)
        return 1;
        else
        return fibonacci(numero-1)+fibonacci(numero-2);
    }
    public static void main(String[] args) 
    {
        int x=0;
        while(x!=9)
        {
            System.out.println(fibonacci(x));
            x++;
        }    
    }
}
