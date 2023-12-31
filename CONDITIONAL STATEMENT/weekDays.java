import java.util.Scanner;
public class weekDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("choode your day from 1 to 7 :");
        int day=sc.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Working days");
            break;
            case 6:
            case 7:
            System.out.println("Week end");
            break;
            default:
            System.out.println("your choise is not correct ");
        }
        System.out.println("thank you");
    }
    
}
