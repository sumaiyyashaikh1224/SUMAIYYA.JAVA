
import java.util.Scanner;
class Test extends Thread{

    Scanner scn = new Scanner(System.in);

    @Override
    Public void run(){
        System.out.println("current thread:"+Thread.currentThread().getName());

    
        System.out.print("Enter you n value :");
        for (int i = 1; i <= n;  i++){
            System.out.print(i+"");
        }
    }

}
public class ThreadCreationUsingNewOperator {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Test();
        Thread t2 = new Test();
        t1.setName("bhago");
        t2.start();
    }
    
}
