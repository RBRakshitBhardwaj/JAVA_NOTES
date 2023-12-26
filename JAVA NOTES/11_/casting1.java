public class casting1 {
    public static void main(String[] args) {
        int a=(int)10.4;// explecit conversion
        char b=20; // implecit conversion 
        float var = (float)3.7; //beacuse . is a part of double  outdated
        float var1 = 3.77f;  //modern

        long var2=10l; 
        float var3=var2;
        byte var4=23; // byte b=(byte)10;

        char ch=56; // char ch=(char)65

        System.out.println(ch);
        System.out.println(var4); //no error because inplicit conversion occer





        System.out.println(var3);


        System.out.println(a);
        System.out.println(b);
        System.out.println(var);
        System.out.println(var1);
        /*
         * 
         * when we assign the long type value to the flaot variable, in that case data goes in to the Exponential and mantissa form.
         * 
         * floaat var1=34.3;
         * 
         * 
         */
    }
    
}
