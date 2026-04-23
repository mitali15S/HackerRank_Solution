import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for(int i =1; i<=n;i++){
            String str = sc.next();
            sum = sum.add(new BigInteger(str));
        }
        String ans = sum.toString();
        System.out.println(ans.substring(0, 10));
    }
}
