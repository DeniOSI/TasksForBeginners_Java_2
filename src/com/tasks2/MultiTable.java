package com.tasks2;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class MultiTable {
    private int num;
    boolean flag = true;
    public MultiTable(int num)
    {
        if(num > 0 && num < 10)
        {
            this.num = num;
        }
        else
        {
            System.out.println("Number > 0 and < 10");
            flag = false;
            return;
        }
    }

    private int[] Mtable()
    {
        int mul[] = new int[10];
        for(int i = 0; i< 10; i++)
        {
            mul[i] = num * i;
        }
        return mul;
    }

    public void PrintTable()
    {
        if(flag == false)
        {return;}

        int[] mul_a;
        mul_a = Mtable();
        int temp = 0;
        for(int i = 0; i< 5; i++) {
            for (int j = 0; j < 2; j++, temp++) {
                System.out.print(num + " * " + temp + " = " + mul_a[temp] + "\t ");
            }
            System.out.println();
        }
    }
}
