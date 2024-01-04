import java.util.Scanner;
public class SumOfEvenOddWhile {
    public static void main(String[] args) {
        int i=1,eSum=0,oSum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number at which u want to find sum :");
        num=sc.nextInt();
        while(i<=num){
            if(i%2==0){
                eSum+=i;
            }
            else{
                oSum+=i;
            }
            i++;
        }
        System.out.println("sum of even num :"+eSum);
        System.out.println("sum of odd num :"+oSum);
    }
    
    
}
