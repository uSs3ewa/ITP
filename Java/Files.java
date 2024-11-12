import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Files {
  public static void main(String[] args) throws IOException {
    File file = new File("/home/stoat/Downloads/captmidn.txt");
    Scanner scan = new Scanner(file);
    String fileContent = "";
    while (scan.hasNextLine()) {
      fileContent = fileContent.concat(scan.nextLine() + "\n");
    }
    // System.out.println(fileContent);
    FileWriter writer = new FileWriter("/home/stoat/Downloads/newfile.txt");
    writer.write(fileContent);
    writer.close();
    scan.close();

    /*
     * available()
     * read(), write()
     * skip(), close()
     */

    try (FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("output.txt")) {
      byte[] buffer = new byte[in.available()];
      // read to buffer from 0 to end
      in.read(buffer, 0, buffer.length);
      out.write(buffer, 0, buffer.length);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
