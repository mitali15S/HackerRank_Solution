import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long max = 1;
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (checkPrime(i)) {
                        max = Math.max(max, i);
                    }
                    long other = n / i; 
                    if (checkPrime(other)) {
                        max = Math.max(max, other);
                    }
                }
            }
            System.out.println(max);
        }
    }

    static boolean checkPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
