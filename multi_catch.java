class multi_catch {
    public static void main(String args[]) {
        int a[]=new int[3];
        try{
           // a[5]=5/0;
           System.out.println(a[5]);
           int re=5/0;
        }
        catch(ArithmeticException aa){
            System.out.println("The arethmatic Ecxceptiom");
        }
        catch(ArrayIndexOutOfBoundsException ab){
            System.out.println("Array index out of bound");
        }
        
        
    }
}