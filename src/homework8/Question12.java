package homework8;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number : ");
        a=sc.nextInt();
        b=(a>0)?1:(a<0)?2:3;

        switch (b)
        {
            case 1:
                System.out.println("Positive");
                break;
            case 2:
                System.out.println("Negative");
                break;
            default:
                System.out.println("Any");
        }
    }
}
