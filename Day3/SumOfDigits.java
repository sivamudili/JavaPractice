package Day3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num=num/10;
        }
         System.out.println("sum of all digits in a given numder is "+sum);
        sc.close();
    }
}
