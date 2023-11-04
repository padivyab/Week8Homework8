package homework8;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String con =" ";
        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.print("Enter number: ");
            int num1 = sc.nextInt();
            System.out.println("Choose Operator [1] Multiplication [2] Addition [3] Subtraction [4] Division");
            int ch = sc.nextInt();
            if(ch==1){

                System.out.println("Answer: "+(num*num1));

            }else if(ch==2){

                System.out.println("Answer: "+(num+num1));

            }else if(ch==3){

                System.out.print("Answer: "+(num-num1));

            }else if(ch==4){

                System.out.println("Answer: "+(num/num1));

            }else{

                System.out.println("Error Operator");

            }
            System.out.println("Do you want to continue? type y(Yes) type n(No): ");
            con = sc.next();
        } while("y".equals(con)||"Y".equals(con));
        if("n".equals(con)||"N".equals(con)){
            System.out.println("End Program!");
        }else{
            System.out.println("Error Input!");
        }
    }
}
