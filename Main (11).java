/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class simple_Interest
{
 double principal;
 double rate;
 int years;
 
 public void read()
 {
   System.out.print("Enter the principal: ");
   Scanner sc = new Scanner(System.in);
   this.principal = sc.nextDouble();
   System.out.print("Enter the rate of interest: ");
   this.rate = sc.nextDouble();
   System.out.print("Enter the number of years: ");
   this.years = sc.nextInt();
 }

 public void print()
 {
   int worth = (int)Math.round(principal*(1+rate*years*0.01));
   System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+worth + "." );  
 }
}

public class Main{
 public static void main(String args[])
 {
   simple_Interest ca = new simple_Interest();
   ca.read();
   ca.print();      
 }
}