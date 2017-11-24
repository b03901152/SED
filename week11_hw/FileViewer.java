import java.io.*;
import java.util.*;
import javax.xml.bind.Element;

public class FileViewer {
  private FileFormat _fileFormat;
  private ArrayList<TextView> _textViews = new ArrayList<TextView>();
  public FileViewer() { _fileFormat = new FileFormat(); }
  public void setFileFormat(FileFormat fileFormat) { _fileFormat = fileFormat; }
  public void addTextView(String name, String text) {
    _textViews.add(new TextView(name, text));
  }
  public void addElement(String name, String elementStr) {
    if (elementStr.equals("scrollBar")) {
      for (TextView t : _textViews) {
        if (t.name().equals(name)) {
          t.addElement(new ScrollBar());
          break;
        }
      }
    } else if (elementStr.equals("thickBlackBorder")) {
      for (TextView t : _textViews)
        if (t.name().equals(name)) {
          t.addElement(new ScrollBar());
          break;
        }
    }
  }
  public void display(String name) {
    for (TextView t : _textViews) {
      if (t.name().equals(name)) {
        _fileFormat.display(t);
        return;
      }
    }
    assert false;
  }
}
