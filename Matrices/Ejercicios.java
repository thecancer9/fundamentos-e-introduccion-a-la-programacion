
public class Ejercicios
{
    public int cantVocales(String nombre)
    {
        int contador=0;
        nombre=nombre.toLowerCase();
        for(int i=0;i<nombre.length();i++)
        {
            char x=nombre.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
            {
                contador++;
            }
        }
        return contador;
    }
    public String invertir(String cad)
    {
        String inv="";
        for(int i=0;i<cad.length();i++)
        {
            inv=cad.charAt(i)+inv;
        }
        return inv;
    }
    public String codificar(String cad)
    {
        String res="";
        for(int i=0;i<cad.length();i++)
        {
            char x=cad.charAt(i);
            if(x=='z')
            {
                x='a';
            }
            else
            {
                x++;                
            }
            res=res+x;
        }
        return res;
    }
    public String decodificar(String cad)
    {
        String res="";
        for(int i=0;i<cad.length();i++)
        {
            char x=cad.charAt(i);
            if(x=='a')
            {
                x='z';
            }
            else
            {
                x--;                
            }
            res=res+x;
        }
        return res;
    }
}
