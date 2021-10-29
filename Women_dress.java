package com.company;

import java.io.*;
import java.lang.*;
public class Women_dress
{
    public static int amount=0;
    public static int price[]=new int[15];
    public static int qty[]=new int[15];
    public static String item[]=new String[15];
    int choice1=0;
    public void womenmenu()//throws IOException
    {

        try
        {

            do
            {
                System.out.println("   ");
                System.out.println("**********************************************");
                System.out.println("*    YOU HAVE ENTERED IN WOMEN DRESS SECTION     *");
                System.out.println("ALL SIZE RANGES I.E SMALL(s),MEDIUM(m),LARGE(l),EXTRA LARGE(Xl AND XXl) AND EXTRA SMALL(XXS AND XS) ARE PROVIDED IN OUR STORE");
                System.out.println("WE PROVIDE A LARGE NUMBER OF SELECTIONS.....");
                System.out.println("*************************************************************************************");
                System.out.println("IN ETHNIC WEAR,WE ARE HAVING:                                                       *");
                System.out.println("*1:- SAREES                                                 ---> Rs 900             *");
                System.out.println("*2:- PATTIYALLAS                                            ---> Rs 500             *");
                System.out.println("*3:- CHURRIDHAARS                                           ---> Rs 400             *");
                System.out.println("*4:- SALWAR KAMEEZ                                          ---> Rs 650             *");
                System.out.println("*************************************************************************************");
                System.out.println("IN TRADITIONAL WEAR,WE ARE HAVING:                                                       *");
                System.out.println("*5:- KURTIS                                                 ---> Rs 150             *");
                System.out.println("*6:- GHAGRAS                                                ---> Rs 550             *");
                System.out.println("*************************************************************************************");
                System.out.println("*IN FORMAL WEAR,WE ARE HAVING:");
                System.out.println("*7:-FORMAL PANTS                                            ---> Rs 599             *");
                System.out.println("*8:-FORMAL SHIRTS AND T-SHIRTS                              ---> Rs 399             *");
                System.out.println("*9:-FORMAL SKIRTS                                           ---> Rs 499             *");
                System.out.println("*10:-COATS                                                  ---> Rs 350             *");
                System.out.println("*11:-JEANS(DENIM)                                           ---> Rs 299             *");
                System.out.println("*************************************************************************************");
                System.out.println("IN FANCY WEAR,WE ARE HAVING:                                                        *");
                System.out.println("*12:-FANCY TOPS(SLEEVELESS,HALTER NECKED,FULL SLEEVES ETC.  ---> Rs 199             *");
                System.out.println("*13:-COCKTAIL DRESSES                                       ---> Rs 1000            *");
                System.out.println("*14:-DISCO DRESSES                                          ---> Rs 1500            *");
                System.out.println("*15:-STRAPLESS DRESSES                                      ---> Rs 2500            *");
                System.out.println("*************************************************************************************");
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!ENTER YOUR CHOICE!!!!!!!!!!!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice1=Integer.parseInt(br.readLine());
                String product[]={"SAREES","PATTIYALLAS","CHURRIDHAARS","SALWAR KAMEEZ","KURTIS","GHAGRAS","FORMAL PANTS","FORMAL SHIRTS AND T-SHIRTS ","FORMAL SKIRTS","COATS ","JEANS(DENIM)","FANCY TOPS(SLEEVELESS,HALTER NECKED,FULL SLEEVES ETC.","COCKTAIL DRESSES","DISCO DRESSES","STRAPLESS DRESSES"};
                int rate[]={900,500,400,650,150,550,599,399,499,350,299,199,1000,1500,2500};
                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[choice1-1]= product[choice1-1];
                qty[choice1-1]=qty[choice1-1]+q;
                price[choice1-1]=qty[choice1-1]*rate[choice1-1];
                System.out.println("You have purchased\t\t\t\t"+qty[choice1-1]+"\t\t"+ item[choice1-1]+ "\t\t\t\t "+price[choice1-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                choice1=Integer.parseInt(br.readLine());
            }while(choice1!=0);

        }catch(Exception e){}
        for(int i=0;i<15;i++)
        {
            amount=amount+price[i];
        }

        System.out.println("TOTAL AMOUNT="+amount);
    }}

