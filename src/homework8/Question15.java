package homework8;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any value : ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9'){

            System.out.println(ch + " is A NUMBER.");

        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");


        } else {

            System.out.println(ch + " is A SYMBOL");
        }
    }
}
