package Day2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count=0;
        int temp=num;
        if (temp == 0) {
            count =1;
        }
        else{
            for(; num!=0; num=num/10){
              count++;
        }
        }
        System.out.println("No of digits in a given number "+count);
        sc.close();
    }
}
