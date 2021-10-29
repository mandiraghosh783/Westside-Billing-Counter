package com.company;

import java.io.*;
import java.lang.*;
public class footwear

{
    public void footwearmenu()
    {
        int choicex=0,cont;
        try
        {
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("     ");
                System.out.println("=======================================");
                System.out.println("|     YOU ARE IN FOOTWEAR SECTION       |");
                System.out.println("=======================================");
                System.out.println("|     1:-Men                       |");
                System.out.println("|     2:-Women                      |");
                System.out.println("|     3:-EXIT                         |");
                System.out.println("=======================================");
                System.out.println ("!!!!ENTER YOUR CHOICE!!!!");
                choicex=Integer.parseInt(buf.readLine());
                if(choicex==1)
                {
                    menfootwear s=new menfootwear();
                    s.menmenu();
                }
                else if(choicex==2)
                {
                    womenfootwear w=new womenfootwear();
                    w.womenmenu();
                }
                else if(choicex==3)
                {
                    System.out.println("@@@@@ THANK YOU FOR ENTERING THE FOOTWEAR SECTION @@@@@");
                    break;
                }
                else
                {
                    System.out.println("!!!! INVALID CHOICE PLEASE ENTER AGAIN");
                }
                System.out.println("DO YOU WANT TO CONTINUE WITH THE FOOTWEAR  SECTION YES-1  NO-0");
                cont=Integer.parseInt(buf.readLine());
            }while(cont!=0);
        }catch(Exception e){}
    }
}

