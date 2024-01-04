import java.util.Scanner;
public class PrintUpToN {
    public static void main(String[] args) {
        int i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number upto u want to print :");
        n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    
}
