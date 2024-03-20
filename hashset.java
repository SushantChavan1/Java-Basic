import java.util.*;
public class hashset{
public static void main(String[] args)
{
HashSet<Integer> h= new HashSet<Integer>();
h.add(11);
h.add(13);
h.add(12);
h.add(11);
 System.out.println("Hashset Element ");
 for(int a:h)
 {
 System.out.println(a);
 }
 System.out.println("11 value is in hashset " +h.contains(11));
 HashSet<Integer> h1= new HashSet<Integer>();

 System.out.println("Is HashSet is empty " +h.isEmpty());
 h1=(HashSet<Integer>)h.clone();
 System.out.println("Hashset Element from hash set h1 ");
 for(int a:h1)
 {
 System.out.println(a);
 }
 Iterator<Integer > i= h.iterator();
 System.out.println("Value from hash set using iterator");
 while(i.hasNext())
 System.out.println(i.next());
 h.remove(12);
 System.out.println("Hashset Element after remove");
 for(int a:h)
 {
 System.out.println(a);
 }

}
}