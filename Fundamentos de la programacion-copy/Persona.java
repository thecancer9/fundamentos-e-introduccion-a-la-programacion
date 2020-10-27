public class Persona
{
    private String nombre;
    private int edad,ci;
    public Persona(String nomb, int edad, int ci)
    {
        nombre = nomb;
        this.edad=edad;
        this.ci=ci;
    }
    public int getCi()
    {
        return ci;
    }
    public int getEdad()
    {
        return edad;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void serCi(int ci)
    {
        this.ci=ci;
    }
    public void serEdad(int edad)
    {
        this.edad=edad;
    }
    public void serNombre(String nombre)
    {
        this.nombre=nombre;
    }
}
