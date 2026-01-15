package WEEK_1.DAY_1;

import java.util.Scanner;

public class Count_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //brute force. check for every number from 2 to n-1
        System.out.println(brute(n));
        System.out.println(optimise(n));
    }
    public static int brute(int n){
        int c = 0;
        for (int i = 2; i < n; i++) {
            if(isprime(i)){
                c++;
            }
        }
        return c;
    }
    public static boolean isprime(int n){
        for (int i = 2; i < n; i++) {
            if (n%2 == 0){
                return false;
            }
        }
        return true;
    }
    public static int optimise(int n){
        int c = 0;
        if(n < 2){
            return 0;
        }
        boolean [] prime = new boolean[n];
        prime[0] = true; //not prime
        prime[1] = true; //not prime
        for(int i = 2; i * i <= n; i++){
            if(prime[i] == false){
                for(int j = 2; i * j < n; j++){
                    prime[i*j] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(prime[i] == false){
                c++;
            }
        }
        return c;
    }
}
