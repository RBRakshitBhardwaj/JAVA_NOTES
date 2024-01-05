public class breakDemo {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("break statement is forund");
                break;
                //System.exit(0);
            }
            System.out.println("the value is :"+i);
        }System.out.println("out of the Loop");
    }
    
}
