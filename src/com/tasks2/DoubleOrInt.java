package com.tasks2;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class DoubleOrInt {
    private double number;
    public DoubleOrInt(double number)
    {
        this.number = number;
    }

    public boolean CheckNumber()
    {
        if(number % 1 == 0) return true;
        return false;
    }
}
