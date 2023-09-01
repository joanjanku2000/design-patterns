package behavioral.state;

public class UnavailableState implements ParkingTicketVendingMachineState {

  private final ParkingTicketVendingMachine machine;

  public UnavailableState(final ParkingTicketVendingMachine machine) {
    this.machine = machine;
  }

  @Override
  public void moveCreditCardToSensor() {
    machine.setMessage("Vending machine is unavailable");
  }

  @Override
  public void pressPrintingButton() {
    machine.goDown();
    machine.setState(MoneyMachineState.UNAVAILABLE);
  }

  @Override
  public void openMachineAndAddPrintingPaperPieces() {
    machine.setMessage("Vending machine is unavailable");
  }
}