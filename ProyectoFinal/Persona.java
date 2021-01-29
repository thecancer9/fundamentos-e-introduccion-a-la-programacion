import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Persona implements Comparable<Persona>
{
    private String nombre;
    private int edad;
    private int numeroCelular;
    private Mensaje mm1;
    private Mensaje mm2;
    private ArrayList<Persona> amigos;
    private ArrayList<Mensaje> inbox;
    private ArrayList<Mensaje> outbox;
    private ArrayList<String> bandejaEntrada;
    private ArrayList<String> bandejaSalida;
    private String mensaje;
    private String estado;
    private int c;
    public Persona(String nombre, int edad, int numeroCelular)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.numeroCelular=numeroCelular;
        amigos=new ArrayList();        
        inbox=new ArrayList();
        outbox=new ArrayList();
        bandejaEntrada= new ArrayList();
        bandejaSalida= new ArrayList();
        c=0;
    }
    public void enviarSMS(int numCel, String sms)
    {              
        for(int i=0;i<outbox.size();i++)
        {
            if(numCel==outbox.get(i).destinatario)
            {
                outbox.get(i).agregarMensaje(sms);
            }
        }
        for(Persona p:amigos)
        {            
            if(p.getNumCel()==numCel)
            {   
                estado="enviado.";
                bandejaSalida.add("Para: "+p.getNombre()+"\n"+"\t"+sms);
                mensaje="De "+nombre+": "+sms;
                p.recibirSMS(mensaje);
                p.recibirMensajes(sms,numeroCelular);
                c++;
            }               
        } 
    } 
    private void recibirMensajes(String sms, int numCel)
    {
        for(int i=0;i<inbox.size();i++)
        {
            if(numCel==inbox.get(i).destinatario)
            {
                inbox.get(i).agregarMensaje(sms);
            }
        }
        
    }
    private void recibirSMS(String sms)
    {
        mensaje=sms;
        bandejaEntrada.add(mensaje);
    }
    public void revisarbandejaSalida()
    {
        for(int i=0;i<bandejaSalida.size();i++)
        {          
             System.out.println(bandejaSalida.get(i));
        }
    }
    public void revisarBandejaEntrada()
    {                
        for(int i=0;i<bandejaEntrada.size();i++)
        {       
             System.out.println(bandejaEntrada.get(i)+"\t");
        }
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
        mm1=new Mensaje(numeroCelular, contacto.getNumCel());
        inbox.add(mm1);          
        mm2=new Mensaje(numeroCelular, contacto.getNumCel());
        outbox.add(mm2);
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
    public void revisarBandejaMensajesRecibidosPorNumCel(int numCel)
    {
        for(int i=0;i<inbox.size();i++)
        {
            if(numCel==inbox.get(i).destinatario)
            {
                for(int j=0; j<inbox.get(i).cont.size();j++)
                {
                    System.out.println("De: "+inbox.get(i).destinatario+"\n\t"+inbox.get(i).cont.get(j));
                }
            }
        }
    }
    public void revisarBandejaMensajesEnviadosPorNumCel(int numCel)
    {
        for(int i=0;i<outbox.size();i++)
        {
            if(numCel==outbox.get(i).destinatario)
            {
                for(int j=0; j<outbox.get(i).cont.size();j++)
                {
                    System.out.println("Para: "+outbox.get(i).destinatario+"\n\t"+outbox.get(i).cont.get(j));
                }
            }
        }
    }
}
