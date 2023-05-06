public class WaitingForMoneyState implements StateOfVendingMachine {
    private Snack snack;

    public WaitingForMoneyState(Snack snack) {
        this.snack = snack;
    }

    @Override
    public void selectSnack(VendingMachine vendingMachine, Snack snack) {
        System.out.println(" Please insert money for " + this.snack.getName());


    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {
        System.out.println(" inserted money = " + amount);

        if (amount >= this.snack.getPrice()) {
            if (this.snack.getQuantity() > 0){

                vendingMachine.dispenseSnack(this.snack);
                //System.out.println("Dispense" + this.snack);
                this.snack.setQuantity(this.snack.getQuantity() - 1);
        //   vendingMachine.setState(new IdleState());
        } else {
            System.out.println(this.snack.getName() + " is out of stock");
            vendingMachine.setState(new IdleState());
        }
    }  else {
        System.out.println(" Please insert appropreate money for " + this.snack.getName());
        }
}}
