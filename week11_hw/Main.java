import java.io.*;
import java.util.*;
import javax.swing.filechooser.FileView;

public class Main {
  public static void main(String[] args) throws IOException {
    try {
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      FileViewer fileViewer = new FileViewer();
      while (br.ready()) {
        String str;
        str = br.readLine();
        String[] tokens = str.split(" ");
        if (tokens[1].equals("add"))
          for (Integer i = 2; i < tokens.length; ++i)
            fileViewer.addElement(tokens[0], tokens[i]);
        else if (tokens[1].equals("display"))
          fileViewer.display(tokens[0]);
        else {
          fileViewer.addTextView(tokens[0], tokens[1]);
        }
      }

    } catch (IOException e) {
      System.out.print("catch(IOException e)");
    }
  }
}