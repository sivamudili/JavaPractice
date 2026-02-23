package Day1;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public void operation(Scanner sc){
        System.out.println("Enter First number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter Third number");
        int num3=sc.nextInt();
        if (num1>=num2 && num1>=num3) {
            System.out.println(num1+" is Largest number");
        }
        else if (num2>num1 && num2>=num3){
            System.out.println(num2+" is Largest number");
        }
        else{
            System.out.println(num3+" is Largest number");
        }
    }
    public static void main(String[] args) {
        LargestOfTwoNumber ln = new LargestOfTwoNumber();
        Scanner sc = new Scanner(System.in);
        ln.operation(sc);
        sc.close(); 
    } 
}
