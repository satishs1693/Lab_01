package exec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

class CommonFactors {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        int n = s.nextInt();
        int rem ,cout=0;
        int input[] = new int[n];
        List<Integer> lt = new ArrayList<Integer>();
        for(int i =0 ; i <n ; i++){
        	System.out.println("N value is "+n);
            input[i]=s.nextInt();
            System.out.println("N value is "+input[i]);
            for(int j =1 ; j <= input[i] ; j++  ) {
            	if (  input[i] % j ==0 ) {
            		if(set.contains(j)) {
            			lt.add(j);
            		}else set.add(j);
            			
            	}
            }
        }
    }
}
