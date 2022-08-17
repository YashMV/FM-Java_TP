import java.util.Scanner;

public class Fastest {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2, str3;
        System.out.println("Enter lap1 time: ");
        str1=sc.next();
        System.out.println("Enter lap 2 time: ");
        str2=sc.next();
        System.out.println("Enter lap 3 time: ");
        str3=sc.next();
        String str4 = (str2.compareTo(str1)>0)?(str3.compareTo(str1)>0?str1:str3):(str3.compareTo(str2)>0?str2:str3);  //Use ternary operator to find the fastest lap
        String[] s = {str1, str2, str3};
        for (int i = 0; i < 3; i++) {
            if(s[i].equals(str4)){
                int k=i+1;
                System.out.println("Lap "+k+" was the fastest");  //Print which lap was the fastest by comparing with the fastest lap
            }
        }
    }
}