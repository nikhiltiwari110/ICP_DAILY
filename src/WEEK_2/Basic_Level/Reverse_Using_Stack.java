package WEEK_2.Basic_Level;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_Using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String S){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            st.push(S.charAt(i));
        }
        String str = "";
        while(!st.isEmpty()){
            str += st.pop();
        }
        return str;
    }
}
