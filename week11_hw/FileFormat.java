import java.io.*;
import java.util.*;

public class FileFormat {
  public void display(TextView textView) {
    assert textView != null;
    assert textView.elements() != null;
    textView.elements();
    System.out.print(textView.text());
    for (Element i : textView.elements())
      System.out.print(" " + i.typeName());
    System.out.print("\n");
  }
}
