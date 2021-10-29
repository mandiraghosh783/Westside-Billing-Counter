package com.company;

import java.io.*;
import java.lang.*;
public class Indian
{
    public static int amount=0;
    public static int price[]=new int[5];
    public static int qty[]=new int[5];
    public static String item[]=new String[5];
    public void indianmenu()
    {
        int cont=0;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("   ");
                System.out.println("**************************************************");
                System.out.println("*   YOU HAVE ENTERED IN INDIAN WATCHES SECTION   *");
                System.out.println("**************************************************");
                System.out.println("*        1:- TITAN        ---> Rs 1,800          *");
                System.out.println("*        2:- SONATA       ---> Rs 10,000         *");
                System.out.println("*        3:- SONY         ---> Rs 5,000          *");
                System.out.println("*        4:- FASTRACK     ---> Rs 1,500          *");
                System.out.println("*        5:- MAXIMA       ---> Rs 1,500          *");
                System.out.println("**************************************************");
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!ENTER YOUR CHOICE!!!!!!!!!!!!!!!!!");
                int choice=Integer.parseInt(buf.readLine());
                String iproduct[]={"TITAN","SONATA","SONY","FASTRACK","MAXIMA"};
                int rate[]={1800,10000,5000,1500,1500};
                int q;
                System.out.println("Enter Quantity");
                q=Integer.parseInt(buf.readLine());
                item[choice-1]= iproduct[choice-1];
                qty[choice-1]=qty[choice-1]+q;
                price[choice-1]=qty[choice-1]*rate[choice-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choice-1]+"\t\t"+ item[choice-1]+ "\t\t\t\t "+price[choice-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                cont=Integer.parseInt(buf.readLine());
            }while(cont!=0);
        }catch(Exception e){}
        for(int i=0;i<5;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT FROM INDIAN WATCH SECTION = " + amount);
    }
}


