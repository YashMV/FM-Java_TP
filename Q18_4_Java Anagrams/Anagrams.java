import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        boolean result;
        char[] letters1 = a.toCharArray();
        char[] letters2 = b.toCharArray();
        int[] container1 = new int[26];
        int[] container2 = new int[26];
        Arrays.fill(container1,0);
        Arrays.fill(container2,0);

        for (char c : letters1) {
            if (Character.isUpperCase(c)) {
                container1[c - 65]++ ;
            } else if (Character.isLowerCase(c)) {
                container1[c - 97]++;
            }
        }
        for (char d : letters2) {
            if (Character.isUpperCase(d)) {
                container2[d - 65]++;
            } else if (Character.isLowerCase(d)) {
                container2[d - 97]++;
            }
        }
        result = Arrays.equals(container1, container2);
        return result;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}