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
            try{
                Pattern.compile(pattern);
            } catch (PatternSyntaxException e){
                flag=1;
            }
            if(flag==1){
                System.out.println("Invalid");
            }
            else
                System.out.println("Valid");
            testCases--;
        }
    }
}