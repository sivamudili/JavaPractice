package Day6;

import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int result=0;
        int sum =0;
        for(int i=1; i<=number; i++){
            result= i * i * i;
            sum = sum + result;
        }
        System.out.println("Sum of Cubes of a Given number is "+sum);
        sc.close();
    }
}
