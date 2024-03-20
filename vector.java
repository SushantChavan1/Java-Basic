import java.util.Vector;
public class vector{
public static void main(String[] args){
    Vector<String> v= new Vector<String>();
    v.add("aaa");
    v.add("bbb");
    v.add("ccc");
    System.out.println("Value in vector as follow");
    for(String s:v){
        System.out.println(s);
    }
    v.add(0,"zzz");
    System.out.println("Value in vector after add using index 0");
    for(String s:v){
        System.out.println(s);
    }
    System.out.println("aaa value contain in vector "+v.contains("aaa"));
    System.out.println("first value of vector" +v.firstElement());
    System.out.println("last value of vector" +v.lastElement());
    System.out.println("In vector at 2 index value is "+v.get(2));
    System.out.println("In vector at change value at index 2"+v.set(2,"sangola"));
    System.out.println("Vector value aftee set method");
    for(String s:v){
        System.out.println(s);
    }
    System.out.println("aaa value is vector " +v.contains("aaa"));
    Vector<String> v1= new Vector<String>();
    v1=(Vector<String>)v.clone();
    System.out.println("Vector value in Vector v1");
    for(String s:v1){
        System.out.println(s);
    }
    }
}
