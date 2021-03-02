//input 3 integer values. print highest and smallest of them

import java.util.*;
class q1 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n1, n2, n3, h, l;
        System.out.println("Enter 3 numbers without decimals");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();

        if(n1>n2&&n1>n3) {
            h = n1;
        } else if(n2>n1&&n2>n3) {
            h = n2;
        } else {
            h = n3;
        }

        if(n1<n2&&n1<n3) {
            l = n1;
        } else if(n2<n1&&n2<n3) {
            l = n2;
        } else {
            l = n3;
        }

        System.out.println("Highest number : " + h);
        System.out.println("Lowest number : " + l);
    }
}