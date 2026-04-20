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
            int n = in.nextInt();
            long sum = 0;
            long diff = 0;
            for(long i =1; i<=n;i++){
                sum = sum + (long)Math.pow(i, 2);
            }
            for(long i =1; i<=n ; i++){
                diff = diff + i;
            }
            System.out.println(Math.abs((long)Math.pow(diff,2)-sum));
        }
    }
}
