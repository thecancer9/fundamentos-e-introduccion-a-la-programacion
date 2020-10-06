public class TanqueAgua
{
    private int capacidad, cantAgua; //litros
    
    public TanqueAgua()
    {
        capacidad = 950;
        cantAgua = 0;
    }
    
    public int cantTurrilesNecesarios()
    {
        int res = capacidad/210;
        return res;
    }
    public int getCantAgua()
    {
        return cantAgua;
    }
    public void setCapacidad(int nCapacidad)
    {
        capacidad = nCapacidad;
    }
    public void setCantAgua(int nCantAgua)
    {
        cantAgua = nCantAgua;
    }
}
