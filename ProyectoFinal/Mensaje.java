import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Mensaje
{
    Calendar calendario= new GregorianCalendar();
    private int hora;
    private int minutos;
    private int segundos;
    public int remitente;
    public int destinatario;
    public ArrayList<String> horaMensaje;
    public ArrayList<String> cont;
    public Mensaje(int remitente, int destinatario)
    {
        this.remitente=remitente;
        this.destinatario=destinatario;
        horaMensaje=new ArrayList();
        cont=new ArrayList();
    }
    private int getRemitente()
    {
        return remitente;
    }
    private int getDestinatario()
    {
        return destinatario;
    }
    private void agregarHora()
    {
        horaMensaje.add(hora+":"+minutos+":"+segundos);
    }
    private void agregarContenido(String sms)
    {
        cont.add(sms);
    }
    public void agregarMensaje(String sms)
    {
        hora= calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos= calendario.get(Calendar.SECOND);
        agregarHora();
        agregarContenido(sms);
    }/*
    public String mostrarMensajes()
    {
        String res="";
        for(int i=0;i<cont.size();i++)
        {
             res="De "+destinatario+": "+cont.get(i)+"\t "+horaMensaje.get(i)+" Leido \n";
        }
    }*/
}
