public class Demo {
    public static void main(String[] args) {
         System.out.println("result is :"+10+20);



        /*
         * 
         * 
         *  java use uni-code it is not mean that it is not using ascii 
         * ASCII ranges form 0 - 255
         * 
         * but 
         * Unicode : 0 - 65535
         * 
         * A-Z -> 65 - 90
         * 
         * a-z -> 48 - 57
         * 
         * 0-9 -> 48 - 57
         * space bar --> 32
         *  
         * ascii keyboard set reserved from 0 - 499 chars.
         * 
         * 
         * >>>>>>>>>>> Memory Management By JVM <<<<<<<<<<<<<<<<<<<<<
         * 
         * JVM will split the memortry  into different parts as below :
         * 
         *      High Order Memory
         *        Shared Memory
         *         Heap Memory
         *        Static Memory
         *        Global Memory 
         * 
         * --> a normal student know :
         *  our program always get executed in the stack memory.
         * 
         * 
         * >>>>>>>>>>>>>>High Order Memory <<<<<<<<<<<<
         * 
         * To store all the command line parameter
         * 
         * When we start giving the value to main  [psv main (Stirng args[])]   to store all command line Argument or parameters 
         *  os environment -> path class path.
         * 
         * >>>>>>>>>>>>>>>>>>>>>> Stack Memory <<<<<<<<<<<<<<<<
         * 
         * All methods always get executed in the stack memory.
         * 
         * To Store all local variable / method variable.
         * Memory allocation is LIFO (Last In First Out) based.
         * This memory space grows automatically as long as sharable memory available for it.
         * 
         * 
         * 18:14 16-8-23
         * 
         * OLL OBJECT ARE CREATED IN HEAP MEMEORY
         * 
         * THIS ID FOR DYNAMMIC MEMORY MANAGEMENT
         * 
         * VARIABLE IS STORE IN LOCAL SCOPE
         * 
         * 
         * 10 + 20 ADDITION
         * 
         * A + B CONCATATION
         * 
         * 
         * 
         * 
         * 
         */
    }
    
}
