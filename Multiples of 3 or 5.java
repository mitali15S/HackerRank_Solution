import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long target = n - 1;
            long num3 = target / 3;
            long num5 = target / 5;
            long num15 = target / 15;
            long sum3 = 3 * (num3 * (num3 + 1)) / 2;
            long sum5 = 5 * (num5 * (num5 + 1)) / 2;
            long sum15 = 15 * (num15 * (num15 + 1)) / 2;
            long finalSum = sum3 + sum5 - sum15;
            
            System.out.println(finalSum);
        }
    }
}
