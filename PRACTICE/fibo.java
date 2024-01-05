import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        int i,j,num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1,j=2;i<=num&&j<=num; i+=2,j+=3){
            System.out.println(i+" "+j);
        }
    }
}

