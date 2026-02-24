package Day2;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = (n*(n+1))/2;
        System.out.println(result);
        sc.close();
    }
}
