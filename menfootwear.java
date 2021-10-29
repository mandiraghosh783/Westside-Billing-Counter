package com.company;

import java.io.*;
import java.lang.*;
public class menfootwear
{
    public static int amount=0;
    public static int price[]=new int[10];
    public static int qty[]=new int[10];
    public static String item[]=new String[10];
    int choiceq=0;
    public void menmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN MENS' FOOTWEAR SECTION              *");
                System.out.println("*WE HOPE TO FULFILL ALL YOUR NEEDS AND THUS PROVIDE YOU WITH A RANGE OF CHOICES...");
                System.out.println("***********************************************************");
                System.out.println("*1:- NORMAL RUNNING(CONVERSE)SHOES        --->Rs 3,000    *");
                System.out.println("*2:-BOOTS                                 --->Rs 6500     *");
                System.out.println("*3:- SANDALS                              --->Rs 2000     *");
                System.out.println("*4:- LEATHER SHOES                        --->Rs 4,000    *");
                System.out.println("***********************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choiceq=Integer.parseInt(br.readLine());
                String product[]={"NORMAL RUNNING(CONVERSE)SHOES  ","BOOTS","SANDALS ","LEATHER SHOES "};
                int rate[]={3000,6500,2000,4000};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choiceq-1]= product[choiceq-1];
                qty[choiceq-1]=qty[choiceq-1]+q;
                price[choiceq-1]=qty[choiceq-1]*rate[choiceq-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choiceq-1]+"\t\t"+ item[choiceq-1]+ "\t\t\t\t "+price[choiceq-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choiceq=Integer.parseInt(br.readLine());
            }while(choiceq!=0);

        }catch(Exception e){}
        for(int i=0;i<4;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}

