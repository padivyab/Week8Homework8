package homework8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if (a>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }

    }
}
