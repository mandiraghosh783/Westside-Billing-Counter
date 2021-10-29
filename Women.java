package com.company;

import java.io.*;
import java.lang.*;
public class Women
{
    public static int amount=0;
    public static int price[]=new int[6];
    public static int qty[]=new int[6];
    public static String item[]=new String[6];
    int choice=0;
    public void womenmenu()//throws IOException
    {

        try
        {

            do
            {
                System.out.println("   ");
                System.out.println("**********************************************");
                System.out.println("*    YOU HAVE ENTERED IN WESTERN SECTION     *");
                System.out.println("**********************************************");
                System.out.println("*1:- DAVIDOFF        ---> Rs 1,000           *");
                System.out.println("*2:- CALVIN KLEIN    ---> Rs 1,500           *");
                System.out.println("*3:- NEXT            ---> Rs 800             *");
                System.out.println("*4:- MANGO           ---> Rs 800             *");
                System.out.println("*5:- VERSACE         ---> Rs 800             *");
                System.out.println("*6:- DOVE            ---> Rs 850             *");
                System.out.println("**********************************************");
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!ENTER YOUR CHOICE!!!!!!!!!!!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice=Integer.parseInt(br.readLine());
                String product[]={"DAVIDOFF","CALVIN KLEIN","NEXT","MANGO","VERSACE","DOVE"};
                int rate[]={1000,15000,800,800,800,850};
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
        for(int i=0;i<6;i++)
        {
            amount=amount+price[i];
        }

        System.out.println("TOTAL AMOUNT="+amount);
    }}
