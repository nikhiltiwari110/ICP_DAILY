package WEEK_1.DAY_1;

import java.util.Scanner;

public class Find_the_index_of_First_Occurence_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        //brute force check for every index and compare each character of needle with haystack
//        System.out.println(index(haystack,needle));
        //2nd Approach
        //Check substring of haystack from 0 to k and check if it equals needle or not
        System.out.println(findindex(haystack,needle));
    }
    public static int index(String haystack, String needle){
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
                if (needle.charAt(j)==haystack.charAt(i)){
                    if (j==needle.length()-1){
                        return i-j;
                    }
                    j++;
                }else {
                    j = 0;
                }
        }
        return -1;
    }
    public static int findindex(String haystack,String needle){
        int k = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i,k+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
