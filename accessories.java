package com.company;

import java.io.*;
import java.lang.*;
public class accessories
{
    public static int amount=0;
    public static int price[]=new int[10];
    public static int qty[]=new int[10];
    public static String item[]=new String[10];
    int choicel=0;
    public void accessoriesmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN ACCESSORIES SECTION              *");
                System.out.println("*WE PROVIDE A WIDE RANGE OF SELECTIONS OF ACCESSORIES TO CHOOSE FROM...");
                System.out.println("*IF YOU ARE LOOKING FOR THE BASIC NECESSITIES,THEN YOU ARE AT THE RIGHT PLACE..");
                System.out.println("THE ACCESSORIES AVAILABLE AT OUR STORE ARE:");
                System.out.println("***********************************************************");
                System.out.println("*1:- COSMETICS                       --->Rs 2000          *");
                System.out.println("*2:- BELTS                           --->Rs 500           *");
                System.out.println("*3:- BANGLES AND BRACELETS           --->Rs 299           *");
                System.out.println("*4:- CHAINS WITH BEAUTIFUL PENDANTS  --->Rs 250           *");
                System.out.println("*5:-HAIRBANDS,CLIPS ETC.             --->Rs 150           *");
                System.out.println("*6:- TIES                            --->Rs 175           *");
                System.out.println("***********************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choicel=Integer.parseInt(br.readLine());
                String product[]={" COSMETICS ","BELTS","BANGLES AND BRACELETS","CHAINS WITH BEAUTIFUL PENDANTS","HAIRBANDS,CLIPS ETC. "," TIES  "};
                int rate[]={2000,500,299,250,150,175};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choicel-1]= product[choicel-1];
                qty[choicel-1]=qty[choicel-1]+q;
                price[choicel-1]=qty[choicel-1]*rate[choicel-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choicel-1]+"\t\t"+ item[choicel-1]+ "\t\t\t\t "+price[choicel-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choicel=Integer.parseInt(br.readLine());
            }while(choicel!=0);

        }catch(Exception e){}
        for(int i=0;i<6;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}

