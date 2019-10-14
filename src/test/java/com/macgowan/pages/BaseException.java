package com.macgowan.pages;

/**
 * Created by macgowan on 3/28/18.
 */



public class BaseException extends RuntimeException
{
    public BaseException(String message)
    {
        super(message);
    }

    public BaseException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
