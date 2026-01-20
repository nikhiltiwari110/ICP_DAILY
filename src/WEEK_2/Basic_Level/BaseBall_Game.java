package WEEK_2.Basic_Level;

import java.util.Scanner;
import java.util.Stack;

public class BaseBall_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }
        System.out.println(score(operations));
    }
    public static int score(String [] operations){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            char ch = operations[i].charAt(0);
            if (ch == '+'){
                int x = st.pop();
                int y = st.pop();
                st.push(x);
                st.push(y);
                st.push(x+y);
            } else if (ch == 'D') {
                st.push(st.peek()*2);
            } else if (ch == 'C') {
                st.pop();
            }else {
                int x = Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        int s = 0;
        while (!st.isEmpty()){
            s+=st.pop();
        }
        return s;
    }
}
