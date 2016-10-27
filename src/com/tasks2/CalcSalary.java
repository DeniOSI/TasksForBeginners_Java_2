package com.tasks2;

import com.Main.Main;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class CalcSalary {
    private int salaryInHour;
    private int workTime;

    public CalcSalary(int Salary, int time)
    {
        if(time > 60) {
            System.out.println("Work time shold be < 60 hours");
            return;
           }
        else  if(time > 40)
        {salaryInHour = time + (int)((time-48) * 1.5);}
        else    { workTime = time;}

        if(Salary < 8){
            System.out.println("Salary cant be < 8 dollars in hour");
            return;
               }
        else
        salaryInHour = Salary;
    }

    public void PrintSalary()
    {
        if(salaryInHour <=0 || workTime <=0)
            return;

        System.out.println(salaryInHour * workTime);
    }

}
