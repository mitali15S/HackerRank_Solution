import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int a0 = 0; a0 < t; a0++) {
            int n = sc.nextInt();
            long lcm = 1;
            for (int i = 2; i <= n; i++) {
                lcm = (lcm * i) / hcf(lcm, i); 
            }
            System.out.println(lcm);
        }
    }

    static long hcf(long a, long b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }
}

