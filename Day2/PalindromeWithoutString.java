package Day2;

import java.util.Scanner;

public class PalindromeWithoutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original=num;
        int reverse=0;
        while(num!=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println(reverse);
        if(original == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Plindrome");
        }
        sc.close();
    }
}

