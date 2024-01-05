package JAVA_NOTES.ImportentQuestion;
import java.util.Scanner;
public class FibonachiSeries {
    public static void main(String[] args) {
        int num,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the upper limit at which you want to find series :");
        num=sc.nextInt();
        for(i=1,j=2;i<=num&&j<=num;i+=2,j+=3){
            System.out.print(i+" "+j+" ");
        }
    }
    
}
