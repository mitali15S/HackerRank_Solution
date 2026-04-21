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
            int ans = -1;
            for(int i =1;i<n/3;i++){
                int num = (n*n)-(2*n*i);
                int den = 2*(n-i);
                if(num%den==0){
                    int b = num/den;
                    int c = n - i- b;
                    if(b>i)
                    ans = i*b*c;
                }
                
            }
            System.out.println(ans);
            
        }
    }
  
}
