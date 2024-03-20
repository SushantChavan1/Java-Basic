class custException extends RuntimeException{
    public String  tostr(){
        return "this is custom Exception";
    }
}

public class customexc {
    public static int divide(){
        int a=30,b=0;
        
        return a/b;
    }
    public static void main(String args[]){
        try{
            int r=divide();
            System.err.println(r);
            throw new custException();
        }
        catch(custException e){
            System.err.println("exception occures");
        }
    }
}