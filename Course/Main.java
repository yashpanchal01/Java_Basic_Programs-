package Course;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("I like pizza!");
    }
    
    
}


// println() -> ln is for new line or you can use "I like pizza \n"
// sout and it 'Tab' to quickly auto generate 'System.out.print();'
// close Strings with "" and chars with ''

// scanner.nextLine() vs scanner.next() --> Wont consider anything after space 

// common issue when using scanner --> 
// you need to clear the buffer : int age = scanner.nextInt(); 
// string color = scanner.nextline(); 
// --> when you enter age and hit enter (\n) color is actully picking up that next line charecter(\n) as input,
// so thats why you need to clear the buffer.


// you only need to type the datatype while declaring a variable only ones, Not again.
// ex. double weidth = 0; 
// weidth = scanner.nextInt();
// weidth = 45.66   etc..

// scanner.nextDouble(); 
// scanner.nextBoolean(); 

// Dont forget to close the scanner object at the end scanner.close();

// Augmented operators 
// x = x + y  ==>  x += y 

// 10 / 3 = 3 cause we are using integer datatype, so use double instead to output 10/3 = 3.3333
// meaning use double x & double y instead of int x & int y 

// Increment operators 
// instead of x = x + 1; use x++ 

// PEMDAS is the oreder of the operations in java 