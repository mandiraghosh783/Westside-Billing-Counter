package com.company;

import java.lang.*;
import java.io.*;
public class Westside
{
    static int bill=1;
    public static void main(String[] args) throws IOException
    {
        double Net_amount=0;
        double Amtafterdisc=0;
        double dis=0;
        int Choice=0;
        int Amount=0;
        int ch=0;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Our Shop");
            System.out.println(" ^     ^   ^^^^^^   ^^^^^   ^^^^^^^   ^^^^^   ^^^^^   ^^^^^^  ^^^^^   ");
            System.out.println(" ^     ^   ^        ^          ^      ^         ^     ^    ^   ^       ");
            System.out.println(" ^     ^   ^^^^^^   ^^^^^      ^      ^^^^^     ^     ^    ^   ^^^^^   ");
            System.out.println(" ^  ^  ^   ^            ^      ^          ^     ^     ^    ^   ^       ");
            System.out.println(" ^^^ ^^^   ^^^^^^   ^^^^^      ^      ^^^^^   ^^^^^   ^^^^^^   ^^^^^   ");
            System.out.println("YOU ARE IN THE BEST PLACE TO SHOP IN!!!!!");
            System.out.println("ENJOY YOUR SHOPPING!!!!!!!!!!!!!!!!!:)");
            do
            {
                System.out.println("**************************************");
                System.out.println("*    !!!!Choose Your Section For Shopping!!!       *");
                System.out.println("**************************************");
                System.out.println("*      1:-WATCHES                    *");
                System.out.println("*      2:-PERFUMES                   *");
                System.out.println("*      3:-DRESSES                    *");
                System.out.println("*      4:-ACCESSORIES                *");
                System.out.println("*      5:-FOOTWEAR                   *");
                System.out.println("*      6:-EXIT                       *");
                System.out.println("**************************************");
                System.out.println("****ENTER YOUR CHOICE****");
                Choice=Integer.parseInt(buf.readLine());
                if(Choice==1)
                {
                    Watches w=new Watches();
                    w.watchmenu();
                }
                else if(Choice==2)
                {
                    Perfumes p=new Perfumes();
                    p.perfumemenu();
                }
                else if(Choice==3)
                {
                    dresses h=new dresses();
                    h.dressesmenu();
                }
                else if(Choice==4)
                {
                    accessories a=new accessories();
                    a.accessoriesmenu();
                }
                else if(Choice==5)
                {
                    footwear b=new footwear();
                    b.footwearmenu();
                }
                else if(Choice==6)
                {
                    System.out.println("<<<< THANK YOU FOR ENTERING WESTSIDE....THE PLACE WHERE YOUR DREAMS COME TRUE......... >>>>");
                    break;
                }
                else
                {
                    System.out.println("!!!!INVALID CHOICE PLEASE ENTER AGAIN!!!!");
                }
            }while(true);
            Amount=Indian.amount+Foreign.amount+Men.amount+Women.amount+mens_dress.amount+Bridal_dress.amount+Girls_dress.amount+Boys_dress.amount+Women_dress.amount+accessories.amount+menfootwear.amount+womenfootwear.amount;;
        }catch(Exception e){}
        //Caluclating Discount
        if(Amount<2500)
            dis=0;
        else if(Amount>5000)
            dis=0.2*Amount;
        else if(Amount>15000)
            dis=0.3*Amount;
        Amtafterdisc=Amount-dis;
        //VAT tax
        double tax=0.04*Amtafterdisc;
        Net_amount=Amtafterdisc + tax;

        //Date
        Date date2=new Date();
        date2.date1();

        // Bill Printing
        System.out.println("\n\n\n");
        System.out.println("Bill number:"+(bill++));
        System.out.println("Item"+"\t\t\t"+"Qty" +"\t\t"+ "Price");
        for(int i=0;i<5;i++)
        {
            if(Indian.qty[i]>0)
            {
                System.out.println(Indian.item[i]+"\t\t\t\t"+Indian.qty[i]+"\t\t"+Indian.price[i]);
            }
        }
        for(int i=0;i<5;i++)
        {
            if(Foreign.qty[i]>0)
            {
                System.out.println(Foreign.item[i]+"\t\t\t\t\t\t"+Foreign.qty[i]+"\t\t\t\t"+Foreign.price[i]);
            }
        }
        for(int i=0;i<10;i++)
        {
            if(Men.qty[i]>0)
            {
                System.out.println(Men.item[i]+"\t\t\t\t\t\t"+Men.qty[i]+"\t\t"+Men.price[i]);
            }
        }
        for(int i=0;i<6;i++)
        {
            if(Women.qty[i]>0)
            {
                System.out.println(Women.item[i]+"\t\t\t\t\t\t"+Women.qty[i]+"\t\t"+Women.price[i]);
            }
        }

        for(int i=0;i<18;i++)
        {
            if(mens_dress.qty[i]>0)
            {
                System.out.println(mens_dress.item[i]+"\t\t\t\t\t\t"+mens_dress.qty[i]+"\t\t\t\t"+mens_dress.price[i]);
            }
        }
        for(int i=0;i<4;i++)
        {
            if(Bridal_dress.qty[i]>0)
            {
                System.out.println(Bridal_dress.item[i]+"\t\t\t\t\t\t"+Bridal_dress.qty[i]+"\t\t\t\t"+Bridal_dress.price[i]);
            }
        }
        for(int i=0;i<15;i++)
        {
            if(Women_dress.qty[i]>0)
            {
                System.out.println(Women_dress.item[i]+"\t\t\t\t\t\t"+Women_dress.qty[i]+"\t\t\t\t"+Women_dress.price[i]);
            }
        }
        for(int i=0;i<17;i++)
        {
            if(Girls_dress.qty[i]>0)
            {
                System.out.println(Girls_dress.item[i]+"\t\t\t\t\t\t"+Girls_dress.qty[i]+"\t\t\t\t"+Girls_dress.price[i]);
            }
        }
        for(int i=0;i<14;i++)
        {
            if(Boys_dress.qty[i]>0)
            {
                System.out.println(Boys_dress.item[i]+"\t\t\t\t\t\t"+Boys_dress.qty[i]+"\t\t\t\t"+Boys_dress.price[i]);
            }
        }
        for(int i=0;i<10;i++)
        {
            if(menfootwear.qty[i]>0)
            {
                System.out.println(menfootwear.item[i]+"\t\t\t\t\t\t"+menfootwear.qty[i]+"\t\t"+menfootwear.price[i]);
            }
        }
        for(int i=0;i<6;i++)
        {
            if(womenfootwear.qty[i]>0)
            {
                System.out.println(womenfootwear.item[i]+"\t\t\t\t\t\t"+womenfootwear.qty[i]+"\t\t"+womenfootwear.price[i]);
            }
        }
        for(int i=0;i<10;i++)
        {
            if(accessories.qty[i]>0)
            {
                System.out.println(accessories.item[i]+"\t\t\t\t\t\t"+accessories.qty[i]+"\t\t"+accessories.price[i]);
            }
        }

        System.out.println("\n\n");
        System.out.println(   "Total Amount             ==>"       +Amount   );
        System.out.println(   "Discount                 ==>"       +dis    );
        System.out.println(   "Amount After Discount    ==>"       +Amtafterdisc    );
        System.out.println(   "Tax                      ==>"       +tax    );
        System.out.println(   "Total amount with tax    ==>"       +Net_amount);
    }}

