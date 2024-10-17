/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mortgage2;

import java.text.NumberFormat;
import java.util.Scanner;


///Mortgage Calcullating number2
public class Mortgage2 {

    public static void main(String[] args) {
        final int percent=100;
        final int month_in_year=12;
        int principal=0;
        float annualIntrest=0;
        int period=0;
        int numberPayment=0;
        Scanner scanner=new Scanner(System.in);
        while(true){
        System.out.println("Principal:");
        principal=scanner.nextInt();
        if (principal>=1000 && principal<=1000000)
            break;
        else
                System.out.println("Enter a value between 1000 and 1000000.");
        }
        while(true){
        System.out.println("Annual Intrest Rate:");
        annualIntrest=scanner.nextFloat();
        if(annualIntrest>0 && annualIntrest<=30)
            break;
        else
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        double monthlyIntrest=(annualIntrest/month_in_year)/percent;
        while(true){
            System.out.println("Period:");
            period=scanner.nextInt();
            if(period>0){
                numberPayment= period*12;
                break;
            }
            else
                System.out.println("Enter a value between 1 and 30.");
        }
        
        double pow = Math.pow((1+monthlyIntrest),(double)numberPayment);
        double mortgage= principal*((monthlyIntrest*pow)/(pow-1));
        String result =NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+result);
    }
}
