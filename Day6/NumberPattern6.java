package Day6;

import java.util.Scanner;

public class NumberPattern6 {
    public static void printingStar(Scanner sc){
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1;  j<=i; j++){
                 if(i%2==0){
                    System.out.print("2 ");
                 }
                 else{
                    System.out.print("1 ");
                 }
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
