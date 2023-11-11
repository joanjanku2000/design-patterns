package behavioral.visitor;

public class VisitorUsage {

  public static void main(String[] args) {
     Visitor visitor = new HTMLFileValidator();

    final HTML4File html4File = new HTML4File("<head>\n" +
        "    <title>Title</title>\n" +
        "</head>","<body>\n" +
        "<p>HTML4 FILE</p>\n" +
        "</body>", visitor);

    final HTML5File html5File = new HTML5File("<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>", "<body>\n" +
        "<p>HTML5 FILE</p>\n" +
        "</body>",  visitor);

    final XHTMLFile xhtmlFile = new XHTMLFile("<head>\n" +
        "    <title>Title</title>\n" +
        "</head>", "<body>\n" +
        "<p>XHTML file</p>\n" +
        "</body>", visitor);

    visitor.validateFile(html4File);
    visitor.validateFile(html5File);
    visitor.validateFile(xhtmlFile);
  }
}