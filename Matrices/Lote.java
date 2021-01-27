
public class Lote
{
    private String propietario;
    private int cantPer;
    public Lote(int cant, String prop)
    {
        cantPer=cant;
        propietario=prop;
    }
    public String mostrarDatos()
    {
        return "("+cantPer+","+propietario+")";
    }
    public String getPropietario()
    {
        return propietario;
    }
    public int getCantPersonas()
    {
        return cantPer;
    }
    public void setPropietario(String prop)
    {
        propietario=prop;
    }
    public void setCantPersonas(int cant)
    {
        cantPer=cant;
    }
}
