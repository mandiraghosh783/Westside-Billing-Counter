package com.company;

import java.io.*;
import java.lang.*;
public class dresses

{
    public void dressesmenu()
    {
        int choice=0,cont;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("     ");
                System.out.println("=======================================");
                System.out.println("|     YOU ARE IN DRESS SECTION         |");
                System.out.println("WE PROVIDE OUR CODTUMERS A WIDE RANGE OF SELECTIONS!!!!!!");
                System.out.println("=======================================");
                System.out.println("|     1:-MEN                           |");
                System.out.println("|     2:-WOMEN                         |");
                System.out.println("|     3:-GIRLS                         |");
                System.out.println("|     4:-BOYS                          |");
                System.out.println("|     5:-BRIDE AND BRIDEGROOM                     |");
                System.out.println("|     6:-EXIT                          |");
                System.out.println("=======================================");
                System.out.println ("!!!!ENTER YOUR CHOICE!!!!");
                choice=Integer.parseInt(buf.readLine());
                if(choice==1)
                {
                    mens_dress m=new mens_dress();
                    m.menmenu();
                }
                else if(choice==2)
                {
                    Women_dress w=new Women_dress();
                    w.womenmenu();
                }
                else if(choice==3)
                {
                    Girls_dress u=new Girls_dress();
                    u.girlsmenu();
                }
                else if(choice==4)
                {
                    Boys_dress i=new Boys_dress();
                    i.boysmenu();
                }
                else if(choice==5)
                {
                    Bridal_dress z=new Bridal_dress();
                    z.bridalsmenu();
                }
                else if(choice==6)
                {
                    System.out.println("@@@@@ THANK YOU FOR ENTERING THE DRESS SECTION @@@@@");
                    break;
                }
                else
                {
                    System.out.println("!!!! INVALID CHOICE PLEASE ENTER AGAIN");
                }
                System.out.println("DO YOU WANT TO CONTINUE WITH THE DRESS SECTION YES-1  NO-0");
                cont=Integer.parseInt(buf.readLine());
            }while(cont!=0);
        }catch(Exception e){}
    }
}

