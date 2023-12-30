import java.util.Scanner;
public class passCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passCount=0 ,a,b,c;
        System.out.println("enter marks");
        a=sc.nextInt();
        System.out.println("enter marks");
        b=sc.nextInt();
        System.out.println("enter marks");
        c=sc.nextInt();
        
        if(a>50){
            passCount++;
        }
        if(b>60){
            passCount++;
        }
        if(c>70){
            passCount++;
        }
        System.out.println("numer of paper you have pass : " + passCount);

    }
    
}
