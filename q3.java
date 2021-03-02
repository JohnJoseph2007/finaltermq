//Write a program, which calculates and prints the House Rent allowance (HRA) and
//Dearness Allowance (DA) and total salary (base+DA+HRA) of an employee. The basic
//salary is taken as input from user. If base>20000, then HRA is 15% of base. If
//base<=20000, then HRA is 10% of the base. DA is 107% of the base.

import java.util.*;
class q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double base, hra, da, total;
        double hrap = 0.00;;
        System.out.println("Enter base salary as a decimal number");
        base = obj.nextDouble();
        da = (107.00/100.00)*base;
        if(base>20000) {
            hrap = 15.00;
        } else if(base<=20000) {
            hrap = 10.00;
        }
        hra = (hrap/100.00)*base;
        total = hra+da+base;
        System.out.println("House Rent Allowance (HRA) is : " + hra);
        System.out.println("Dearness Allowance (DA) is : " + da);
        System.out.println("Total Salary is : " + total);
    }
}
