import java.util.ArrayList;;

public class Persona
{
    private String nombre;
    private char sexo;
    private ArrayList<Persona> amigos;
    public Persona(String nom, char sexo)
    {
        nombre=nom;
        this.sexo=sexo;
        amigos=new ArrayList();
    }
    public char getSexo()
    {
        return sexo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void agregarAmigos(Persona p)
    {
        amigos.add(p);
    }
    public void mostrarFem()
    {
        for(Persona pe:amigos)
        {
            if(pe.getSexo()=='F')
            {
                System.out.println(pe.mostrarDatos());
            }
        }
    }
    public String mostrarDatos()
    {
        return "nombre: "+nombre+"\t sexo: "+sexo;
    }
    public int cantPersoMismoNombre(String nom)
    {
        int cont=0;
        for(Persona pe:amigos)
        {
            if(pe.getNombre().equals(nom))
            {
                cont++;
            }
        }
        return cont;
    }
    public void listaAmigos()
    {
        
        for(Persona pe:amigos)
        {
            System.out.println(pe.mostrarDatos());
        }
    }
}
