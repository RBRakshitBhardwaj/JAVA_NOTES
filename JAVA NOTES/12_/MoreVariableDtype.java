
public class MoreVariableDtype {
    public static void main(String[] args) {
        
        long x=10;
        int y=20;
       // y=y*x; getting angry
        y=(int)(y*x); 
        y*=(int)(x);
        System.out.println(y);








        /*
         * 
         * 
         *  Short hand operator / compound operator
         * 
         * y*=x; == y=y*x;
         * 
         * 
         * 
         * 
         * 
         * explicit type casting is recommended is only for constants , not for variable
         * 
         * 
         * 
         * Result of mathmetical expression , with different data type
         * 1> byte + byte = int
         * 2> short + short = int
         * 3> int + int = int (compile) but at runtime there is change of data overflow.
         *  recomented one int + int = long
         * 4> long + long = long
         * 5> char + char = int 
         * 6> float + float = double; 
         * 7> double + double = double 
         * 8> int + long = long
         * 9> float + double = double
         * 10> int + float = float
         *  
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
    }

}
