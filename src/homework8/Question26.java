package homework8;

import java.util.Scanner;

/*26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/
public class Question26 {
    public static void main(String[] args) {

        System.out.println("Sample Output :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word : ");
        String w = sc.nextLine();
        w = w.trim();
        String result = "";
        char[] ch = w.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];

        }
        System.out.println("Reverse Word : " + result.trim());
    }
}
