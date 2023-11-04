public class MoreD_Type {
    public static void main(String[] args) {

        // prove  JAVA IS NOT CASE SENSETIVE 
        System.out.println("it all about implementation");
		char ch='\u004E';
		char che='\u004e';
		
		
		System.out.println(ch);
		System.out.println(che);


/*
 * 
 * char take 2 byte in java 
 * 
 * \u0000 this is lower value in char
 * \uFFFF is the highest va;uje of unicode
 * 
 *  java take 2 byte for char because  of unicode  2 BYTE = 16 BITS.
 * 
 * and c take 1 byte for char because of byte code   I BYTE = 8 BITS
 * 
 * unicode   UNIVERSAL CODE
 * -->  65536
 * 
 * AASCI  AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE
 * --> 256
 * 
 * 
 * 
 * SOME TIME JAVA IS NOT CASE SENSETIVE
 * '\u004E' and '\u004e' both are same
 * 
 * 
 * 
 * java 8 11 17    famous
 * 
 * 
 * THERE ARE CALSS FOR EVERY DATATYPE
 * byte    -->   Byte 
 * short   -->   Short
 * long     -->   Long
 * int     --> Integer   
 * char    -->  Character
 * 
 * if is a class the first letter is capital
 * 
 * // System.out.println("Byte min value is "+ Byte.MIN_VALUE);
		// System.out.println("Byte max value is "+ Byte.MAX_VALUE);
		
		// System.out.println("Integer Min value is "+ Integer.MIN_VALUE);
		// System.out.println("Integer max value is "+ Integer.MAX_VALUE);

        // //we use casting here to convert char to integer for proper answer.
        // System.out.println("Char min value is "+ (int)Character.MIN_VALUE);
        // System.out.println("Char max value "+ (int)Character.MAX_VALUE);
 * 
 * 
 * Threre are 2 types of variables:
 * 1. primitive   / value type
 * 2. non-primitive   / reference type
 * 
 * 
 * Threr are 3 types of variables in java on bases of Location:
 * 1. Local Var
 * 2. Instance Var
 * 3. Static Var
 * 
 * 
 * 1)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Local Variable:  Stack variaable / Automatic  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * var. lie inside the method
 * 
 * void myMethod(){
 * 
 * int var=10;    // Local variable / Stack variaable / Automatic
 *  
 * }
 * 
 * 
 * 2)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Instance variable: / Object Variable <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 *  out side the method  but within the class.
 * 
 * class Demo{
 * 
 *  int var1;  // instance Variable / object variable
 *  void myMethod()  // instance method
 * {
 *  int var2; // Local Variable
 * }
 * 
 * }
 * 
 * 
 * 3) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Static Variable or calss variable : <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * 
 * 
 * class Test{
 * 
 *  int var1; //  instance variable
 *  ststic int var2; // class Variable
 *  void myMethod(){
 *      int var3; //Local Variable
 * 
 *  }
 * 
 * }
 * 
 * 
 * PARO I AM COMING IS NOT A VALID VARIABLE.
 * 
 * 
 * CLARACTER  value is always encoded in Single Quotes whereas
 * 
 * Stirng value is Double Quotes. 
 * 
 * 
 * Type of variable 
 * 
 * on the bases of type data type is categorised in 2 category
 * 1. value type
 * 2. Reference type
 * 
 * on the bases of location categorised in  3 category:
 * 
 * 1> Local
 * 2> instance
 * 3> Class var     
 * 
 * 
 * 
 * 
 *  $ and _  are allow in the variable name but  there is a point 
 * 
 * only _ is not allow
 * 
 * int _age; is OK
 * but 
 * int _; is not OK
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
 * 
 * 
 * 
 *
 */















    }
    
}
