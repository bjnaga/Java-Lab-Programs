// write a program  which uses file input stream and file output stream.
import java.io.*;

public class ByteStream {


        public static void main(String[] args) throws IOException, FileNotFoundException {

            File newFile = new File("test.txt");
            FileOutputStream outputStream = new FileOutputStream(newFile);
            outputStream.write("Hi from BCA A ".getBytes());
            File newFile2 =new File("test.txt");
            FileInputStream fileInputStream= new FileInputStream(newFile2);
            String str= new String(fileInputStream.readAllBytes());
            System.out.println(str);
        }

}
