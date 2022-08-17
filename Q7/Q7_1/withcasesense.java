import java.util.Scanner;

public class withcasesense {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2;  //Declare two strings
        boolean check;  //Declare check variable
        System.out.println("Enter string 1: ");  //Take string inputs
        str1=sc.next();
        System.out.println("Enter string 2: ");
        str2=sc.next();
        check = str1.equals(str2);  ////Check for equality case sensitivity and print accordingly
        if(check)
        {
            System.out.println("The strings are equal");
        }
        else
            System.out.println("The strings are not equal");
    }
}