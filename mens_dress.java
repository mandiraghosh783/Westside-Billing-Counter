package com.company;

import java.io.*;
import java.lang.*;
public class mens_dress
{
    public static int amount=0;
    public static int price[]=new int[18];
    public static int qty[]=new int[18];
    public static String item[]=new String[18];
    int answer=0;
    public void menmenu()
    {
        try
        {
            do
            {
                System.out.println("   ");
                System.out.println("***********************************************************");
                System.out.println("*         YOU HAVE ENTERED IN MENS' DRESS SECTION               *");
                System.out.println("WE PROVIDE A WIDE RANGE OF SELECTION!!!!!");
                System.out.println("ALL SIZE RANGES I.E SMALL(s),MEDIUM(m),LARGE(l),EXTRA LARGE(Xl AND XXl) AND EXTRA SMALL(XXS AND XS) ARE PROVIDED IN OUR STORE");
                System.out.println("**************************************************************");
                System.out.println("IN ETHNIC SECTION, WE ARE HAVING.....                        *");
                System.out.println("*1:- KURTAS                      --->Rs 699                  *");
                System.out.println("*2:- TRADITIONAL SHERWANIS       --->Rs 1999                 *");
                System.out.println("*3:- JODHPURI SUIT               --->Rs 2999                 *");
                System.out.println("*4:- KURTA PYJAMA                --->Rs 1750                 *");
                System.out.println("**************************************************************");
                System.out.println("IN CASUAL WEAR,WE ARE HAVING........                         *");
                System.out.println("*5:- CASUAL PANTS                --->Rs 1000                 *");
                System.out.println("*6:- CASUAL SHIRTS               --->Rs 750                  *");
                System.out.println("*7:- CASUAL T-SHIRTS             --->Rs 800                  *");
                System.out.println("*8:- SWEATERS AND JACKETS        --->Rs 1500                 *");
                System.out.println("*9:- TROUSERS AND SHORTS         --->Rs 1250                 *");
                System.out.println("**************************************************************");
                System.out.println("IN FORMAL WEAR, WE ARE HAVING..........                      *");
                System.out.println("*10:- FORMAL PANTS               --->Rs 1999                 *");
                System.out.println("*11:-FORMAL SHIRTS               --->Rs 1000                 *");
                System.out.println("*12:-SUITS                       --->Rs 3999                 *");
                System.out.println("*13:-TUXEDOES                    --->Rs 3999                 *");
                System.out.println("*14:-COATS AND BLAZERS           --->Rs 2950                 *");
                System.out.println("**************************************************************");
                System.out.println("IN WESTERN WEAR ,WE ARE HAVING.....                          *");
                System.out.println("*15:-JEANS(DENIM)                --->Rs 499                  *");
                System.out.println("*16:-WESTERN DESIGNED TOPS       --->Rs 299                  *");
                System.out.println("IN PARTY WEAR,WE ARE HAVING.....                             *");
                System.out.println("*17:-PARTY WEAR SUITS            --->Rs 2000                 *");
                System.out.println("*18:-FUNKY PARTY WEAR OUTFITS    --->Rs 2950                 *");
                System.out.println("**************************************************************");
                System.out.println("!!!!!ENTER YOUR CHOICE!!!!!");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                answer=Integer.parseInt(br.readLine());
                String product[]={"KURTAS  ","TRADITIONAL SHERWANIS","JODHPURI SUIT","KURTA PYJAMA"," CASUAL PANTS"," CASUAL SHIRTS","CASUAL T-SHIRTS","SWEATERS AND JACKETS","TROUSERS AND SHORTS","FORMAL PANTS","FORMAL SHIRTS","SUITS","TUXEDOES","COATS AND BLAZERS","JEANS(DENIM) ","WESTERN DESIGNED TOPS","PARTY WEAR SUITS ","FUNKY PARTY WEAR OUTFITS"};
                int rate[]={699,1999,2999,1750,1000,750,800,1500,1250,1999,1000,3999,399,2950,499,299,2000,2500};

                System.out.println("Enter Quantity");
                int q=Integer.parseInt(br.readLine());
                item[answer-1]= product[answer-1];
                qty[answer-1]=qty[answer-1]+q;
                price[answer-1]=qty[answer-1]*rate[answer-1];
                System.out.println("You have purchased\t\t\t\t"+qty[answer-1]+"\t\t"+ item[answer-1]+ "\t\t\t\t "+price[answer-1]);
                System.out.println(" DO YOU WANT ANYTHING ELSE(PRESS 1 FOR YES AND 0 FOR NO)");
                answer=Integer.parseInt(br.readLine());
            }while(answer!=0);
        }catch(Exception e){}
        for(int i=0;i<18;i++)
        {
            amount=amount+price[i];
        }
        System.out.println("TOTAL AMOUNT ="+amount);
    }}

