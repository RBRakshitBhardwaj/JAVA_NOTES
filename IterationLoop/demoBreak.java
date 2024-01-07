public class demoBreak {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("break statement is found");
                //break;
                System.exit(9);
            }
            System.out.println("the value of i is :"+i);
        }
        System.out.println("out of loop");
    }
    
}
