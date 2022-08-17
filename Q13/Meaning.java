import java.util.Scanner;

public class Meaning {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2;
        System.out.println("Enter string 1: ");  //Take 1st string
        str1=sc.next();
        System.out.println("Enter string 2: ");  //Take 2nd string
        str2=sc.next();
        int meaning=checkFunction(str1, str2);  //Returned value of checkFunction is stored in meaning
        System.out.print(meaning);  //Print meaning
    }
    public static int checkFunction(String s1, String s2){  //Method to compare the strings and return a number accordingly
        if(s1.equalsIgnoreCase(s2)){
            if(s1.equals(s2)){
                return 0;
            }
            return 1;
        }
        else
            return 2;
    }
}