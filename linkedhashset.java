import java.util.*;
public class linkedhashset{
public static void main(String[] args)
{
LinkedHashSet<String> l=new LinkedHashSet<String>();
 l.add("Sangali");
 l.add("Satara");
 l.add("kolhapur");

 System.out.println("Element of Linked hash set is ");
 for(String a:l)
 {
 System.out.println(a);
 }
 System.out.println("Element is contain in Linked hash set "
+l.contains("Sangali"));
 Iterator i= l.iterator();
 System.out.println("linked hast set element using iterator");
 while(i.hasNext())
 {
 System.out.println(i.next());
 }
 System.out.println("Element is removed using remove method"+l.remove("Satara"));
 System.out.println("Size of Linked Hash Set is "+l.size());
 l.clear();
 System.out.println("Element of Linked hash set after clear ");
 for(String a:l)
 {
 System.out.println(a);
 }
 LinkedHashSet<String> h1= new LinkedHashSet<String>();
h1=(LinkedHashSet<String>)l.clone();
System.out.println("Element of Linked hash set after clone ");
 for(String a:h1)
 {
 System.out.println(a);
 }
}
}