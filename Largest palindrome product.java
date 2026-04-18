import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int max = 0;

            for (int i = 100; i <= 999; i++) {
                for (int j = i; j <= 999; j++) {
                    int product = i * j;

                    if (product < n && product > max) {
                        
                        int temp = product;
                        int sum = 0;
                        while (temp > 0) {
                            int rem = temp % 10;
                            sum = (sum * 10) + rem;
                            temp /= 10;
                        }

                        if (product == sum) {
                            max = product;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
