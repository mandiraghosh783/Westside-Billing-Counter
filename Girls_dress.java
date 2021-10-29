package com.company;

import java.io.*;
import java.lang.*;
public class Girls_dress
{
    public static int amount=0;
    public static int price[]=new int[17];
    public static int qty[]=new int[17];
    public static String item[]=new String[17];
    int choice2=0;
    public void girlsmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN GIRLS' DRESS SECTION        *");
                System.out.println("*          A PERFECT PLACE FOR YOUR TINY TOTS             *");
                System.out.println("WE PROVIDE A WIDE RANGE OF SELECTIONS OF CLOTHES FOR GIRLS");
                System.out.println("ALL SIZE RANGES I.E SMALL(s),MEDIUM(m),LARGE(l),EXTRA LARGE(Xl AND XXl) AND EXTRA SMALL(XXS AND XS) ARE PROVIDED IN OUR STORE");
                System.out.println("WE ARE GLAD TO ANNOUNCE ALL THAT OUR STORE IS ALSO HAVING DRESSES FOR YOUR YOUNG BABY GIRL");
                System.out.println("**********************************************************");
                System.out.println("FOR 0-12 MONTHS KIDS(INFANTS),WE ARE HAVING...            *");
                System.out.println("*1:-SKIRTS AND T-SHIRTS        --->Rs 299                 *");
                System.out.println("*2:- PLAIN FROCKS              --->Rs 250                        *");
                System.out.println("*3:- FRILLED FROCKS            --->Rs 325 *");
                System.out.println("***********************************************************");
                System.out.println("FOR 1-6 YEARS CATEGORY,WE HAVE......                      *");
                System.out.println("*4:- SKIRTS,T-SHIRTS,SHORTS    --->Rs 299                 *");
                System.out.println("*5:- PLAIN FROCKS              --->Rs 265                 *");
                System.out.println("*6:- FRILLED FROCKS            --->Rs 325                 *");
                System.out.println("*7:- PRETTY DRESSES            --->Rs 300                 *");
                System.out.println("*8:- DUNGREES/PANT OR JEANS    --->Rs 299                 *");
                System.out.println("*9:- GHAGHRAAS                 --->Rs 399                 *");
                System.out.println("***********************************************************");
                System.out.println("FOR 7-12 YEARS CATEGORY,WE HAVE.....                      *");
                System.out.println("10:- SKIRTS,T-SHIRTS,SHORTS    --->Rs 399                 *");
                System.out.println("11:-PRETTY DRESSES             --->Rs 295                 *");
                System.out.println("12:-DUNGREES/PANT OR JEANS     --->Rs 325                 *");
                System.out.println("13:-GHAGHRAAS                  --->Rs 300                 *");
                System.out.println("***********************************************************");
                System.out.println("FOR 8-15 YEARS CATEGORY,WE ARE HAVING.....                *");
                System.out.println("14:-SKIRTS,T-SHIRTS,SHORTS     --->Rs 399                 *");
                System.out.println("15:-PRETTY DRESSES             --->Rs 395                 *");
                System.out.println("16:-DUNGREES/PANT OR JEANS     --->Rs 325                 *");
                System.out.println("17:-GHAGHRAAS                  --->Rs 300                 *");
                System.out.println("***********************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice2=Integer.parseInt(br.readLine());
                String product[]={"SKIRTS AND T-SHIRTS ","PLAIN FROCKS ","FRILLED FROCKS ","SKIRTS,T-SHIRTS,SHORTS","PLAIN FROCKS","FRILLED FROCKS","PRETTY DRESSES","DUNGREES/PANT OR JEANS "," GHAGHRAAS","SKIRTS,T-SHIRTS,SHORTS","PRETTY DRESSES","DUNGREES/PANT OR JEANS","GHAGHRAAS","SKIRTS,T-SHIRTS,SHORTS","PRETTY DRESSES","DUNGREES/PANT OR JEANS","GHAGHRAAS"};
                int rate[]={299,250,325,299,265,325,300,299,399,399,295,325,300,399,395,325,300};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choice2-1]= product[choice2-1];
                qty[choice2-1]=qty[choice2-1]+q;
                price[choice2-1]=qty[choice2-1]*rate[choice2-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choice2-1]+"\t\t"+ item[choice2-1]+ "\t\t\t\t "+price[choice2-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choice2=Integer.parseInt(br.readLine());
            }while(choice2!=0);

        }catch(Exception e){}
        for(int i=0;i<17;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}
