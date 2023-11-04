package homework8;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("|        Salary Slip                 |");
        System.out.println("|-----------------------------------|");
        System.out.print("|   Employee Id           :            |");
        int id=sc.nextInt();
        System.out.print("|   Employee Name         :          |");
        String str=sc.next();
        System.out.println("|----------------------------------|");
        System.out.println("|   Basic salary          :        |");
        double sal = sc.nextDouble();
        double HRA = 10/100.00 * sal;
        System.out.println("|   HRA 10%               :"+HRA  +"  |    ");
        double TA = 9/100.00 * sal;
        System.out.println("|   TA 8%                 :"+TA   +"  |     ");
        double DA = 8/100.00 * sal;
        System.out.println("|   DA 9%                 :"+DA   +"  |     ");
        double PF = 20/100.00 * sal;
        System.out.println("|   PF 20%                :"+PF   +"  |     ");
        System.out.println("|----------------------------------|");
        double grosssalary = sal+HRA+TA+DA-PF;
        System.out.println("|Gross Salary             :"+grosssalary +" |  ");
        System.out.println("|==================================|");

    }
}
