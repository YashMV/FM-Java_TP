import java.util.Scanner;

public class Countvowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: "); //Take the string input from use rto calculate vowels
        String recd=sc.next();
        char[] recdarr=recd.toCharArray();  //Convert the String to Character array
        int count=0;  //Initialize the counter to zero
        for(char c:recdarr){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')  //Condition to check if the character is vowel
            {
                count=count+1;  //Increment the couter if it is a vowel
            }
        }
        System.out.println("The number of vowels is "+count);  //Print the number of vowels
    }
}