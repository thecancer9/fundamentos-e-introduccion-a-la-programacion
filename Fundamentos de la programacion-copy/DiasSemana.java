public class DiasSemana
{
    public String diaSemana(int n)
    {
        String res;
        if(n == 1)
        {
            res = "Lunes";
        }        
        else if(n == 2)
        {
            res = "Martes";
        }else if(n == 3)
        {
            res = "Miercoles";
        }else if(n == 4)
        {
            res = "Jueves";
        }else if(n == 5)
        {
            res = "Viernes";
        }else if(n == 6)
        {
            res = "Sabado";
        }else if(n == 7)
        {
            res = "Domingo";                                
        }
        else res = "Ese dia no existe";
        return res;
    }
}
