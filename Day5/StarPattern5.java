package Day5;

import java.util.Scanner;

public class StarPattern5 {
    public static void printingStar(Scanner sc){
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i;  j<=n; j++){
                 System.out.print("  ");
            }
            for(int j=1;  j<=i; j++){
                 System.out.print("* ");
            }
            System.out.println();
             }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printingStar(sc);
        sc.close();
    }
}
