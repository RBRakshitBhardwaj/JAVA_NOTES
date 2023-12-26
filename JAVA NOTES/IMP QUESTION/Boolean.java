public class Boolean {
    public static void main(String[] args) {
        //var ap=(short) 10;
        //ap=(byte)5;
        var app=(byte)1_000_000;  //not possible
        //int var2=true; not possible
        System.out.println(app); 
        double d=10.5;
        float f=(float)(d);
        System.out.println(f);


        /*
         * 
         * one million is doesnt compile becuase it is well beyond the limit of short.
         * 
         * byte short int long float double
         * char int long float double
         * 
         * 
         * 
         * 
         */
    }
    
}
