import java.util.Scanner;
public class TernoryOperator {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        System.out.println("enter your age : ");
        int age=sc.nextInt();

        String s=age>18?"elegible for vote":"not elegible for vote";
        System.out.println(s);

    }
    
}
