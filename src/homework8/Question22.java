package homework8;

/*22. Write a Java program to calculate the average value of array elements.*/
public class Question22 {
    public static void main(String[] args) {

        int[] nums = new int[]{20,40,50,70,60};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < nums.length ; i++)
            sum = sum + nums[i];
        //calculate average value
        double average = sum / nums.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
