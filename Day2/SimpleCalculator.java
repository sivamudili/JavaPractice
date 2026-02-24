package Day2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet first Number");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = sc.nextFloat();
        System.out.println("Enter an operator");
        char operator = sc.next().charAt(0);
        if(operator == '+'){
            System.out.println(num1+num2);
        }
        else if (operator == '-') {
            System.out.println(num1-num2);
        } 
        else if(operator == '*'){
            System.out.println(num1*num2);
        }
        else if(operator == '/'){
            System.out.println(num1/num2);
        }
        else if(operator == '%'){
            System.out.println(num1%num2);
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
