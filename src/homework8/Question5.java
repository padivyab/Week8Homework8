package homework8;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|____________________________|");
        System.out.println("|      Marksheet             |");
        System.out.println("|____________________________|");
        System.out.println("|   Name     :               |");
        String name = sc.next();
        System.out.print("|   Roll No:                 |");
        int rollno = sc.nextInt();
        System.out.println("|____________________________|");
        System.out.println("|   Subjects  :        Marks |");
        System.out.println("|____________________________|");
        System.out.print("|   Math      :              |");
        int math = sc.nextInt();
        System.out.println("|  Science    :            |");
        int sci=sc.nextInt();
        System.out.println("|English      :            |");
        int eng=sc.nextInt();
        System.out.println("------------------------------");

        int t = math + sci + eng;
        double p = t / 300.00 * 100.00;
        String p1 = "";
        String g = "";
        if (p >= 80) {
            g = "A+";
            p1 = "pass";
        } else if (p >= 60) {
            g = "A";
            p1 = "pass";
        } else if (p >= 50) {
            g = "B";
            p1 = "pass";
        } else if (p >= 35) {
            g = "c";
            p1 = "pass";
        } else {
            System.out.println("Fail");
        }


        System.out.println("|Total          :"         + t);
        System.out.println("------------------------------");
        System.out.println("|Percentage     :"         + p);
        System.out.println("|Result         :"         + p1);
        System.out.println("|Grade          :"         + g);
        System.out.println("|____________________________|");
    }
    }

