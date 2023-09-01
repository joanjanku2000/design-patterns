package behavioral.visitor;

public class XHTMLFile implements HTMLFile {

  private final String head;
  private final String body;
  private final Visitor visitor;

  public XHTMLFile(final String head, final String body, final Visitor visitor) {
    this.head = head;
    this.body = body;
    this.visitor = visitor;
  }

  @Override
  public String getDoctypeDeclaration() {
    return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
        "<!DOCTYPE html\n" +
        "        PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n" +
        "        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
        "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">";
  }

  @Override
  public String getHead() {
    return head;
  }

  @Override
  public String getBody() {
    return body;
  }

  @Override
  public void accept(final Visitor visitor) {
    visitor.validateFile(this);
  }
}