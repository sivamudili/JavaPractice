package Day6;

import java.util.Scanner;

public class FindingSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int min=9;
        while(number!=0){
            int digit = number % 10;
            if(digit<min){
                min=digit;
            }
            number = number /10;
        }
        System.out.println(min+" is the Smallest digit in the Given number");
        sc.close();
    }
}
