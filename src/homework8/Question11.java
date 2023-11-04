package homework8;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabets between a to f");
        char city=sc.next().charAt(0);

        if(city=='A'||city=='a')
        {
            System.out.println("ahemdabad,adminton,ambaji");
        } else if (city=='B'||city=='b')
        {
            System.out.println("BARODA,BUFFALO,BAKROL,BERLIN");
        } else if (city=='C'||city=='c')
        {
            System.out.println("Caracas,CHENNAI,cairo,CHICAGO");
        } else if (city=='D'||city=='d')
        {
            System.out.println("DALLAS,DENVER,DENIZLI,DELHI,DUBAI");
        } else if (city=='E'||city=='d')
        {
            System.out.println("edmonton,erie,evanville,evanston");

        } else if (city=='F'||city=='f')
        {
            System.out.println("fes,fuxin,fresno,faridabad,foshan");
        } else
        {
            System.out.println("invalid city");
        }

    }
}
