package Day7;

import java.util.Scanner;

public class ConvertLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string");
        String text = sc.nextLine();
        System.out.println(text.toLowerCase());
        sc.close();
    }
}
