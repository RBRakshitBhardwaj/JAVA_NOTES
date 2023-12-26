
public class MoreOfCasting {
    public static void main(String[] args) {
        byte b,c,d;
        b=3;
        c=8;
    
        d=(byte)(b+c);
        long max=136654323456l;

        System.out.println(max);

        //here if we not write like this 
        //and write like b+c
        
        long x=10;
        int y=5;
        //y=y*x; ///cte because answer will always come in bigger datatype.
        
        x=y*x;
        //or 
        y=(int)(y*x);

        //both will correct
        long h=10;
        int j=20;
       // y=y*x; getting angry
        j=(int)(h*j); 
        j*=(int)(h);
        System.out.println(j);
        
        //boolean var1=(boolean)10;
        //int var2 =(int)true;
        // both will give compile time error
         
        var apple=10;
        apple=(byte)5; //ok
        apple = 1_000_000; // do not compile

        short applee=(short)10;
        System.out.println(apple);
        System.out.println(applee);

        
        /*
         * 
         * c will automatically will be in int 
         * and b is in byte
         * 
         * 
         * 
         * java complains number is out of range
         * long max = 3123456780 ; // doesnt compile
         * because this value by default in int , to make it long place l at the back of it.
         * to make it long.
         * 
         * java compiles the number is out of range
         * 
         * 
         * boolean datatype is not involve in inplicit or explicit conversion
         * 
         * 
         * 
         * var is a term = is called local type inference come in java 10
         * 
         * 
         * 19 8 23  29:00
         * 
         * 
         * 
         */
    
    
    
    
    }    




}
