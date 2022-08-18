import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        boolean result;  //Declaring result variable
        char[] letters1 = a.toCharArray();  //Converting all strings to character arrays
        char[] letters2 = b.toCharArray();
        int[] container1 = new int[26];  //Declaring to character arrays of length 26 for storing count of each letter
        int[] container2 = new int[26];
        Arrays.fill(container1,0);  //Initialize the count of all letters to zero
        Arrays.fill(container2,0);

        for (char c : letters1) {  //For String 1
            if (Character.isUpperCase(c)) {  //If uppercase then increment counter by 1
                container1[c - 65]++ ;
            } else if (Character.isLowerCase(c)) {  //If lowercase then increment counter by 1
                container1[c - 97]++;
            }
        }
        for (char d : letters2) {  //Repeat the same for String 2
            if (Character.isUpperCase(d)) {
                container2[d - 65]++;
            } else if (Character.isLowerCase(d)) {
                container2[d - 97]++;
            }
        }
        result = Arrays.equals(container1, container2);  //Compare the two arrays
        return result;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);  //Based on result of the comparison print messages accordingly
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}