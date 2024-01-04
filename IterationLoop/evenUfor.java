import java.util.Scanner;
public class evenUfor {
    public static void main(String[] args) {
        int i,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number at which you want to print the even value :");
        a=sc.nextInt();
        for(i=1;i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
    }
    
}
