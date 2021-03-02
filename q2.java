//Input a number. Check and print if it is a buzz number or not.
//HINT: A number that is divisible by 7 and ends with seven is called a buzz number.

import java.util.*;
class q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        System.out.println("Enter a non-decimal number");
        num = obj.nextInt();
        if(num%7==0&&num%10==7) {
            System.out.println("Number is a buzz number");
        } else {
            System.out.println("Number is not a buzz number");
        }
    }
}
