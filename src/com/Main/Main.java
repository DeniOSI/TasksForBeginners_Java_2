package com.Main;

import com.tasks2.CalcSalary;
import com.tasks2.DoubleOrInt;
import com.tasks2.Polindrome;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class Main {
    public static void main(String[] args)
    {

        //region check value
//        DoubleOrInt doi = new DoubleOrInt(13);
//        if(doi.CheckNumber()) {
//            System.out.printf("Число целове");
//
//        }
//        else
//        {
//            System.out.printf("Число вещественное");
//        }
        //endregion

        //region salary
//        CalcSalary cs = new CalcSalary(12, 39);
//        cs.PrintSalary();

//        CalcSalary cs1 = new CalcSalary(6, 40);
//        cs1.PrintSalary();
        //endregion

        //region Polindrome
        //tru
        Polindrome pl = new Polindrome(12321);
        System.out.println(pl.Polin());
        Polindrome pl1 = new Polindrome("ар,ра");
        System.out.println(pl1.Polin());


        //Error
        Polindrome p3 = new Polindrome(1233221);
        System.out.println(p3.Polin());
        Polindrome pl2 = new Polindrome("12331");
        System.out.println(pl2.Polin());
        //endregion
    }
}
