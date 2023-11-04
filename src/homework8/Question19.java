package homework8;

import java.util.Scanner;
/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/
public class Question19 {

    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number");
        num = sc.nextInt();
        if (num>0)
        {
            System.out.println("POSITIVE");
        } else if (num<0) {
            System.out.println("NEGATIVE");
        }
        else
        {
            System.out.println("ZERO");
        }
    }
}
