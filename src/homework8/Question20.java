package homework8;

import java.util.Arrays;
/*Write a Java program to sort a numeric array and a string array.*/
public class Question20 {
    public static void main(String[] args) {

        int[] num = {3,5,6,7,8};
        String[] str = {"divya","shiv","harsh","shiva"};

        Arrays.toString(num);
        Arrays.toString(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

    }
}
