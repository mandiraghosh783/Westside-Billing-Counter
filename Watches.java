package com.company;

import java.io.*;
import java.lang.*;
public class Watches
{
    public void watchmenu()
    {
        int choice=0,cont;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("     ");
                System.out.println("************************************");
                System.out.println("*  YOU ARE IN WATCH SECTION  *");
                System.out.println("THIS SECTION WOULD HELP YOU TO BEAUTIFY YOUR WRIST BY DIFFERENT WATCHES");
                System.out.println("WE ARE HAVING WRIST WATCH,DIGITAL WATCH,SMART WATCHES AND MANY MORE.....");
                System.out.println("************************************");
                System.out.println("*    1:-INDIAN                   *");
                System.out.println("*    2:-FOREIGN                  *");
                System.out.println("*    3:-EXIT                       *");
                System.out.println("************************************");
                System.out.println ("!!!!ENTER YOUR CHOICE!!!!");
                choice=Integer.parseInt(buf.readLine());
                if(choice==1)
                {
                    Indian i=new Indian();
                    i.indianmenu();
                }
                else if(choice==2)
                {
                    Foreign f=new Foreign();
                    f.foreignmenu();
                }
                else if(choice==3)
                {
                    System.out.println("@@@@@ THANK YOU FOR ENTERING THE WATCH SECTION @@@@@");
                    break;
                }
                else
                {
                    System.out.println("!!!! INVALID CHOICE PLEASE ENTER AGAIN");
                }
                System.out.println("DO YOU WANT TO CONTINUE WITH THE WATHCES SECTION? YES-1 NO-0");
                cont=Integer.parseInt(buf.readLine());
            }while(cont!=0);
        }catch(Exception e){}
    }
}

