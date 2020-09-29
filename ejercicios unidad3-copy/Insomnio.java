public class Insomnio
{
    public int calcularTiempo()
    {
        int horaDurmio = 2;
        int minDurmio = 45;
        int horaDesperto = 11;
        int minDesperto = 25;
        
        horaDurmio = horaDurmio * 60 + minDurmio;
        horaDesperto = horaDesperto * 60 + minDesperto;
        int x;
        x = horaDesperto - horaDurmio;
        return x;
    }
}