package Day3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int product=1;
        if(temp < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }
        else if(temp == 0){
            System.out.println("1 is a factorial of "+temp);
        }
        else{
        for(;num>0;num--){
            product*=num;
        }
        System.out.println(product+" is a factorial of "+temp);
        }
        sc.close();
    }
}
