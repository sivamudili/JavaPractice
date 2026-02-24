package Day2;

import java.util.Scanner;

public class MultiplicationWithoutStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        int result=0;
        for(int i=1; i<=num2; i++){
            result = result+num1;
        }
        System.out.println(result);
        sc.close();
    }
}
