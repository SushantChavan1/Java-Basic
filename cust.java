class custec extends RuntimeException{
    public custec(String msg){
        super(msg);
    }
} 

class cust{
    public static void main(String[] args) {
         try{
            throw new custec("This is an Custom exception");
         }
         catch(custec e){
            System.out.println("This is catch block"+e.getMessage());
         }
    }

}
