import java.util.HashMap;
import java.util.Map;
public class hashmap
{
 public static void main(String[] args)
{
 HashMap<Integer,String> h= new HashMap<Integer,String>();
h.put(1,"pen");
h.put(2, "Pencil");
h.put(3, "Notebook");
h.put(4, "Eraser");
System.out.println("Element of HashMap is ");
for(Map.Entry m:h.entrySet())
{
 System.out.println("Key is " +m.getKey()+" Value is " +m.getValue());
 }
System.out.println("Conatins key method apply for hashmap is " +h.containsKey(1));
System.out.println("Conatins Values method apply for hashmap is "
 +h.containsValue("Pen"));
System.out.println("Entry key method apply for hashmap is " +h.entrySet());
System.out.println("get method apply for hashmap is " +h.get(2));
System.out.println("keyset key method apply for hashmap is " +h.keySet());
HashMap<Integer,String> h1= new HashMap<Integer,String>();
h1.putAll(h);
System.out.println("using putall method apply for hashmap1 is " +h1.keySet());
System.out.println("Element of HashMap1 is ");
h1.remove(1);
for(Map.Entry m:h1.entrySet())
{
 System.out.println("Key is " +m.getKey()+" Value is " +m.getValue());
}
h1.remove(1);
System.out.println("values method apply for hashmap1 is " +h1.values());
}
}
