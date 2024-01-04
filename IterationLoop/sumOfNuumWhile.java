import java.util.Scanner;
public class sumOfNuumWhile {
    public static void main(String[] args) {
        int num,i=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number by which you want to sum :");
        num=sc.nextInt();
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);


    }
    
}
