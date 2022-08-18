import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        String temp;
        for (int i = 0; i < n; i++) {
            BigDecimal big = new BigDecimal(s[i]);
            int j=i;  //Store a copy of the current index
            for (int k = i+1; k < n; k++) {  //Iterate the array starting ahead of current index
                BigDecimal present = new BigDecimal(s[k]);
                if(present.compareTo(big)==1){  //Compare current value with big value and if current value is bigger than update the big value
                    big=present;
                    j=k;
                }
            }
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);  //Print the array
        }
    }

}