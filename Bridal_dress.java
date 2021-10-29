package com.company;

import java.io.*;
import java.lang.*;
public class Bridal_dress
{
    public static int amount=0;
    public static int price[]=new int[4];
    public static int qty[]=new int[4];
    public static String item[]=new String[4];
    int choicez=0;
    public void bridalsmenu()//throws IOException
    {

        try
        {

            do
            {
                System.out.println("   ");
                System.out.println("**********************************************");
                System.out.println("*    YOU HAVE ENTERED IN BRIDAL DRESS SECTION     *");
                System.out.println("THIS SECTION IS SOLELY DEDICATED TO ALL THOSE YOUNG COUPLES OUT THERE WHO HAVE DECIDED TO TIE THE KNOT!!!");
                System.out.println("WE TRY TO MAKE IT MORE SPECIAL BY PROVIDING A WIDE RANGE OF BRIDAL WEAR");
                System.out.println("FOR BRIDES AND DESIGNER WEAR FOR THE GROOMS TO CHOOSE FROM......");
                System.out.println("**********************************************");
                System.out.println("*1:- GOWNS              ---> Rs 5999          *");
                System.out.println("*2:- DESIGNER SAREES    ---> Rs 7999          *");
                System.out.println("*3:- DESIGNER SUITS     ---> Rs 5999             *");
                System.out.println("*4:- DESIGNER SHERWANIS ---> Rs 7999            *");

                System.out.println("**********************************************");
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!ENTER YOUR CHOICE!!!!!!!!!!!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choicez=Integer.parseInt(br.readLine());
                String product[]={" GOWNS ","DESIGNER SAREES  ","DESIGNER SUITS "};
                int rate[]={5999,7999,5999,7999};
                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choicez-1]= product[choicez-1];
                qty[choicez-1]=qty[choicez-1]+q;
                price[choicez-1]=qty[choicez-1]*rate[choicez-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choicez-1]+"\t\t"+ item[choicez-1]+ "\t\t\t\t "+price[choicez-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choicez=Integer.parseInt(br.readLine());
            }while(choicez!=0);

        }catch(Exception e){}
        for(int i=0;i<4;i++)
        {
            amount=amount+price[i];
        }

        System.out.println("TOTAL AMOUNT="+amount);
    }}

