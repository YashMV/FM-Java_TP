import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int num, remainder, num_copy;  //Declare variables
        int rev_num = 0;
        System.out.println("Enter an integer: ");  //Take the integer input from the user
        num=sc.nextInt();
        num_copy = num;  //Store a copy to compare later

        while (num != 0) {
            remainder = num % 10;
            rev_num = rev_num * 10 + remainder;
            num = num/ 10;
        }

        if (num_copy == rev_num)  //Print the result accordingly
            System.out.printf("The number "+num_copy+" is a palindrome");
        else
            System.out.printf("The number "+num_copy+" is not a palindrome");
    }
}