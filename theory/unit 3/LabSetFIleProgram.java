import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;  

public class Main {
  public static void main(String[] args) {
    //Reading Part
    String text = "Hello World!";
    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
      output.write(text.getBytes());  
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
      e.printStackTrace();
    }
    //Writing Part
    try (FileInputStream input = new FileInputStream("filename.txt")) {
      int i;  
      while ((i = input.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      System.out.println("Error reading file.");
    }
  }
}
    

