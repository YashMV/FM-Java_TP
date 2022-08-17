import java.util.Scanner;

public class Subtract {
    public static void main(String[] args){
        int a,b,subresult;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a: ");  //Get 1st number
        a=sc.nextInt();
        System.out.println("Enter b: ");  //Get 2nd number
        b=sc.nextInt();
        subresult=a+~b+1;  //Taking two's complement of the number and addding is equal to subtraction
        System.out.println("The result is: "+subresult);
    }
}