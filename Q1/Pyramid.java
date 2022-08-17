public class Pyramid {
    public static void main(String[] args){
        int i,j;  //Declare variables
        int n=5;  //Number of rows=5
        for(i=0;i<n;i++){
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