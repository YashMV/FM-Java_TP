import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a big number: ");  //Take inputs from the user
        String num1=sc.next();
        System.out.println("Enter another big number: ");
        String num2=sc.next();
        BigInteger x=new BigInteger(num1);
        BigInteger y=new BigInteger(num2);
        BigInteger add=BigInteger.ONE;
        BigInteger mul=BigInteger.TEN;
        add = x.add(y);  //Add two BigIntegers using add() method
        mul = x.multiply(y);   //Multiply two BigIntegers using multiply() method
        System.out.println(add);  //Print the result
        System.out.print(mul);
    }
}