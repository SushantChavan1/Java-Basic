import java.util.Stack;
import java.io.*;
public class stack{
    public static void main(String[] args){
        Stack<Integer> s= new Stack<Integer>();
        System.out.println(" Initially Capacity of stack is " +s.capacity());
        s.add(11);
        s.add(12);
        s.add(13);
        System.out.println("Valu of Stack");
        for(int a:s){
            System.out.println(a);
        }
        s.add(1,20);
        System.out.println("Value of Stack after add using index");
        for(int a:s){
            System.out.println(a);
        }
        System.out.println("Capacity of stack is " +s.capacity());
        System.out.println("11 value is in stack " +s.contains(11));
        System.out.println("First element of stack is " +s.firstElement());
        System.out.println("Last element of stack is " +s.lastElement());
        System.out.println("using get method element of stack is " +s.get(2));
        s.push(15);
        s.push(16);
        System.out.println("Value of Stack after using push");
        for(int a:s){
            System.out.println(a);
        }
        System.out.println("element of stack is popped " +s.pop());
        System.out.println("peek value from stack " +s.peek());
        System.out.println("15 value in stack " +s.contains(15));
    }
}
