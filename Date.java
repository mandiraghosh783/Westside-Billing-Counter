package com.company;

import java.io.*;
import java.util.*;
public class Date
{
    public void date1()


    {
        Calendar c =Calendar.getInstance();
        System.out.println("Date=>"+"\t"+"\t"+"\t"+"\t"+"\t"+c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

    }
}

