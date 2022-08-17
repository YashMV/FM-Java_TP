import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter number of rows: ");  //Take the number of rows as input
        int n=sc.nextInt();
        for(i=0;i<n;i++){  //Print the sequence
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j <= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
