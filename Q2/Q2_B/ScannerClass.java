import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //Create a new object of "Scanner" class
        String str = sc.next();  //Take the inputs from the user
        int number = sc.nextInt();
        char ch = sc.next().charAt(0);
        double db=sc.nextDouble();
        System.out.println("The string taken was: "+str);  //Print the inputs
        System.out.println("The int number taken was: "+number);
        System.out.println("The character taken was: "+ch);
        System.out.println("The double taken was: "+db);
    }
}