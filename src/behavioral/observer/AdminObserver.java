package behavioral.observer;

public class AdminObserver extends BaseObserver {

  private final String adminName;

  public AdminObserver(final ChatChannel chatChannel, final String adminName) {
    super(chatChannel);
    this.adminName = adminName;
    System.out.println(adminName + " joined " + chatChannel.getName() + " as admin.");
  }

  @Override
  public void handleMessage(final String message, final String userType) {
    System.out.println(adminName + " sees " + message + " from user whose type is " + userType);
  }

  @Override
  public String getObserverType() {
    return "ADMIN";
  }
}