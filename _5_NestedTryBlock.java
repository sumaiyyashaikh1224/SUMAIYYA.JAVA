public class _5_NestedTryBlock {
  public static void main(String[] args) {
    try{
        String [] data = {"one " ,"null", "three"};
        for (String str : data){
          try{
            System.out.println(str.length());
            System.out.println(str);
          } catch (NullPointerException npe) {
            System.out.println("Inner catch :null pointer exception came..");
          }
        }

    }catch(Exception a){
        System.out.println("Outer catch: General exceptions....");
    }
  }  
    
}
