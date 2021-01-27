import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Persona implements Comparable<Persona>
{
    private String nombre;
    private int edad;
    private int numeroCelular;
    private ArrayList<Persona> amigos;
    private String[] bandejaEntrada;
    private String[] bandejaSalida;
    private String mensaje;
    private String leido;
    private int control, control2;
    public Persona(String nombre, int edad, int numeroCelular)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.numeroCelular=numeroCelular;
        amigos=new ArrayList();
        
        bandejaEntrada= new String[100];
        bandejaSalida= new String[100];
        control=0;
        control2=0;
    }
    public void enviarSMS(int numCel, String sms)
    {     
        
        for(Persona p:amigos)
        {
            if(p.getNumCel()==numCel)
            {          
                bandejaSalida[control2]="Yo: "+sms;
                control2++;
                mensaje="De "+nombre+": "+sms; 
                p.recibirSMS(mensaje);                
            }
        }       
    }
    
    private void recibirSMS(String sms)
    {
        mensaje=sms;
        bandejaEntrada[control]=mensaje;        
        control++;        
    }
    public void revisarbandejaSalida()
    {
        for(int i=0;i<bandejaSalida.length;i++)
        {
            if(bandejaSalida[i]!=null)
            {                
                System.out.println(bandejaSalida[i]);
            }            
        }
    }
    public String mensajeLeido()
    {
        return "Leido.";
    }
    public void revisarBandejaEntrada()
    {                
        for(int i=0;i<bandejaEntrada.length;i++)
        {
            if(bandejaEntrada[i]!=null)
            {                
                System.out.println(bandejaEntrada[i]+"\t"+mensajeLeido());
                
            }            
        }
    }
    public boolean buscarNumCel(int numCel)
    {
        boolean res=false;
        for(Persona p:amigos)
        {
            if(p.getNumCel()==numCel)
            {
                res=true;
            }
        }
        return res;
    }
    private String getNombre()
    {
        return nombre;
    }
    private int getNumCel()
    {
        return numeroCelular;
    }
    public void agregarContactos(Persona contacto)
    {
        amigos.add(contacto);
    }
    private String mostrarDatosContacto()
    {
        return "Nombre: "+nombre+"\nNumero de celular: "+numeroCelular+"\nEdad: "+edad;
    }
    public void mostrarListaContactos()
    {
        for(Persona p: amigos)
        {
            System.out.println(p.mostrarDatosContacto());
        }
    }
    public void ordenarListaContactos()
    {
        Collections.sort(amigos);
    }
    public int compareTo(Persona p)
    {
        return nombre.compareTo(p.getNombre());
    }
    public void buscarNumeroCelular(int numCel)
    {
        for(Persona p:amigos)
        {
            if(p.getNumCel()==numCel)
            {
                System.out.println(p.mostrarDatosContacto());
            }
        }
    }
    public void buscarNombre(String nom)
    {
        for(Persona p:amigos)
        {
            if(p.getNombre()==nom)
            {
                System.out.println(p.mostrarDatosContacto());
            }
        }
    }
}
