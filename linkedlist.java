import java.io.*;
import java.util.*;
public class linkedlist{
    public static void main(String[] args){
        LinkedList<Integer> al=new LinkedList<Integer>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        System.out.println("Linked List Element using foreach loop");
        for(Object s:al)
            System.out.println(s);
        System.out.println("Linked List Element using iterable");
        Iterator<Integer> i= al.iterator();
        while(i.hasNext() ){
            System.out.println(i.next());
        }
        System.out.println("Linked List Element using for loop");
        for(int j=0;j<al.size();j++ ){
            System.out.println(al.get(j));
        }
        System.out.println(" First Element of linked list is " +al.getFirst() );
        System.out.println(" Last Element of linked list is " +al.getLast());
        al.addFirst(10);
        al.addLast(15);
        al.set(5, 20);
        System.out.println("Linked List Element after add first and add last");
        for(Object s:al)
            System.out.println(s);
        al.remove();
        al.remove(3);
        al.removeLast();
        System.out.println("Linked List Element after remove");
        for(Object s:al)
            System.out.println(s);
        al.clear();
        System.out.println("Linked List Element after clear");
        for(Object s:al)
        System.out.println(s);
    }
}