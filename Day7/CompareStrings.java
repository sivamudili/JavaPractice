package Day7;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string");
        String text1 = sc.nextLine();
        System.out.println("Enter Second string");
        String text2 = sc.nextLine();
        System.out.println(text1.equals(text2));
        System.out.println(text1.equalsIgnoreCase(text2));
        sc.close();
    }
}
