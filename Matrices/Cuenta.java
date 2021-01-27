
public abstract class Cuenta
{
    protected double saldo;
    public Cuenta(double saldo)
    {
        this.saldo=saldo;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public String depositar(double monto)
    {
        saldo=saldo+monto;
        return "Se deposito Bs. " +monto+" a tu cuenta.";
    }
    public abstract String retirar(double monto);
}
