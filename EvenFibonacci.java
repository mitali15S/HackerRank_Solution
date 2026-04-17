import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a =1;
            long b=2;
            long c = 0;
            long sum = 2;
            while(c<=n){
                
                 if(c%2 == 0){
                    sum = sum +c;
                 }
                  c = a +b;
                 a = b;
                 b = c;
            } 
            System.out.println(sum);
        }
    }
}
