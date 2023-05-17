import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileEx {
   public static void main(String[] args) throws IOException {
       try(BufferedReader br = Files.newBufferedReader(
               Paths.get("hospital_info_0920.csv"), StandardCharsets.UTF_8)){

           String line;
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}

