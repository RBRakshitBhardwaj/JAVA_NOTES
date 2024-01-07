public class ExtractOrRemoveLastDigit {
    public static void main(String[] args) {
        int a=29989;  
        int b= a/10;  // remove the last digit
        System.out.println(b);

        b=a%10;  // it extrect the last digit --> means take the last digit and save it.               
        System.out.println(b);

        b=a/100;  // it remove the last 2 digit
        System.out.println(b);

        b=a%100;        // it will extract the last 2 digit.
        System.out.println(b);
    }
    
}
