package com.company;

import java.io.*;
import java.lang.*;
public class Perfumes

{
    public void perfumemenu()
    {
        int choice=0,cont;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("     ");
                System.out.println("=======================================");
                System.out.println("|     YOU ARE IN PERFUME SECTION       |");
                System.out.println("IF YOU WANNA SMELL GOOD,THEN YOU ARE AT THE CORRECT PLACE....");
                System.out.println("======================================|");
                System.out.println("|     1:-Men                          |");
                System.out.println("|     2:-Women                        |");
                System.out.println("|     3:-EXIT                         |");
                System.out.println("======================================|");
                System.out.println ("!!!!ENTER YOUR CHOICE!!!!");
                choice=Integer.parseInt(buf.readLine());
                if(choice==1)
                {
                    Men m=new Men();
                    m.menmenu();
                }
                else if(choice==2)
                {
                    Women w=new Women();
                    w.womenmenu();
                }
                else if(choice==3)
                {
                    System.out.println("@@@@@ THANK YOU FOR ENTERING THE PERFUME SECTION @@@@@");
                    break;
                }
                else
                {
                    System.out.println("!!!! INVALID CHOICE PLEASE ENTER AGAIN");
                }
                System.out.println("DO YOU WANT TO CONTINUE WITH THE PERFUME SECTION YES-1  NO-0");
                cont=Integer.parseInt(buf.readLine());
            }while(cont!=0);
        }catch(Exception e){}
    }
}

