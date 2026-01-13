package WEEK_1.DAY_1;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// days
        int [] prices = new int[n]; // prices of each day
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int min = prices[0];
        //keep track of min price till day
        int profit = 0;
        //find profit for each day and store maximum profit
        //to find profit for each day .. find difference bw today price and min price till...
        for (int i = 1; i < n; i++) {
            if (min>prices[i]){
                min = prices[i];
            }
            int p = prices[i] - min;
            profit = Math.max(p,profit);
        }
        System.out.println(profit);
    }
}
