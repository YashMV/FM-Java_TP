import java.util.Scanner;

public class FastestLap {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String str1, str2, str3;
        System.out.println("Enter lap1 time: ");  //Take lap times from the user
        str1=sc.next();
        System.out.println("Enter lap 2 time: ");
        str2=sc.next();
        System.out.println("Enter lap 3 time: ");
        str3=sc.next();
        if(str1.compareTo(str2)>0){  //Compare the strings and print the result accordingly
            if(str2.compareTo(str3)>0){
                System.out.println("Lap 3 is the fastest");
            }
            else if(str3.compareTo(str2) > 0){
                System.out.println("Lap 2 is the fastest");
            }
        }
        else if(str3.compareTo(str1)>0){
            System.out.println("Lap 1 is the fastest");
        }
        else if(str1.compareTo(str3)>0){
            System.out.println("Lap 3 is the fastest");
        }
    }
}