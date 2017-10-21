
public class VectorHelper {

    public static int[] Tri_Vect(int[] V, int tail)
    {
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

    public static int[] Multiply_2(int [] V, int tail)
    {
        for (int i = 0; i<tail;i++)
        {
            V[i]=V[i]*2;
        }
        return V;
    }



}
