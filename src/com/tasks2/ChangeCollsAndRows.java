package com.tasks2;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class ChangeCollsAndRows {
    private int[][] ar;
    private  int[][] finish_arr;
    public  ChangeCollsAndRows(int[][] arr)
    {
        ar = arr;
        finish_arr = new int[ar.length][ar[0].length];

    }
    private void CColsRows()
    {
        for(int i = 0; i< ar.length; i++)
        {
            for(int j=0; j< ar[i].length; j++)
            {
                finish_arr[j][i] = ar[i][j];
            }
        }

    }

    private void Print(int arr[][])
    {
        for(int i = 0; i< ar.length; i++)
        {
            for(int j=0; j< ar[i].length; j++)
            {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public void PrintInf()
    {
        Print(ar);
        CColsRows();
        System.out.print("-------");
        System.out.println();
        Print(finish_arr);
    }
}
