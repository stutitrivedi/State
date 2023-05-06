import java.util.List;

public class VendingMachine {
    private StateOfVendingMachine state;
    private SnackDispenseHandler handler;
    private List<Snack> snacks;

    public VendingMachine(List<Snack> snacks) {
        this.state = new IdleState();
        this.handler = new SnackDispenseHandler();
        this.snacks = snacks;
    }

    public void selectSnack(String snackName) {
        Snack snack = findSnack(snackName);
        if (snack != null) {
            state.selectSnack(this, snack);
        } else {
            System.out.println("Invalid snack selection");
        }
    }

    public void insertMoney(double amount) {
        state.insertMoney(this, amount);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.dispense()) {
            System.out.println("Dispensing " + snack.getName());
        } else {
            System.out.println(snack.getName() + " is out of stock quantity reach Zero");
        }
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public SnackDispenseHandler getHandler() {
        return handler;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    private Snack findSnack(String snackName) {
        for (Snack snack : snacks) {
            if (snack.getName().equals(snackName)) {
                return snack;
            }
        }
        return null;
    }
}
