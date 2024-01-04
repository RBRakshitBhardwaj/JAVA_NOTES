import java.util.Scanner;
public class SumOfEvenNumFor {
    public static void main(String[] args) {
        int num,Esum=0,Osum=0,i;
        Scanner  sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            if(i%2==0){
                Esum+=i;   
            }
            else{
                Osum+=i;
            }
        }
        System.out.println("Sum of even number is :"+Esum);
        System.out.println("sum of odd num is :"+Osum);
    }
}