package Day3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int next=0;
        int first=0;
        int second=1;
        for(int i=0; i<num; i++){
            System.out.print(first+" "); //Before n=0 
            next=first+second;//Before m=1
            first=second;//After n=1
            second=next;//After m=1
        }
        sc.close();
    }
}
