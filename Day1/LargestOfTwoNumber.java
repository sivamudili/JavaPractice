package Day1;

import java.util.Scanner;

public class LargestOfTwoNumber {
    public void operation(Scanner sc){
        System.out.println("Enter First number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        if (num1>num2) {
            System.out.println(num1+" is Largest number");
        }
        else if (num2>num1){
            System.out.println(num2+" is Largest number");
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
    public static void main(String[] args) {
        LargestOfTwoNumber ln = new LargestOfTwoNumber();
        Scanner sc = new Scanner(System.in);
        ln.operation(sc);
      sc.close();  
    }
}
