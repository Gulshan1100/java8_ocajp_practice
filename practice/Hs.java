import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution {

    /*
     * Complete the handshake function below.
     */
    static int handshake(int n) {
        int n1=1,n2=1;
        for(int i=1;i<=n;i++){
        //    if(i<=(n-2){
        //        n2=(n2*i); 
        //    }
            n1=n1*i;
        }
        for(int i=1;i<=(n-2);i++){
            n2=n2*i;
        }
        
    return n1/(n2*2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = handshake(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
