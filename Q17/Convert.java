import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of the array: ");  //Enter the length of array of integers
        int n=sc.nextInt();
        int[] takearr = new int[n];
        char[] c = new char[n];
        char[] takech=new char[n];
        int[] showarr = new int[n];
        System.out.println("Enter an array: ");  //Enter the array
        for(int i=0; i<n;i++){
            takearr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){  //Store corresponding characters
            c[i]=(char)takearr[i];
        }
        System.out.println("The corresponding string is: ");  //Print the corresponding string
        for(int i=0; i<n;i++){
            System.out.print(c[i]);
        }
        System.out.println("\nEnter length of string: ");  //Enter the length of String
        int num=sc.nextInt();
        System.out.println("Enter  a string: ");  //Take the string
        String str = sc.next();
        System.out.println("The corresponding array is: ");
        takech=str.toCharArray();  //Convert the corresponding string to character array
        for(int i=0; i<num;i++){  //Convert the corresponding character array to integer array
            showarr[i]=(int)takech[i];
        }
        for(int i=0; i<num;i++){  //Print the corresponding character array
            System.out.println(" "+showarr[i]);
        }
    }
}