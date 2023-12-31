import java.util.Scanner ;
public class Swithc {
    public static void main(String[] args) {
        int num;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a number .....");
        num=sc.nextInt();
        switch(num){
            case 1:
            System.out.println("Hey am one");
            break;
            case 2:
            System.out.println("Hey am two");
            break;
            case 3:
            System.out.println("Hey am three");
            break;
            case 4:
            System.out.println("Hey am four");
            break;
            default:
            System.out.println("Hey am default");
        }
        System.out.println("below switch case"); 
    }
    
}
