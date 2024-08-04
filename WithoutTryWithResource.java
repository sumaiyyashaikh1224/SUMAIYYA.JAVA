import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
  public class WithoutTryWithResource {
    private static String Pathname;

    public static void main(String[] args) {
        
         
   BufferedReader br = null;
    try  {
        
        br = new BufferedReader(new FileReader(new File(Pathname,"demo.txt")));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
    } catch (FileNotFoundException fnf) {
        System.out.println("File Not Found"+fnf);
        
    }catch(IOException io){
        System.out.println("unable to open a file ...");
    }finally{
        if (br != null){
            {
                try {
                    br.close();
                }catch(IOException io){
                    io.printStackTrace();
                
                }
            }
        }
    }
}

}
   
