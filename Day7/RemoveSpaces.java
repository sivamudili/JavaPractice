package Day7;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string");
        String text = sc.nextLine();
        String result = "";
        for(int i=0; i<text.length();i++){
            if(text.charAt(i) != ' '){
                result+=text.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
