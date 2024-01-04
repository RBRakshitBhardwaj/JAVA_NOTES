import java.util.Scanner;
public class sumOfNum {
    public static void main(String[] args) {
        System.out.println("enter the num at which you want to find sum :");
        int num,sum=0,i;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            sum=sum+i;
            
        }
        System.out.println(sum);

    }
    
}
