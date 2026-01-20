package WEEK_2.Basic_Level;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_outermost_parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(remove(s));
    }
    public static String remove(String s){
        HashSet<Integer> set = new HashSet<>();
        int o = 0;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                o++;
            }else{
                c++;
            }
            if(o == c){
                set.add(i);
                set.add(i-(o+c)+1);
                o = 0;
                c = 0;
            }
        }
        String str = "";
        for(int i = 0;i < s.length(); i++){
            if(!set.contains(i)){
                str+=s.charAt(i);
            }
        }
        return str;
    }

}
