package Day6;

import java.util.Scanner;

public class FindingLCM {
    public static void operation(Scanner sc){
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int max = (a>b)?a:b;
        int lcm=max;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("LCM of two given numbers is "+lcm);
                break;
            }
            lcm++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        operation(sc);
        sc.close();
    }
}
