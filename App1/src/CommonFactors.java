import java.util.Scanner;

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

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem ,cout=0;
        int input[] = new int[n];
        int Fisrtnofacts[] = new int[10];
        for(int i =0 ; i <n ; i++){
            input[i]=s.nextInt();
             for( int j=2 ; i < input[i] ; j++ ){
                    if (input[i] % i == 0) {    
                        
                    	System.out.println(i);
                        
            }
        }
        /* Finding Factors For Number */
        }
    }
}
