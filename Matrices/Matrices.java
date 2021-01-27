import java.util.Scanner;
public class Matrices
{
    public void diagonalPrincipal(int tam)
    {
        int [][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if(i==j)
                {
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    public void diagonalSecundaria(int tam)
    {
        int [][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if(i+j==tam-1)
                {
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    public void recorridoAjedrez(int tam)
    {
        int [][] matriz=new int [tam][tam];
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if((i+j) % 2 == 0)
                {
                    matriz[i][j]=1;
                }
            }
        }
        mostrar(matriz);
    }
    public void mostrar(int[][] mat)
    {
        for(int fila=0;fila<mat.length ;fila++)
        {
            System.out.println();
            for(int col=0; col<mat.length;col++)
            {
                System.out.print(mat[fila][col]+"  ");
            }
        }
    }
}
