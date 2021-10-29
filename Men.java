package com.company;

import java.io.*;
import java.lang.*;
public class Men
{
    public static int amount=0;
    public static int price[]=new int[10];
    public static int qty[]=new int[10];
    public static String item[]=new String[10];
    int choice=0;
    public void menmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN INDIAN SECTION              *");
                System.out.println("***********************************************************");
                System.out.println("*1:- FERRARI         --->Rs 3,500                         *");
                System.out.println("*2:- HUGO BOSS       --->Rs 5,000                         *");
                System.out.println("*3:- DKNY            --->Rs 8,000                         *");
                System.out.println("*4:- AZZARO          --->Rs 6,000                         *");
                System.out.println("*5:- ALIVE           --->Rs 9,000                         *");
                System.out.println("*6:- NIKE            --->Rs 4,500                         *");
                System.out.println("*7:- FCUK            --->Rs 7,800                         *");
                System.out.println("*8:- ADIDAS          --->Rs 8,000                         *");
                System.out.println("*9:- JAMES BOND      --->Rs 6,000                         *");
                System.out.println("*10:-CARRERA         --->Rs 9,250                         *");
                System.out.println("***********************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice=Integer.parseInt(br.readLine());
                String product[]={"FERRARI  ","HUGO BOSS","DKNY","AZZARO","ALIVE ","NIKE ","FCUK","ADIDAS","JAMES BOND","CARRERA"};
                int rate[]={3500,5000,8000,6000,9000,4500,7800,8000,6000,9250};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choice-1]= product[choice-1];
                qty[choice-1]=qty[choice-1]+q;
                price[choice-1]=qty[choice-1]*rate[choice-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choice-1]+"\t\t"+ item[choice-1]+ "\t\t\t\t "+price[choice-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choice=Integer.parseInt(br.readLine());
            }while(choice!=0);

        }catch(Exception e){}
        for(int i=0;i<10;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}

