package Day6;

import java.util.Scanner;

public class NumberPattern5 {
    public static void printingStar(Scanner sc){
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        for(int i=1, p=0; i<=n; i++, p+=2){
            for(int j=1;  j<=i; j++){
                 System.out.print(p+" ");
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
