import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList l1= new ArrayList();
        l1.add("sangali");
        l1.add("kolhapur");
        l1.add("satara");
        l1.add("pune");
        l1.add(11);
        l1.add(12.89);
        l1.add('a');
        System.out.println(l1);
        System.out.println(" Display Arraylist element using iterator ");
        Iterator it= l1.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        System.out.println(" Display Arraylist element using foreach loop"); 
        for(Object s:l1){
            System.out.println(s);
        }
        System.out.println(" Display Arraylist element using forloop");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
}
