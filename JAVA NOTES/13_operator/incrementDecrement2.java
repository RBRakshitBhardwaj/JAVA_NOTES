public class incrementDecrement2 {
   
        public static void main(String[] args) {
            int a =10;
            System.out.println(a);     //10
            System.out.println(++a);   //11
            System.out.println(a++);   //11   --->  12
            System.out.println(--a);   //11
            System.out.println(a--);   //11   --->  10
            System.out.println(a);     //10
        }
        
             //   6+5-5-6
             //  (a--+--a)+(a++-++a)*(--a+--a)-(++a+--a);
             //a=6  (6+4)+(4-6)*(5+4)-(5+4)   
    
    
}
