public class first {
    public static void main(String[] args) {
        // java code will convert in byte code by compiler
        System.out.println("learn java slow slow");
        /* THIS IS THE DENOTATION OF MULTI LINE COMMENT3 */
        

        /* 
         * IN JAVA ALL PRE-DEFINE CLASSES START WITH CAPITAL LETTER (System )
         */

         /*
          *    (.)  IS THE MEMBER ACCESS OPERATOR
          */

        /*
         *   (out) is the static variable 
         */


         /*
          *   (println) is a method
          */


        /* 
         *   class IS A KEYWORD
         *   first IS IDENTIFIRE* 
         *   in java    keywords are always come in lower case.
         */
        
        
         /*
          * public is  Access Specifier or Access Modifier
          */
        
        /*
          * static is non-access specifier  
         */


         /*
         * main is a method
         * 
         *  main(String[] arg)  
         * 
         * {any function lies in side the class is called method}
         * 
         * function = feel of work {responsbility} , the work is independent * there isnofunction in java {represent task}
         * method = adhikar {rights} it is associated to some one * java contain only the method. {represent behavious}
         * 
         *  a method can be a function but a function cannot be a method {each behavious can be a task but each task can't be a behaviour}
         *
         *   WITHOUT main THE PROGRAM WILL COMPILE BUT WILL NOT RUN 
         */



         /*
         *      void IS A RETURN TYPE
         * 
         *  WHEN {A PROGRAM AND A PROCESS} CHILD PROCESS WORK UNDER THE PARENT , THAT CHILD PROCESS HAS TO TELL THEIR EXIT STATUS
         * 
         * C AND C++ HAS DOSN'T HAVE THEIR RUNTIME ENVIRONMENT THEY USE THE ENVIRONMENT OF OS , SO AT THE TIME OF EXIT THE HAVE TO TELL THEIR EXIT STATUS.
         * 
         *  JAVA PROGRA ALWAYS WORK UNDER THE CONTROL OF JVM & JRE SO THEY DONT HAVE TO TELL THE EXIT STATUS 
         
          */


         /*
         * String is pre-define class
         * 
         */
        
        
        
         /*
         * static 
         * 
         * 2 types of member

         * 1. class Member / Static Member
         * 2. Instatic Member / Object Member / Non Static Member
         *
         *  
         */




        /*
         * class member (static mamber)
         * 
         * calss member are those member those are preced by the static keyword
         * 
         * class member represent the behaviour of calss
         * 
         * static keyword is used to define class member
         * 
         * class Student{
         *      static cname = "abcd";  {{class variable}
         * }
         * 
         * 
         * {CALSS MEMBER ARE MAID AVAILABLE TO OBJECTS BUT BUT INSTANCE MEMBER ARE NEVER MADE AVAILABLE TO THE CLASS}
         * 
         * 
         * INDIA CAN TRADE WITH OTHER COUNTRIES
         * 
         * here india is object and it CAN TRADE is its behaviour
         * 
         * India as a class has certain attributes such as Constitution, Government, Capital, Currency etc. 
         * It also has certain behaviours such as it trades with other countries, fight wars, makes friends etc.
         * These attributes & behaviour are examples of Class members.
         * 
         */

        /*
         * instence member (object member)
         * 
         *   instance member are those member those are not preced by the static keyword
         * 
         *  instence member represent attribute and behaviour of individual object
         * 
         * by default a member of class is instence member
         * 
         * class Student{
         *       String name;   {These are the instance variable} 
         *       int age;
         * }
         * 
         * Each Indian as an object of class India. 
         * Indian has some attributes such as name, age, qualification, address etc.
         * value of these attributes may be different for different Indians. All of these are example of Instance members.
         * 
         * 
         * IF PETROL PRICE IS INCREASE IT WILL HAVE IMPECT ON PEOPLE .
         * BUT IF YOUR MONEY FALL IT HAS NO IMPECT ON INDIA
         * 
         * 
         * 
         */ 
        
        
         /*
         * public static void main(Stirng[]arg){}
         * 
         * main is a method
         * 
         * void is a return type
         * 
         * static is a keyword {it bind the main method from the class}
         * so main is class method  
         * 
         * main() method denotes the execution of a class. not the execution of any of its object i.e. 
         * main method is a class member. Hence it is qualified by static keyword.
         * 
         * public is access modifier 
         *  
         *  
         * 
         */


        /*
         * args[]
         * is command line argument
         *  
         * values are given in the command to code
         * 
         * ex
         * in simple manner we do 
         * javac simle.java
         * java simple
         * 
         * 2)	java Adder 10 20  [Command Line Argument] 
         * Result is: 30
         * 
         * but in case of command line argument
         * 
         * java stu dd 43 ---->  the value (dd 43) go into arr[0]  --> this is an array  
         * 
         * at initial stage we put the sign of array and we put 0 or more values
         * 
         */

        /*
         *  package -->  class  -->  variable or method
         * 
         * println() is a method 
         * 
         * 
         * System is pre-define class
         * 
         * println() method doesnt belong to the System class . 
         * 
         * [{it belong to the PRINT-STREAM class}]
         *  
         * 
         */
        
        
         /*
         * library class -> pre-define class
         *  System is a library calss 
         *  
         * in which a variavle out is static a class member 
         * 
         * level
         * 
         * class System  --> out type --> PrintStream
         * 
         * 
         * out is an object of printStream class . 
         */
        
        
        
         /*
         * public static void main(Stirng[]arg){}
         * 
         * access specifier , non AS , retrun type , method , string type array --> commend line argument 
         * 
         * 
         * 
         * we can have different calss name and file name 
         * 
         * for run ex
         * 
         * javac HArd.java   --> compile
         * java Simple    -->  run
         * 
         */
        
        
        
         /*
         * one program can have multiple class.
         * but only one calss is public. 
         * 
         * if our class is public in that case file and class name must be same, other wise it would give error.
         * 
         * 
         */


         /*
          * public keyword is an access specifier which represents visibility, it means it is visible to all.

        No two classes are public in the same program file.

        A class must be public which name is same as the file name

        static is a keyword, if we declare any method as static, it is known as static method/class method. 
        
        The core advantage of static method is that there is no need to create object to invoke the static method.

        main method is executed by the JVM/JRE, so it doesn't require to create object to invoke the main method. So it saves memory.

        main represents start-up of the program.

        To compile java program, main() is not compulsory but to execute, main() must be presented.

        Naming conditions/Rules of method are same as the class as explained above.


          */


          /*
           * 1) Name of the method starts with lowercase alphabet/Letter

            2) If name contains multiple words, then first word starts with lowercase and next words starts 
            with uppercase alphabet

            Ex:- 
                getData(), setData(), getEmpInformation()

           */
          /*
           * System is a class from java.lang package
           * 
           * It provides three objects   

            1)	in  ->  System.in  : to read data from input buffer
            2)	out -> System.out : to write data to output buffer
            3)	err -> System.err  : to Write JVM implicit error message to output buffer

           * 
           * the number of calss = number of class file
           */
          /*
           * default java package lang
           * 
           * WHAT IS PACKAGE
           * Package is a collection of calsses and interfaces.
           * 
           * WHAT IS JAVA LIBRARY
           * COLLACTION of package
           * 
           * 
           * 
           */


         


        
    }
}
