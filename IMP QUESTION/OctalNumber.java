import java.util.Scanner;
public class OctalNumber {
    public static void main(String[] args) {
        int num,d; // variable declaration
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        num=sc.nextInt();
        while(num>0){
            d=num%10;   //Extract last digit nikal lega
            System.out.println("nikli value = "+d);
            if(d>7){
                System.out.println("Not an octal");
                System.exit(0);
            }
            System.out.println("before :"+num);
            num=num/10; // remove last digit nikal dega
            System.out.println("after :"+num);
        }
        System.out.println("it is am octal number.");
    }
    
}
