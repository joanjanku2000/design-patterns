package behavioral.visitor;

public interface Visitor {
  void validateFile(HTML4File html4File);
  void validateFile(HTML5File html5File);
  void validateFile(XHTMLFile xhtmlFile);
}