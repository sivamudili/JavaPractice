package Day3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
          if(num>0 && num%i==0){
                  count++;
          }
        }
        if(count == 2){
           System.out.println(num+" is a Prime number");
        }
        else{
            System.out.println(num+" is NOT a Prime number");
        }
        sc.close();
    }
}
