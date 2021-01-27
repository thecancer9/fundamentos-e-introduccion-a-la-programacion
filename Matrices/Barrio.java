
public class Barrio
{
    private Lote[][] lotes;
    private int calleMay, calleMen;
    public Barrio(Lote[][] lotes)
    {
        this.lotes=lotes;
    }
    public String nomPropMenCant()
    {
        int menor=lotes[0][0].getCantPersonas();
        String nombre=lotes[0][0].getPropietario();
        calleMen=0;
        for(int i=0;i<lotes.length;i++)
        {
            for(int j=0;j<lotes[i].length;j++)
            {
                Lote aux= lotes[i][j];
                if(aux.getCantPersonas()<menor)
                {
                    menor=aux.getCantPersonas();
                    nombre=lotes[i][j].getPropietario();
                    calleMen=i;
                }
            }
        }
        return nombre;
    }
    public String nomPropMayCant()
    {
        int mayor=lotes[0][0].getCantPersonas();
        String nombre=lotes[0][0].getPropietario();
        calleMay=0;
        for(int i=0;i<lotes.length;i++)
        {
            for(int j=0;j<lotes[i].length;j++)
            {
                Lote aux= lotes[i][j];
                if(aux.getCantPersonas()>mayor)
                {
                    mayor=aux.getCantPersonas();
                    nombre=lotes[i][j].getPropietario();
                    calleMay=i;
                }
            }
        }
        return nombre;
    }
    public String callesLoteMayCant()
    {
        return "entre la calle "+calleMay+" y "+(calleMay+1);
    }
    public String callesLoteMenCant()
    {
        return "entre la calle "+calleMen+" y "+(calleMen+1);
    }
    public void visualizar()
    {
        for(int i=0;i<lotes.length;i++)
        {
            for(int j=0;j<lotes[i].length;j++)
            {
                Lote aux= lotes[i][j];
                System.out.print(aux.mostrarDatos()+"  ");
            }
            System.out.println();
        }
    }
    
}
