import java.util.Scanner;
public class workLogicalOr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first marks :" );
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        System.out.println("Enter third number :");
        int c=sc.nextInt();
        if( a>=50 ||b>=50 || c>=50  ){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }
    }
}