
public class EjemplosString
{
    public int tam(String cad)
    {
        return cad.length();
    }
    public char obtenerChar(String cad, int i)
    {
        return cad.charAt(i);
    }
    public boolean esIgual(String cad1, String cad2)
    {
        return cad1.equals(cad2);
    }
    public String minus(String cad)
    {
        return cad.toLowerCase();
    }
    public String mayus(String cad)
    {
        return cad.toUpperCase();
    }
    public boolean contiene(String cad, String subCad)
    {
        return cad.contains(subCad);
    }
    public int indiceDe(String cad, String subCad)
    {
        return cad.indexOf(subCad);
    }
        
}
