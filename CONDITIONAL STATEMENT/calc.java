import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press + for addition");
        System.out.println("press - for subtraction");
        System.out.println("press * for multiplication");
        System.out.println("press / for DEVison");

        System.out.print("enter first number :");
        int b=sc.nextInt();
        System.out.print("enter second NUmber :");
        int c=sc.nextInt();
        System.out.print("Enter your chose");
        var a=sc.next();

        switch (a){
            case "+":
            System.out.println("addition :"+ (b+c));
            break;
            case "-":
            System.out.println("subtraction :"+ (b-c));
            break;
            case "/":
            System.out.println("division : " + (b/c));
            break;
            case "*":
            System.out.println("multiplication : "+(b*c));
            break;
            default:
            System.out.println("please enter correct choise !!");
        }
    }
    
}
