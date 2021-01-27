import java.util.*;
public class Cliente implements SerVivo
{
    private ArrayList<Cuenta> cuentas;
    public Cliente()
    {
        cuentas=new ArrayList<Cuenta>();
    }
    public void agregarCuenta(Cuenta nueva)
    {
        cuentas.add(nueva);
    }
    public int contarCuentasCorrientes()
    {
        int cont=0;
        for(Cuenta c:cuentas)
        {
            if(c instanceof Ccorriente)
            {
                cont++;
            }
        }
        return cont;
    }
}
