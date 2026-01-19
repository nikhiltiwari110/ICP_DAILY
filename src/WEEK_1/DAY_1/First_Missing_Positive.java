package WEEK_1.DAY_1;

import java.util.Scanner;

public class First_Missing_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //first make the all negative numbers, arr.length + 1
        for (int i = 0; i < n; i++) {
            if (arr[i]<= 0 || arr[i]> arr.length+1){
                arr[i] = arr.length + 1;
            }
        }

        //now make the array elements mark negative according to the index
        for (int i = 0; i < n; i++) {
            int v = Math.abs(arr[i]);
            if (v>0 && arr[v-1]>0 && v < arr.length+1){
                arr[v-1] = arr[v-1]*-1;
            }
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                flag = false;
                System.out.println(i+1);
            }
        }
        if (flag){
            System.out.println(arr.length+1);
        }
    }
}
