import java.util.Arrays;
import java.util.Scanner;

public class SubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] str = new String[s.length()-k+1];
        for (int i = 0; i <= s.length()-k; i++) {  //For loop to form substrings
            str[i]=s.substring(i,i+k);  //Substrings are made using substring() method and stored in a String array
        }
        Arrays.sort(str);  //Use sort() method to sort the substrings
        smallest= str[0];  //Store smallest and largest substring
        largest=str[str.length-1];
        return smallest + "\n" + largest;  //Return the values
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}