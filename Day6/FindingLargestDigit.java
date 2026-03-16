package Day6;

import java.util.Scanner;

public class FindingLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int max=0;
        while(number!=0){
            int digit = number % 10;
            if(digit>max){
                max=digit;
            }
            number = number /10;
        }
        System.out.println(max+" is the largest digit in the Given number");
        sc.close();
    }
}
