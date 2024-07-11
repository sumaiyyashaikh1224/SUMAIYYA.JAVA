public class _4_NestedTryblock {
    public static void main(String[] args) {
        try{
            try{
                int [] n = new int [5];
                System.out.println(n[10]);
            }   catch(ArrayIndexOutOfBoundsException aioobe){
                System.out.println("Inner catch Array index is out of bounds...");
                aioobe.printStackTrace();
            }
            System.out.println(10/0);

        }catch(ArithmeticException ae){
            System.out.println("don t try to 0 as denominator : "+ae);
        }catch(Exception e){
            System.out.println("something error occured..");
        }





                
        }
    }
    
    
