class Th1 implements Runnable {
    @Override
    
    public void run(){
        for ( int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - Count:"+i);
            try {
                Thread.sleep(2000);
                
            }catch (InterruptedException ie ){
                System.out.println("Unable to executet the thead..");
            }
        }
    }
}
public class RunnableEx1 { 
    public static void main(String[] args) {
        Runnable Th1 = new Th1();
          Thread thread1 = new Thread(Th1);
          thread1.start();
    }
}
