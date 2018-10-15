import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }

    private static Long factorial(int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}

//Solution 2 new 
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class Solution {

//     // Complete the factorial function below.
//     static Long factorial(int n) {
//         if (n < 0) {
//             return null;
//         }
//         long result = 1;
//         while (n > 0) {
//             result *= n--;
//         }
//         return result;

//     }

//     private static final Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) throws IOException {
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         int n = scanner.nextInt();
//         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//         long result = factorial(n);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedWriter.close();

//         scanner.close();
//     }
// }


// import java.util.*;

// public class Solution 
// {

//     public static void main(String[] args) 
//     {
//       System.out.println(factorial(new Scanner(System.in).nextInt()));
//     }

//     public static long factorial( int n )
//     {
//       return (n == 1) ? 1 : n*factorial(n-1);
//     }
// }

// //change the == to <=