package WEEK_1.DAY_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //brute force : find all three triplets using nested loops
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        triplets(arr,ans,ll);
        System.out.println(ans);
    }
    public static void triplets(int [] arr, List<List<Integer>> ans , List<Integer> ll){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0) {
                    if (!contains(arr[i],arr[j],arr[k],ans)){
                        ll.add(arr[i]);
                        ll.add(arr[j]);
                        ll.add(arr[k]);
                        ans.add(new ArrayList<>(ll));
                        for (int l = 0; l < 3; l++) {
                            ll.remove(ll.size() - 1);
                        }

                        }
                    }
                }
            }
        }
    }
    public static boolean contains(int x,int y,int z, List<List<Integer>> ans){
        if (ans.size()==0){
            return false;
        }
        for (int i = 0; i < ans.size(); i++){
            int a = ans.get(i).get(0);
            int b = ans.get(i).get(1);
            int c = ans.get(i).get(2);
            if (x == a && y == b && z == c){
                return true;
            }
        }
        return false;
    }
}
