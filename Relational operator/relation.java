
public class relation {
    public static void main(String[] args) {
        

        /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> REALTIONAL OPERATOR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * Associvity of relational operator is left to right
         * 
         * proirity or relarion al operator : 
         * 
         * <,>,<=,>=  (First Priority)
         * 
         * !=,== (second priority)
         * 
         * do step by step
         * 
         * 5>4>3 cte  because 
         * 
         * true>3 is cannot be compair
         * 
         *  = assignmant operator
         *  ==  Equal to (comparision opertor)
         * 
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOGICAL OPERATOR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * it is use when decidion taken on multiplae condition
         * 
         * Logical operator:
         *  1> ! Logiacal Not
         *  2> && Logical And   it return true if both condition are true
         *  3> || Logical RO     it return true if one or both condition are true
         * 
         * zero tolerance = when all are true
         * 
         * in case of multipme Locical operator Priority come in the picture:
         * 
         * 1> Logi Not
         * 2> Logi And
         * 3> Logi Or
         * 
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ternary Operator <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * String result = (TestStatement) ? Value1 : Value2;
         * 
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>> java operator Precidence <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * E:\Precidence of operator.png
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Assocativity of Operator <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * it come under mind when precidence is similar
         * 
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Bitwise Logical Operator <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * it can work on both numerical ans well as boolean
         * 
         * when it work with boolean it is Logical ther wise it is Bitwise operator.
         * 
         * Exclusive or will always five false it there is similar value (^) XOR
         * 
         * 
         * binary of 4
         * 
         *   16  8   4   2   1
         *    0  0   1   0   0    = 4
         * 
         * // | means +
         *  // & means -
         * 
         * 
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Shift operator <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
         * 
         * 256  128  64  32  16  8  4  2  1
         *  0    0   0    0   0  1  0  1  0   = 10
         *  0    0   0    1   0  1  0  0  0 left shift by 2 = 40
         * 
         * 256  128  64  32  16  8  4  2  1
         *  0    0   0    0   0  1  0  1  0   = 10
         *  0    0   0    0   0  0  0  1  0 right shift by 2 = 2
         * 
         * Trick --> 
         * ex
         *      13>>2  =  13/2^3 = 1
         *      13<<2  =  13*2^3 = 104
         * 
         * in case of left shift operator we do the multiplicatopn 
         * where as in case of right shift case operator we do the devidion
         * 
         * int a =10;
         * int b=10;
         * 
         * 
         *  if(a++ == 10 | b++ == 10){          //  all task will perform
         *          System.out.pritnln(a+" "+b);    // 11    11
         *  }
         * 
         * int c=10;
         * int d=10;
         * if(c++ == 10||d++ == 10){  // here short sircuit will perform                                    
         *      System.out.println(c+" "+d);   //     11   10
         *  }
         *  
         * 
         * NOte    Logical operator always take short-cut short circuit    && || !
         * 
         * 
         * if(duck!=null & duck.getAge()<5)
         * 
         * it will rais exception because & will operate both condition
         * 
         * but 
         * if(duck!=null&& duck.getAge()<5) if this would done then the null expection will not occer
         * 
         * because this is short circuit it will stop at first condition only.
         * 
         *  importance of shortcircuit
         * 
         * int rb=6;
         * 
         * boolean bu=(rb>=6)||(++rb <=7);
         * 
         * here only first condition will run 
         * but we want 
         * both should be run this is called as side effect .
         * so here we use |
         * 
         * 
         * ternaory operator = oneLiner ifElse Statement.
         * 
         * we can use modulus operator with Decimal value
         * 
         * null == null   give true
         * 
         * 
         * Explicit type casting / narrowing
         * Processing of converting data from higher data type to ;ower data type.
         * 
         * byte ranges from -128 to 127
         * 
         * for calculating neg value of byte ===  ((n-127)-1)-128
         * 
         * ex     ((140-127)-1)-128  =  -116
         * 
         *    29 - 8 - 23   27:18
         * 
         * if we compair null from null doesnt compile
         * 
         * it give true if null == null 
         * 
         * 
         * 
         * 
         */
















    }    
}
