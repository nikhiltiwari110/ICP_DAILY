package WEEK_2.Basic_Level;

import java.util.Scanner;
import java.util.Stack;

public class Delete_Mid_of_a_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements in stack
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
        deleteMid(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void deleteMid(Stack<Integer> s){
        int mid = s.size()/2;
        Stack<Integer> st = new Stack<>();
        //store elements before middle elements in another stack
        for (int i = 0; i < mid; i++) {
            st.push(s.pop());
        }
        s.pop();//remove the middle element;
        while (!st.isEmpty()){
            s.push(st.pop());
        }
    }
}
