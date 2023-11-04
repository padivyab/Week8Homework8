package homework8;

/*21. Write a Java program to sum values of an array.*/
public class Question21 {
    public static void main(String[] args) {

        int a[] = {1,2,6,8,4,3};
        int sum = 0;

        for (int i : a)
        {
            sum += i;
        }
        System.out.println("The sum if array :" +sum);

    }
}
