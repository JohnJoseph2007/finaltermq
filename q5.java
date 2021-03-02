//Write a program to input the price of a product (decimal) and quantity purchased
//(integer). Calculate the total cost as per the given criteria:
//t>30000.00 : d=10%
//15000.00-30000.00 : d=7.5%
//5000-14999.00 : d=5.5%
//else : d=3%;

import java.util.*;
class q5 {
   public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       double p, t, d;
       int q;
       System.out.println("Enter price and quantity");
       p = obj.nextDouble();
       q = obj.nextInt();
       t = p*q;
       if(t>30000.00) {
           d=10.0;
       } else if(t>15000.00&&t<30000.00) {
           d=7.5;
       } else if(t>5000.00&&t<14999.00) {
           d=5.5;
       } else {
           d=3.0;
       }

       double dt=t-((d/100)*t);
       System.out.println("Total cost is : " + dt);
   } 
}
