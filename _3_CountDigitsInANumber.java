import java.util.Scanner;

public class _3_CountDigitsInANumber{
public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
      //input

     System.out.println("Enter a number:");
     int n = Integer.parseInt(scn.nextLine());
        //logic 
        int nod = 0;

        while (n > 0) {
            int q = n/ 10;
            nod++;
            n = q;
            
        }
     
      System.out.println("nod gevien number is;" +nod);
}
}

