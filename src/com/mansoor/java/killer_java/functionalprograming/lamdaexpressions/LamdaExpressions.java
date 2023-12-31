package com.mansoor.java.killer_java.functionalprograming.lamdaexpressions;

 interface Cars{
    public void drive();
}

public class LamdaExpressions {
    public static void main(String[] args) {
       Audi a=new Audi();
       a.drive();
        Cars cs=new Cars() {
            @Override
            public void drive() {
                System.out.println("Drive is Called by Anonymous class");
            }
        };
        cs.drive();

        // Lambda expression with anonymous function
        // 3 components : arguments, arrow token, function body
        // class obj = (arguments) ->{ (function body);};

        Cars cs1 = () -> {
            System.out.println("Drive is called by lamda expressions");
        };
        cs1.drive();


    }
}

 class Audi implements Cars{

     @Override
     public void drive() {
         System.out.println("Drive is called by Audi");
     }
 }

