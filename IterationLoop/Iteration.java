public class Iteration {
    public static void main(String[] args) {
        
        System.out.println("Iteration");









        /*
         * 
         * categorise of loop:
         * 1> entery Control loop
         *     also called 
         *              pre test
         *                  it contain for loop , while Loop
         * 
         * 2> Exit control loop:
         *      do while loop  also called post test
         * 
         * we should use for loop when we want to perform a specific task for a definat number of times.
         * 
         * in while loop a block of statement gets executed repeatedly unless the given condition is false.
         * 
         * while loop is Unfixed/Indefinate or Unknown iterative loop
         * 
         * whaen we want to repeat a particular task at least once whether condition is false in that case we use do while loop
         * 
         * note: we can have more then one initialization . more then iteration but we can only have 
         * one test condition.
         * 
         * that test condition can be complex
         * 
         * in java loop is categorise in 4 ways:
         * 
         * while 
         * do-while
         * for(basic for loop)
         * Enhance for loop (for each loop)
         * 
         * 
         * while(1) in java cte will come.
         * 
         * Enhance for loop:
         * 
         * for(Data Type declaration:Array/Collection){
         *      //statement(s);
         * }
         * 
         * int []arr={10,20,30};
         * 
         * for(int var:arr){
         *      //statement(s);
         *  }
         * 
         * Enhance for loop:
         *  This loop was introduced from jdk 1.5
         * 
         * Syntex:
         * for(Datatype Declaration:Array){
         *      //statement;
         *  
         *      }
         * 
         * String name="raskhit";
         * for(String name : names){                        // doesnt compile.
         *  System.out.println(name + " ");          
         * }
         * 
         * because : we require for(DataType Declaration: Array/Collection)
         * 
         * but is a string 
         * 
         * name is not a array or collection
         * 
         * 
         * Stirng[] name =new Stirng[3];
         * for(int name : names)    {dose not compile
         *  System.out.println(name + " ");
         * }
         * 
         * here datatype of the variable is not compatible with array. name variable data type must be same 
         * as array in the above case name data type must be Stirng abc Array is String type.
         * 
         * 
         * program is a group of statement:
         * 
         * there are 2 type of jump statement:
         * 1> break    availabble in switch or loop
         * 2> continue
         * 
         * for:
         * 
         * for(int i=0;i<=10;i++){
         *      if(i==5);
         *      break;
         *      s=s+i;
         * }
         *
         * 
         * while:
         * 
         * int i=1;
         * while(i<=10){
         *      if(i==5)
         *      break;
         *      s+=i;
         *      i++;
         * }
         * 
         * do-while :
         * 
         * int i=1;
         * do{
         * if(i==5)
         * break;
         * s+=i;
         * i++;
         * } 
         * while(i<=10); 
         * 
         * 
         * 
         * System.exit(0)   -->  it is the method of system calss, to terminate the complete program.
         * 
         * 8-9-23 10:04\
         * 
         * a=b%10   --> it will xtract the last digit.
         * a=a/10   --> it will remove the last digit.
         * 
         * break statement is use for unusual termination of a block.
         * 
         * 
         * 
         * 
         * 
         */
    }
    
    
}
