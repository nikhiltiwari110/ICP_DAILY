package WEEK_2.Basic_Level;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isit(s));
    }

    public static boolean isit(String s){
        if (s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() || ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')' && st.peek()=='(') {
                st.pop();
            } else if (ch == ']' && st.peek() == '[') {
                st.pop();
            } else if (ch == '}' && st.peek() == '{') {
                st.pop();
            }else {
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
