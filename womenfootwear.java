package com.company;

import java.io.*;
import java.lang.*;
public class womenfootwear
{
    public static int amount=0;
    public static int price[]=new int[6];
    public static int qty[]=new int[6];
    public static String item[]=new String[6];
    int choicew=0;
    public void womenmenu()//throws IOException
    {

        try
        {

            do
            {
                System.out.println("   ");
                System.out.println("**********************************************");
                System.out.println("*    YOU HAVE ENTERED IN WOMENS' FOOTWEAR SECTION     *");
                System.out.println("*WE HOPE TO FULFILL ALL YOUR NEEDS AND THUS PROVIDE YOU WITH A RANGE OF CHOICES...");
                System.out.println("***********************************************");
                System.out.println("*1:- NORMAL RUNNING SHOES        ---> Rs 3,000*");
                System.out.println("*2:- BOOTS                       ---> Rs 6,500*");
                System.out.println("*3:- FLAT SANDALS                ---> Rs 2000 *");
                System.out.println("*4:- STILLETOS                   ---> Rs 5400 *");
                System.out.println("*5:- MID HEELS                   ---> Rs 4000 *");
                System.out.println("*6:- HIGH HEELS                  ---> Rs 4500 *");
                System.out.println("**********************************************");
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!ENTER YOUR CHOICE!!!!!!!!!!!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choicew=Integer.parseInt(br.readLine());
                String product[]={"NORMAL RUNNING SHOES","BOOTS","FLAT SANDALS","STILLETOS","MID HEELS ","HIGH HEELS"};
                int rate[]={3000,6500,2000,5400,4000,4500};
                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choicew-1]= product[choicew-1];
                qty[choicew-1]=qty[choicew-1]+q;
                price[choicew-1]=qty[choicew-1]*rate[choicew-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choicew-1]+"\t\t"+ item[choicew-1]+ "\t\t\t\t "+price[choicew-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choicew=Integer.parseInt(br.readLine());
            }while(choicew!=0);

        }catch(Exception e){}
        for(int i=0;i<6;i++)
        {
            amount=amount+price[i];
        }

        System.out.println("TOTAL AMOUNT="+amount);
    }}
