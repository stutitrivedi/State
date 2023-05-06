public class IdleState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine vendingMachine, Snack snack) {
        System.out.println(" Initial IdleState, ready to go, please insert money " );
        vendingMachine.setState(new WaitingForMoneyState(snack));
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {
        System.out.println("IdleState, No snack selected");
    }
}
