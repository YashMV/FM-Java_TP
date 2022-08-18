import java.util.Scanner;
import java.util.regex.*;

public class RegexChecker
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            int flag=0;
            String pattern = in.nextLine();
            try{  //Using try and catch block we check whether it is a pattern
                Pattern.compile(pattern);
            } catch (PatternSyntaxException e){  //Check to see if we get an exception
                flag=1;  //Flag is updated if we receive an exception
            }
            if(flag==1){  //Print messages based on the status of the flag
                System.out.println("Invalid");
            }
            else
                System.out.println("Valid");
            testCases--;  //Decrement test cases
        }
    }
}