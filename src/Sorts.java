import java.util.ArrayList;
import java.util.List;

public class Sorts {

    private int[] rande = new int[20];

    public Sorts(int[] d, int size)
    {
        rande = d;
        my_sele(size);
    }

    public void my_sele(int size)
    {
        System.out.println("Results of selection sort:");
        int temp = 0;
        int temp_pos = 0;
        int[] srand = rande;
        for(int i=0; i<size; i++)
        {
            temp = srand[i];
            temp_pos = i;

            for(int x=i+1; x<size; x++)
            {
                if (temp > srand[x])
                {
                    temp = srand[x];
                    temp_pos = x;
                }
            }

            if(i != temp_pos)
            {
                temp = srand[i];
                srand[i] = srand[temp_pos];
                srand[temp_pos] = temp;
            }
        }
        for(int i=0; i<size; i++)
            System.out.println(srand[i]);
    }

    public void my_bubble()
    {
    }

    public void my_merge()
    {

    }
}
