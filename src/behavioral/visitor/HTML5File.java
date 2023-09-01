package behavioral.visitor;

public class HTML5File implements HTMLFile {

  private final String head;
  private final String body;
  private final Visitor visitor;

  public HTML5File(final String head, final String body, final Visitor visitor) {
    this.head = head;
    this.body = body;
    this.visitor = visitor;
  }

  @Override
  public String getDoctypeDeclaration() {
    return "<!DOCTYPE html>";
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