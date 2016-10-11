
package ejercicio4;


public class Empresa 
{
    private int nit;
    public String agenteLegal;
    public String direccionComercial;
    public int telefono;
    public Object paginaWeb;
    public String correoElectronico;
    
    public Empresa()
    {
    }
    
    public Empresa(int nit, String agenteLegal, String direccionComercial, int telefono, String... paginaWeb)
    {
        this.nit=nit;
        this.agenteLegal=agenteLegal;
        this.direccionComercial=direccionComercial;
        this.telefono=telefono;
        this.paginaWeb=paginaWeb;
    }
}
