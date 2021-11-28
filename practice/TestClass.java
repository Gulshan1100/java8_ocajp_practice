/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        int n=0,h=0,d=0;
        double x;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        double angle[]=new double[n];
     //   for(int i=0;i<n;i++){
            d=s.nextInt();
            h=s.nextInt();
            x=h/d;
			System.out.println(x);
         //  x=Math.toRadians(x);
            angle[0]=Math.tan(x);
           angle[0]=angle[0]*(180/Math.PI);
   //     }
        for(int i=0;i<n;i++){
            System.out.println(angle[i]);
            
        }
        
    }
}
