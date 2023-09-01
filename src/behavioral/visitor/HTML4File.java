package behavioral.visitor;

public class HTML4File implements HTMLFile {

  private final String head;
  private final String body;
  private final Visitor visitor;

  public HTML4File(final String head, final String body, final Visitor visitor) {
    this.head = head;
    this.body = body;
    this.visitor = visitor;
  }

  @Override
  public String getDoctypeDeclaration() {
    return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n" +
        "        \"http://www.w3.org/TR/html4/loose.dtd\">";
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