//Write a program to input the total purchase amount (pur-amt) in decimals for the
//products purchased on a shop and print the type of gift won by the customer as
//per the given criteria :
//a>25000 : mobile phone worth 3500/-
//a>=15000&&a<=25000 : laptop bag worth 1500/-
//a>3000&&a<=14999 : wrist watch worth 700/-
//else : pair of pens worth 150/-

import java.util.*;
class q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int puramt;
        System.out.println("Enter Purchase Amount");
        puramt = obj.nextInt();
        int a = puramt;

        if(a>25000) {
            System.out.println("You won a mobile phone worth 3500/-");
        } else if(a>=15000&&a<=25000) {
            System.out.println("You won a laptop bag worth 1500/-");
        } else if(a>3000&&a<=14999) {
            System.out.println("You won a wrist watch worth 700/-");
        } else {
            System.out.println("You won a pair of pens worth 150/-");
        }
    }
}
