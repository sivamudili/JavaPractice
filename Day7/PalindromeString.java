package Day7;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String");
        String text = sc.nextLine();
        String reverse = "";
        for(int i =text.length()-1; i>=0; i--){
            reverse = reverse + text.charAt(i);
        }
        System.out.println(reverse);
        if(text.equalsIgnoreCase(reverse)){
            System.out.println("Given string is an Pallindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
