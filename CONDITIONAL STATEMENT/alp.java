import java.util.Scanner;
public class alp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a character :");
        String ch=sc.next();
        switch(ch){
            case "one":
                System.out.println("one");
                break;
            case "two":
            System.out.println("two");
            break;    
            case "three":
            System.out.println("three");
            break;
            default:
            System.out.println("enter correct value");
            break;
        }
        System.out.println("After switch case");

    }
    
}
