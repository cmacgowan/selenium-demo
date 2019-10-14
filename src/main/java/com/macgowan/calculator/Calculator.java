package com.macgowan.calculator;

/**
 * Created by macgowan on 3/23/17.
 */
public class Calculator
{
    private int result;

    public void add(int arg1, int arg2)
    {
        result = arg1 + arg2;
    }

    public void subtract(int arg1, int arg2)
    {
        result = arg1 - arg2;
    }

    public int getResult() {
        return result;
    }
}
