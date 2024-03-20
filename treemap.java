import java.util.TreeMap;
import java.util.Map;
public class treemap
{
public static void main(String[] args)
{
 TreeMap<Integer,String> t= new TreeMap<Integer,String>();
 t.put(1,"pen");
 t.put(2, "Pencil");
 t.put(3, "Notebook");
 t.put(4, "Eraser");
System.out.println("Element of TreeMap is ");
for(Map.Entry m:t.entrySet())
 {
 System.out.println("Key is " +m.getKey()+" Value is " +m.getValue());
 }
System.out.println("Conatins key method apply for TreeMap is " +t.containsKey(1));
System.out.println("Conatins Values method apply for TreeMap is "+t.containsValue("Pen"));
System.out.println("Entry key method apply for TreeMap is " +t.entrySet());
System.out.println("get method apply for TreeMap is " +t.get(2));
System.out.println("keyset key method apply for TreeMap is " +t.keySet());
TreeMap<Integer,String> t1= new TreeMap<Integer,String>();
t1.putAll(t);
System.out.println("using putall mettod apply for TreeMap1 is " +t1.keySet());
System.out.println("Element of TreeMap1 is ");
t1.remove(1);
 for(Map.Entry m:t1.entrySet())
{
 System.out.println("Key is " +m.getKey()+" Value is " +m.getValue());
}
t1.remove(1);
System.out.println("values method apply for TreeMap1 is " +t1.values());
//t1.clear();
TreeMap <Integer,String> t2= new TreeMap<Integer,String>();
t2=(TreeMap<Integer, String>)t1.clone();
System.out.println("Element of TreeMap2 is ");
for(Map.Entry m:t2.entrySet())
 {
 System.out.println("Key is " +m.getKey()+" Value is " +m.getValue());
}
}
}