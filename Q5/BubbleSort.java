import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, temp, n;  //Declare variables
        int[] a = new int[50];  //Declare array to store elements
        System.out.println("Enter number of elements (n): ");  //Take number of elements
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");  //Take the elements
        for (i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        for(i = 0; i<n; i++) {  //Compare the value of present element with the next one
            for(j=i+1; j<n; j++) {
                if(a[j]<a[i]) {
                    temp = a[i];  //Swap if next one is smaller than the present one
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The elements sorted using bubble sort are: ");
        for (i = 0; i <n ; i++) {
            System.out.println(a[i]);
        }
    }
}