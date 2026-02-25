package Day3;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Positive Integer Number");
        int num = sc.nextInt();
        int temp = num;
        int  count =0;
        int sum=0;
        if (temp == 0) {
            count =1;
        }
        else{
            for(; num!=0; num=num/10){
              count++;
        }
        }
         temp = num;
        System.out.println("No of digits in a given number "+count);
        for(; num!=0; num=num/10){
           int digit = num%10;
             sum += (int)Math.pow(digit,count);
        }
        if (num==sum) {
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("NOT an ArmStrong Number");
        }
        sc.close();
    }
}
