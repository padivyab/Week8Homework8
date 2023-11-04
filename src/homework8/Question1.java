package homework8;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        num=sc.nextInt();

        String msg =  (num % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);
    }
}
