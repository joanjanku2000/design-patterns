package behavioral.state;

public class StillNeedToPayState implements ParkingTicketVendingMachineState {

  private final ParkingTicketVendingMachine machine;

  public StillNeedToPayState(final ParkingTicketVendingMachine machine) {
    this.machine = machine;
  }

  @Override
  public void moveCreditCardToSensor() {
    machine.payForOneHourWithCreditCard();
    if (machine.getState() == MoneyMachineState.NEED_PAYMENT) {
      machine.setState(MoneyMachineState.PAID_READY_TO_PRINT);
    }
  }

  @Override
  public void pressPrintingButton() {
    machine.setMessage("You to pay first");
  }

  @Override
  public void openMachineAndAddPrintingPaperPieces() {
    machine.setMessage("Only authorized personel can add paper");
  }
}