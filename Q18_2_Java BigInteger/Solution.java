import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a big number: ");
        String num1=sc.next();
        System.out.println("Enter another big number: ");
        String num2=sc.next();
        BigInteger x=new BigInteger(num1);
        BigInteger y=new BigInteger(num2);
        BigInteger add=BigInteger.ONE;
        BigInteger mul=BigInteger.TEN;
        add = x.add(y);
        mul = x.multiply(y);
        System.out.println(add);
        //System.out.println("\n");
        System.out.print(mul);
    }
}