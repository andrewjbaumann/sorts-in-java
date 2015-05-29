
/**
 * Created by Andrew Baumann on 5/29/2015.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloWorld
{
    public static void main(String[] args)
    {
        final int size = 5;
        int[] rand = new int[size];
        randomizer(rand, size);
        for(int i=0; i<size; i++)
            System.out.println(rand[i]);
        Sorts sorts = new Sorts(rand, size);

    }

    public static void randomizer(int[] d, int up_to)
    {
        Random random = new Random();
        for(int i = 0; i<up_to; i++)
            d[i] = random.nextInt(100);
    }
}
