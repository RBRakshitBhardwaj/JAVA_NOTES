import java.util.Scanner;
public class evenUwhile {
    public static void main(String[] args) {
        int a,i=1;                                             // initialization
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number at which you want to enter :");
        a=sc.nextInt();
        while(i<=a){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
