package WEEK_2.Stack_Implementation;

public class Stack {
    private int [] arr;
    private int pointer = 0;

    public Stack(int n){
        arr = new int[n];
    }
    public void push(int x){
        if (pointer == arr.length){
            System.out.println("Stack Overflow !!");
            return;
        }
        arr[pointer] = x;
        pointer++;
    }
    public int size(){
        return pointer;
    }
    public int peek(){
        return arr[pointer-1];
    }
    public int pop(){
        if (pointer == 0){
            System.out.println("Stack underflow");
            return -1;
        }

        return arr[--pointer];
    }
    public boolean isEmpty(){
        if (pointer==0){
            return true;
        }else {
            return false;
        }
    }

}
