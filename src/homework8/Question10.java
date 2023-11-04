package homework8;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sales id");
        int id= sc.nextInt();
        System.out.println("Seller's name");
        String str =sc.next();
        System.out.println("Sales amount");
        int salesamount = sc.nextInt();

        if(salesamount >= 50000)
        {

            System.out.println("Sales commission is " +(salesamount*35/100));
        }
        else if ((salesamount >=30000))
        {

            System.out.println("Sales commission is "+(salesamount*30/100));
        }
        else if(salesamount >=20000)
        {

            System.out.println("Sales commission is "+(salesamount*20/100));
        }
        else if(salesamount >= 10000)
        {

            System.out.println("Sales commission is"+(salesamount*5/100));
        }

        else
        {

            System.out.println("Sales commission is "+(salesamount*2/100));
        }
    }
}
