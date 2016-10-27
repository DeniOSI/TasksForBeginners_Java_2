package com.tasks2;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class SecAndMin {
    private int days;
    private final int SECINDAY = 86400;
    private final int MINUTES = 1440;
    public  SecAndMin(int days)
    {
        this.days = days;
    }

    private long MinDay()
    {
        return days * MINUTES;
    }

    private long SecDay()
    {
        return days * SECINDAY;
    }

    @Override
    public String toString() {
        return String.format("В " + days + " сутках : " + MinDay() + " минут " + " : " + SecDay() + " секунд");
    }



}
