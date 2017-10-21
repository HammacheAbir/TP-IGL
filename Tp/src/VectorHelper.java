/**
 * Created by Youcef Tabellout on 19/10/2017.
 */
public class VectorHelper {
    /**
     *
     * Trier le tableau V de taille tail
     * @param V un tableau d"entiers
     * @param tail La taille du tableau
     * @return Un tableau trié
     */

    public static int[] Tri_Vect(int[] V, int tail)
    {
        //int i;
        int min;
        int Ind_min;
        int a;

        for(int k=0; k<tail; k++)
        {
            min = V[k];
            Ind_min = k;
            for(int i=k;i<tail;i++)
            {
                if (V[i]<min)
                {
                    Ind_min = i;
                    min = V[i];
                }
            }
            a= V[Ind_min];
            V[Ind_min]= V[k];
            V[k]=a;
        }
        return V ;
    }

    /**
     *
     * Sommer les elements de deux tableau V1 et V2 s'ils possedent la meme taille
     * @param V1 tableau d'entiers
     * @param tail1 la taille du premier tableau
     * @param V2 tableau d'entiers
     * @param tail2 la taille du deuxieme tableau
     * @return Un tableau contenant la somme des elements des deux tableaux
     */

    public static int[] Somme(int[] V1, int tail1,int[] V2, int tail2)
    {
        try {

            if (!(tail1 == tail2))
            {
                throw new TailleException();
            }
            else
            {
                for(int i = 0;i<tail1;i++)
                {
                    V1[i]= V1[i]+V2[i];
                }
            }
        }
        catch (TailleException ex)
        {
            System.out.println("Exception : les deux vecteurs ont des tailles différentes");
        }
        finally {
            return V1;
        }
    }

    /**
     *
     * Inverser les elements d'un tableau V
     * @param V tableau d'entiers
     * @param tail la taille du tableau
     * @return un tableau contenant les element de V en inverse
     */

    public static int[] Inverse_Tab(int[] V , int tail)
    {
        int k = tail-1;
        int a;

        for(int i = 0; i<(tail/2);i++)
        {
            a = V[i];
            V[i]=V[k];
            V[k]=a;
            k=k-1;
        }

        return V;
    }

    /**
     *
     * Donner le minimum et le maximum d'un tableau
     * @param V tableau d'entiers
     * @param tail la taille du tableau
     * @return un tableau contenant le min et le max
     */
    public static int[] Min_Max(int[] V,int tail)
    {
        int min = V[0];
        int max = V[0];
        int [] tab = new int[2];


        for (int i =0;i<tail;i++)
        {
            if (V[i]<min) min=V[i];
            if (V[i]>max) max=V[i];
        }

        tab[0]=min;
        tab[1]=max;
        return tab;
    }

    /**
     *
     * Multiplier les element d'un tableau V par 2
     * @param V tableau d'entiers
     * @param tail la taille du tableau
     * @return Un tablau contenant les elements de V multipliés par 2
     */
    public static int[] Multiply_2(int [] V, int tail)
    {
        for (int i = 0; i<tail;i++)
        {
            V[i]=V[i]*2;
        }
        return V;
    }



}
