import java.io.*;
import java.util.*;

public class TextView {
  private String _text;
  private String _name;
  private ArrayList<Element> _elements;

  public String text() { return _text; }
  public String name() { return _name; }
  public ArrayList<Element> elements() { return _elements; }

  public TextView(String name, String text) {
    _name = name;
    _text = text;
    _elements = new ArrayList<Element>();
  }
  public void add(Element element) { _elements.add(element); }
  public void addElement(Element element) { _elements.add(element); }
}
