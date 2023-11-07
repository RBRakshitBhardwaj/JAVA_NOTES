public class Demo {
    public static void main(String[] args) {
        String name="rakshit";
        int age = 22;
        char gen='M';
        double height=5.6;
        double weight=80;

        // + is concatination operator

        System.out.println("Name is "+ name);
        System.out.println("Age is "+age);
        System.out.println("Gender is "+gen);
        System.out.println("Height is "+ height);
        System.out.println("Weight is "+ weight);
        // or we can print all value with help of single println() method

        System.out.println("Name is "+name +"Gender is "+ gen +"Age is "+age + "height is "+ age + "Weight is "+ weight);



        // for multi line comment :     CTRL + SHIFT + /



        /*
         * 
         * 14-8-23
         * 
         * character always locate in single quotes.
         * 
         * ex
         * 
         * char gender = 'M';
         * 
         * +++++++++++++++++++++++++++++++++++++++
         * where as sting value is always inclose in  "Double quotes"
         * 
         * String name = "Rakshit";
         * +++++++++++++++++++++++++++++++++++++++++++
         * 
         * variable name dosen't start with digit
         * 
         * why
         * in Lexical Analysis Phase :
         *  in this phase backtracking is not supported.-
         * 
         * 6ab = 8; is not valid
         * 
         * ab6 = 8; is valid
         * 
         * Imagine if you could name a variable like this: "5apples." It would be confusing for the computer because it might 
         * think you're trying to do math with the number 5. But if you name it "apples5," it's clear that you're talking about apples,
         *  and you can put the number 5 inside the "apples" container.
         *
         * So, in easy words, variables can't start with numbers to avoid confusion and help the computer know whether you're talking
         * about numbers or something else.
         * 
         * 
         *     
         * int var =10;
         * 
         * is a Literals
         * 
         * a constant value which can ba assign to a variable is called literals. 
         * 
         * the literals which are used to represent or replace number are known as literals
         * ex  int X+1=5 so X is a literals.
         * 
         * java is having laxical analysis which restrict the ue from naming the variable start from number
         * 
         * int 5rb is illegial variable name
         * 
         * different focks different stocks
         * 
         * 
         * some rules :
         * int million1=10000000; //ok
         * 
         * we can add _ under score any where except at the begning
         * int million2=1_000_000; // is also ok
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
