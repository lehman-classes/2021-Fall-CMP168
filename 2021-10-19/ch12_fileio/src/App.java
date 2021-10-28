import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class App {
  public static void main(String[] args) throws Exception {

    // some type of pointer (identifier)... or some kind of way to get to a physical
    // file
    File file = new File("a");
    // File dir = new File("bin");

    FileWriter writer = new FileWriter(file);

    // image data writer
    // FileOutputStream os = new FileOutputStream("x");

    //
    // FileInputStream is = new FileInputStream(file);
    // FileReader fr = new FileReader(file);

    // file variable as a reference identifier
    // pathname as a name of the physical file we are working with

    // the File API allow us to deal directly with the physical file
    // permittions, create, delete, rename and list - CRUD - Create, Read, Update,
    // Delete

    boolean created = file.createNewFile();

    // boolean dirCreated = dir.mkdir();

    // writing to a file

    // data from an unknown source with possibly lots and lots of data
    for (int i = 0; i < 2; i++) {
      writer.write("hello there\n");
    }
    writer.close();

    // read a file
    FileReader fr = new FileReader(file);
    int in = fr.read();
    while (in != -1) {
      long skipped = fr.skip(1);
      System.out.println((char) in);
      in = fr.read();
    }

    // System.out.println(skipped);

    // h e l l o
    // ^
    // fr.close();

    // first byte
    // int in = is.read();

    // while (in != -1) {
    // System.out.print((char) in);
    // in = is.read();
    // }
    // is.close();

    // System.out.println("file: " + file.isFile());
    // System.out.println("dir: " + dir.isDirectory());
    // System.out.println("file created: " + created);
    // System.out.println("dir created: " + dirCreated);

    // System.out.println(file.getAbsolutePath());
    // System.out.println(file.getCanonicalPath());

    // System.out.println(dir.list()[0]);

    // writer.close();
  }
}
