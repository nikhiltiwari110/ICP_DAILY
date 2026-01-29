package WEEK_1.DAY_1;

import java.util.Arrays;
import java.util.Scanner;

public class Median_of_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num1 = new int[n];
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] num2 = new int[m];
        for (int i = 0; i < m; i++) {
            num2[i] = sc.nextInt();
        }
        //brute force : Sort the two arrays and merge the two arrays and calculate the median
        Arrays.sort(num1);
        Arrays.sort(num2);
        int [] ans = new int[n+m];
        for (int i = 0; i < n; i++) {
            ans[i] = num1[i];
        }
        for (int i = 0; i < m; i++) {
            ans[n+i] = num2[i];
        }
        Arrays.sort(ans);
        int size = n+m;
        if (size%2!=0){
            System.out.println(ans[size/2]);
        }else{
            int l = size/2-1;
            int r = size/2;
            double a = (ans[l]+ans[r]);
            System.out.println(a/2);
        }

    }
}
