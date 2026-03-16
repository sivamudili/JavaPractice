package Day6;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count=0;
        while(number!=0){
            int digit = number%10;
            if(digit%2!=0){
                count++;
            }
            number=number/10;
        }
        System.out.println("Count of Odd digits: "+count);
        if(count>0){
            System.out.println("Given number contains "+count+" Odd digits");
        }
        else{
            System.out.println("Given number does not contains Odd digits");
        }
        sc.close();
    }
}
