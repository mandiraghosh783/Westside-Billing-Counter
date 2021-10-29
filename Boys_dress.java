package com.company;

import java.io.*;
import java.lang.*;
public class Boys_dress
{
    public static int amount=0;
    public static int price[]=new int[14];
    public static int qty[]=new int[14];
    public static String item[]=new String[14];
    int choice3=0;
    public void boysmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN BOYS' DRESS SECTION              *");
                System.out.println("*          A PERFECT PLACE FOR YOUR DARLINGS                         *");
                System.out.println("WE PROVIDE A WIDE RANGE OF SELECTIONS OF CLOTHES FOR BOYS");
                System.out.println("ALL SIZE RANGES I.E SMALL(s),MEDIUM(m),LARGE(l),EXTRA LARGE(Xl AND XXl) AND EXTRA SMALL(XXS AND XS) ARE PROVIDED IN OUR STORE");
                System.out.println("WE ARE GLAD TO ANNOUNCE ALL THAT OUR STORE IS ALSO HAVING DRESSES FOR YOUR YOUNG BABY BOY");
                System.out.println("************************************************************");
                System.out.println("FOR 0-12 MONTHS KIDS(INFANTS),WE ARE HAVING...             *");
                System.out.println("*1:-PANTS AND T-SHIRTS       --->Rs 199                    *");
                System.out.println("*2:- SHORTS AND TOPS         --->Rs 225                    *");

                System.out.println("***********************************************************");
                System.out.println("FOR 1-6 YEARS CATEGORY,WE HAVE......                      *");
                System.out.println("*3:- PANTS AND T-SHIRTS      --->Rs 299                   *");
                System.out.println("*4:- SHORTS AND TOPS         --->Rs 225                   *");
                System.out.println("*5:- TROUSERS                --->Rs 399                   *");
                System.out.println("*6:- SMALL SHERWANIS         --->Rs 399                   *");

                System.out.println("***********************************************************");
                System.out.println("FOR 7-12 YEARS CATEGORY,WE HAVE.....");
                System.out.println("7:- PANTS AND T-SHIRTS       --->Rs 299                   *");
                System.out.println("8:-SHORTS AND TOPS           --->Rs 225                   *");
                System.out.println("9:-TROUSERS                  --->Rs 399                   *");
                System.out.println("10:-SMALL SHERWANIS          --->Rs 399                   *");
                System.out.println("***********************************************************");
                System.out.println("FOR 8-15 YEARS CATEGORY,WE ARE HAVING.....                *");
                System.out.println("11:-PANTS AND T-SHIRTS       --->Rs 399                   *");
                System.out.println("12:-SHORTS AND TOPS          --->Rs 395                   *");
                System.out.println("13:-TROUSERS                 --->Rs 325                   *");
                System.out.println("14:-SMALL SHERWANIS          --->Rs 300                   *");
                System.out.println("***********************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice3=Integer.parseInt(br.readLine());
                String product[]={"PANTS AND T-SHIRTS ","SHORTS AND TOPS  ","PANTS AND T-SHIRTS"," SHORTS AND TOPS","TROUSERS ","SMALL SHERWANIS ","PANTS AND T-SHIRTS"," SHORTS AND TOPS","TROUSERS ","SMALL SHERWANIS","PANTS AND T-SHIRTS"," SHORTS AND TOPS","TROUSERS ","SMALL SHERWANIS"};
                int rate[]={199,225,229,225,399,399,299,225,399,399,399,395,325,300};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choice3-1]= product[choice3-1];
                qty[choice3-1]=qty[choice3-1]+q;
                price[choice3-1]=qty[choice3-1]*rate[choice3-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choice3-1]+"\t\t"+ item[choice3-1]+ "\t\t\t\t "+price[choice3-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choice3=Integer.parseInt(br.readLine());
            }while(choice3!=0);

        }catch(Exception e){}
        for(int i=0;i<14;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}

