import java.util.Scanner;

public class NumberPattern1 {
    public static void printingStar(Scanner sc){
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int coln=1;  coln<=row; coln++){
                 System.out.print(coln+" ");
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


