package com.tasks2;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class FromToOne {
    int[] arr;
    int[][] arr_two;
    public  FromToOne(int[][] basicArray)
    {
        arr_two = basicArray;
        arr = new int[arr_two.length * arr_two[0].length];
        TwoToOne();
    }

    private void TwoToOne()
    {
        int count = 0;
        for(int i = 0; i< arr_two.length; i++)
        {
            for(int j=0; j< arr_two[i].length; j++, count++)
                arr[count] = arr_two[i][j];
        }
    }
    private void PrintTwo()
    {
        for(int i = 0; i< arr_two.length; i++)
        {
            for(int j=0; j < arr_two[i].length; j++) {

                System.out.print(arr_two[i][j] + "   |");
            }
            System.out.println();
        }

    }
    public void Print()
    {
        PrintTwo();
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + "| \t");
        }
    }
}
