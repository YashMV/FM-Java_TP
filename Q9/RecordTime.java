import java.util.Scanner;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class RecordTime {
    static int start = 0;  //Initialize the timer variables
    static long  endTime=0, startTime=0;
    static long timeElapsed = 0;
    public static void main(String[] args){
        int test=3;
        Scanner sc = new Scanner(System.in);
        while(test!=0) {
            System.out.println("\nPick a test to start: ");   //Take the test input from the user
            System.out.println("Acceleration test: 1");
            System.out.println("Endurance test: 2");
            System.out.println("To exit: 0");
            test = sc.nextInt();
            if (test == 0) {  //If user enters '0' then break and stop the program
                break;
            }
            switch (test) {
                case 1: //Acceleration test
                    System.out.println("To start acceleration test press 1");
                    start = sc.nextInt();
                    if (start == 1) {
                        start = 0;
                        String recdtime = convertToString(measureTime());  //Calculate time using another method and print the value
                        System.out.println(recdtime);
                    }
                    break;
                case 2: //Endurance Test
                    System.out.println("To exit endurance test press 0");
                    start =1;
                    while(true){
                        if (start == 1) {
                            start = 0;
                            String recdtime = convertToStringMins(measureTimeLap());  //Calculate time using another method and print the value
                            System.out.println(recdtime);
                        }
                        if(start==0){
                            break;
                        }
                    }
                    break;
        }
        }
        System.out.println("Program over. Thank you!");
    }

    public static String convertToString(long time){  //Method to convert time in SS:MSMS format
        String str;
        str=String.format("%d:%d",time/1000,time%1000);
        return str;
    }

    public static String convertToStringMins(long time){  //Method to convert time in MM:SS:MSMS format
        String str;
        str=String.format("%d:%d:%d",time/60000,time/1000,time%1000);
        return str;
    }
    public static long measureTime() {  //Method to measure time in seconds
        startTime = Instant.now().toEpochMilli();  //Records the start time
        Scanner sc = new Scanner(System.in);
        while (start != 1) {  //Hold the loop until 1 is pressed
            System.out.println("to stop press 1");
            start = sc.nextInt();
            if (start == 1)
            {
                endTime = Instant.now().toEpochMilli();  //Record endtime
                break;
            }
        }
        timeElapsed = endTime - startTime;  //Calculate total time elapsed in secods and return the value
        return timeElapsed;
    }

    public static long measureTimeLap() {  //Method to measure lap time in seconds
        startTime = Instant.now().toEpochMilli();  //Records the start time
        Scanner sc = new Scanner(System.in);
        while (start != 1) {  //Hold the loop until 1 is pressed
            System.out.println("to record lap time press 1");
            start = sc.nextInt();
            if(start==0){
                break;
            }
            if (start == 1)
            {
                endTime = Instant.now().toEpochMilli();  //Record endtime
                break;
            }
        }
        timeElapsed = endTime - startTime;  //Calculate total time elapsed in secods and return the value
        return timeElapsed;
    }
}
