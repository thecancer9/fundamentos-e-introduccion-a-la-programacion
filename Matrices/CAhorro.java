
public class CAhorro extends Cuenta
{
    private double interes;
    public CAhorro(double saldo)
    {
        super(saldo);
        interes=0;
    }
    public String retirar(double monto)
    {
        String res="";
        if(monto<=saldo/2)
        {
            saldo=saldo-monto;
            saldo=saldo-((monto*3)/100);
            res="Retiro realizado. ";
        }
        else
        {
            res="Operacion no valida. ";
        }
        return res;
    }
}
