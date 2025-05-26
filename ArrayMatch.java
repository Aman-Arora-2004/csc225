import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayMatch{
    public static void main(String[] args) {
        
        //main function
        //reads the file and assigns arrays A and B
        //determines if A and B match
        //if there is no file in the input, it catches the error and displays "Error reading the input file"
        
        try {
            Scanner scanner = new Scanner(new File(args[0]));
        
            int next = scanner.nextInt();
            int[] A = new int[next];
            int[] B = new int[next];

            for (int i = 0; i < next ; i++) {
                A[i] = scanner.nextInt();  
            }
            for (int i = 0; i < next ; i++) {
                B[i] = scanner.nextInt();
            }
            scanner.close();

            if (match(A, B)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the input file");
        } 
    }

    public static boolean match(int[] A, int[] B) {
        
        //determines if arrays A and B are matches.
        //returns true if A and B are equal or if they can be split into halves that form equal subarrays

        if (A.length != B.length) {
            return false;
        }
       
        if (arraysEqual(A, B)) {
            return true;
        }
        
        int n = A.length;
        
        if (n % 2 == 0) {
            int middle = n / 2;
            int[] subA1 = new int[middle];
            int[] subA2 = new int[middle];
            int[] subB1 = new int[middle];
            int[] subB2 = new int[middle];

            for (int i = 0; i < middle; i++) {
                subA1[i] = A[i];
                subA2[i] = A[i + middle];
                subB1[i] = B[i];
                subB2[i] = B[i + middle]; 
            }

            return(match(subA1, subB1) && match(subA2, subB2)) || (match(subA1, subB1) && match(subA1, subB2)) || (match(subA2, subB1) && match(subA2, subB2));
        }
        return false;
    }

    private static boolean arraysEqual(int[] A, int[] B) {
        
        // takes two arrays of the same length and determines if they are equal
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
// analysis of time complexity
//
// in the main function, reading the file and assigning the arrays A, B
// take up the time complexity O(n). This means that the time complexity of the
// match function determines the time complexity of the main function
//
// the match function uses recursion to split the arrays into half if the 
// length is even. At each recursive call, the function splits the array into 
// half. The time complexity for this is O(log n). Furthermore, at each call, the
// function calls arraysEqual, whose time complexity is O(n) as it goes through each 
// element of arrays A and B in its worst case scenario. The match function has 
// O(log n) time complexity for splitting the arrays, and O(n) time complexity to 
// check if the arrays are equal. This means that the time complexity of the match 
// function is O(n*log n)
// 
// the arraysEqual function has a time complexity of O(n) as it iterates through
// both A and B once to check if they are equal
//
// The match function takes the most time, therefore the time complexity for
// the worst case runtime is O(n*log n)

