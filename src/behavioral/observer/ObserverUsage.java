package behavioral.observer;

public class ObserverUsage {

  public static void main(String[] args) {
    final ChatChannel chatChannel = new ChatChannel("design-patterns");

    final BaseObserver userA = new UserObserver(chatChannel, "andrew");
    final BaseObserver userB = new UserObserver(chatChannel, "ala");
    final BaseObserver adminA = new AdminObserver(chatChannel, "john");
    final BaseObserver adminB = new AdminObserver(chatChannel, "ann");

    userA.sendMessage("Hello all");
    userB.sendMessage("Hi Andrew");
    adminA.sendMessage("ann they can't see what we write");
    adminB.sendMessage("Yes I know");

    /* output of the program:
      andrew is joining the design-patterns
      ala is joining the design-patterns
      john joined design-patterns as admin.
      ann joined design-patterns as admin.
      andrew sees message Hello all
      ala sees message Hello all
      john sees Hello all from user whose type is USER
      ann sees Hello all from user whose type is USER
      andrew sees message Hi Andrew
      ala sees message Hi Andrew
      john sees Hi Andrew from user whose type is USER
      ann sees Hi Andrew from user whose type is USER
      john sees ann they can't see what we write from user whose type is ADMIN
      ann sees ann they can't see what we write from user whose type is ADMIN
      john sees Yes I know from user whose type is ADMIN
      ann sees Yes I know from user whose type is ADMIN
     */
  }
}