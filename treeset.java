import java.util.*;
public class treeset {
public static void main(String[] args)
{
 TreeSet<Integer> t= new TreeSet<Integer>();

 t.add(11);
 t.add(12);
 t.add(13);
 t.add(14);
 System.out.println("TreeSet Element using foreach loop");
 for(Object s:t)
 System.out.println(s);
 System.out.println("TreeSet Element using iterable");
 Iterator<Integer> i= t.iterator();
 while(i.hasNext() )
 {
 System.out.println(i.next());
 }
 t.remove(3);
 System.out.println("TreeSet Element after remove");
 for(Object s:t)
 System.out.println(s);
System.out.println("11 value is present in treeset " +t.contains(11));
 t.clear();
 System.out.println("TreeSet Element after clear");
 for(Object s:t)
 System.out.println(s);
}
}