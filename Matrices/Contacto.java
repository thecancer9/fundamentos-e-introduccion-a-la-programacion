import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;;
public class Contacto
{
    private String nombre;
    private int edad;
    private int numeroCelular;
    private String[] bandejaEntrada;
    private String mensaje;
    private int control;
    public Contacto(int numeroCelular, int cap)
    {
        this.numeroCelular=numeroCelular;
        bandejaEntrada=new String[cap];
        control=0;
    }
    private void codificar()
    {
        String res="";
        for(int i=0;i<mensaje.length();i++)
        {
            char x=mensaje.charAt(i);
            x++;
            res=res+x;
        }
        mensaje=res;
    }
    private void decodificar()
    {
        String res="";
        for(int i=0;i<mensaje.length();i++)
        {
            char x=mensaje.charAt(i);
            x--;
            res=res+x;
        }
        mensaje=res;
    }
    public void escribirSMS(String msj)
    {
        mensaje="De: "+numeroCelular+"\n "+msj;
    }
    public void enviarSMS(Contacto c)
    {
        codificar();
        c.recibirSMS(mensaje);
    }
    public void recibirSMS(String msj)
    {
        mensaje=msj;
        decodificar();
        bandejaEntrada[control]=mensaje;
        control++;
    }
    public void revisarBandeja()
    {
        
        for(int i=0;i<bandejaEntrada.length;i++)
        {
            System.out.println("Mensaje nro: "+(i+1));
            System.out.println(bandejaEntrada[i]);
        }
    }
}
