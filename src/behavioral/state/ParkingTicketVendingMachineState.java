package behavioral.state;

public interface ParkingTicketVendingMachineState {
  void moveCreditCardToSensor();
  void pressPrintingButton();
  void openMachineAndAddPrintingPaperPieces();
}