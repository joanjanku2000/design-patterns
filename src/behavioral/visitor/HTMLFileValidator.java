package behavioral.visitor;

public class HTMLFileValidator implements Visitor {

  @Override
  public void validateFile(final HTML4File html4File) {
    System.out.println("Validating HTML 4 schema with https://validator.w3.org/#validate_by_uri+with_options");
  }

  @Override
  public void validateFile(final HTML5File html5File) {
    System.out.println("Validating HTML 5 schema with https://validator.w3.org/#validate_by_uri+with_options");
  }

  @Override
  public void validateFile(final XHTMLFile xhtmlFile) {
    System.out.println("Validating XHTML schema with https://validator.w3.org/#validate_by_uri+with_options");
  }
}