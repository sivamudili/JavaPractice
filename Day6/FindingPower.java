package Day6;

import java.util.Scanner;

public class FindingPower {
    public static void operation(Scanner sc){
        System.out.println("Enter Base number");
        int base = sc.nextInt();
        System.out.println("Enter Exponential number");
        int exp = sc.nextInt();
        int result=1;
        for(int i=1; i<=exp; i++){
           result=result*base;
        }
        System.out.println("Power of a given numberis "+result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        operation(sc);
        sc.close();
    }
}
