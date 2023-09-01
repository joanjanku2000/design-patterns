package behavioral.mediator;

public class MediatorUsage {
  public static void main(String[] args) {
    final ActionAppliedMessage actionAppliedMessage = new ActionAppliedMessage();
    final SelectOptions selectOptions = new SelectOptions();
    final WarningMessage warningMessage = new WarningMessage();

    final Mediator mediator = new UserActionMediator(actionAppliedMessage, selectOptions, warningMessage);

    selectOptions.sendRequest("load");
    selectOptions.sendRequest("save");
    selectOptions.sendRequest("restart");
    warningMessage.sendRequest("hide");
  }
}

/* Sample output
11:14:29.401 [main] INFO pl.sdacademy.mediator.SelectOptions - Loading previous data
11:14:29.403 [main] INFO pl.sdacademy.mediator.ActionAppliedMessage - Action was applied successfully
11:14:29.403 [main] INFO pl.sdacademy.mediator.SelectOptions - Status was saved
11:14:29.403 [main] INFO pl.sdacademy.mediator.ActionAppliedMessage - Action was applied successfully
11:14:29.403 [main] INFO pl.sdacademy.mediator.SelectOptions - Status is restarting
11:14:29.403 [main] WARN pl.sdacademy.mediator.WarningMessage - Are you sure?
11:14:29.403 [main] WARN pl.sdacademy.mediator.WarningMessage - Are you sure?
*/