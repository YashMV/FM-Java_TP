import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int input, input1, input2, result;  //Declare variables
        double trig_result;
        double exp_result, input1_pow,input2_pow;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an input: ");  //Take input for computation to be performed
        input=sc.nextInt();
        switch(input) {  //Cases based on the instruction received
            case 1:  //Addition
                System.out.println("Enter two numbers: ");
                input1 = sc.nextInt();
                input2 = sc.nextInt();
                result = input1 + input2;
                System.out.println("The addition is: "+result);
                break;
            case 2:  //Subtraction
                System.out.println("Enter two numbers: ");
                input1 = sc.nextInt();
                input2 = sc.nextInt();
                result = input1 - input2;
                System.out.println("The subtraction is: "+result);
                break;
            case 3:  //Multiplication
                System.out.println("Enter two numbers: ");
                input1 = sc.nextInt();
                input2 = sc.nextInt();
                result = input1 * input2;
                System.out.println("The multiplication is: "+result);
                break;
            case 4:  //Sin
                System.out.println("Enter a number in radian to find Sine: ");
                input1= sc.nextInt();
                trig_result=Math.sin(input1);
                System.out.println("The Sine is: "+trig_result);
                break;
            case 5:  //Cos
                System.out.println("Enter a number in radian to find Cosine: ");
                input1= sc.nextInt();
                trig_result=Math.cos(input1);
                System.out.println("The Cosine is: "+trig_result);
                break;
            case 6:  //Tan
                System.out.println("Enter a number in radian to find Tangent: ");
                input1= sc.nextInt();
                trig_result=Math.tan(input1);
                System.out.println("The Tangent is: "+trig_result);
                break;
            case 7:  //Exp
                System.out.println("Enter two numbers: ");
                input1_pow = sc.nextInt();
                input2_pow = sc.nextInt();
                exp_result = Math.pow(input1_pow,input2_pow);
                System.out.println("The exponential is: "+exp_result);
                break;
        }
    }
}
