import java.util.ArrayList;
import java.util.List;

public class Sorts {

    private int[] rande = new int[20];
    private int size = 0;

    public Sorts(int[] d, int size)
    {
        rande = d;
        this.size = size;
        //my_sele();
        my_bubble();
    }

    public void my_sele()
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
        System.out.println("Results of bubble sort:");
        int temp = 0;
        int temp_pos = 0;
        int[] brand = rande;

        for(int i=0; i<size; i++)
        {
            temp = brand[i];
            temp_pos = i;
            for(int x=i+1; x<size; x++)
            {
                if(brand[x] < temp)
                {
                    temp = brand[x];
                    brand[x] = brand[i];
                    brand[i] = temp;
                }
            }
        }
        for(int i=0; i<size; i++)
            System.out.println(brand[i]);
    }

    public void my_merge()
    {

    }
}
