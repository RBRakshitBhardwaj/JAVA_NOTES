import java.util.Scanner;
public class NUseFor {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n at which u want to prirnt :");
        int a=sc.nextInt();
        for(i=1;i<=a;i++){
            System.out.println(i);
        }
    }
}
