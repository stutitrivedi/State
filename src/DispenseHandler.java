public abstract class DispenseHandler {
    private DispenseHandler nextHandler;

    public DispenseHandler(DispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void dispense(Snack snack) {
        if (snack.getName().equals(getSnackName())) {
            System.out.println("Dispensing " + snack.getName() + " from " + getHandlerName());
        } else if (nextHandler != null) {
            nextHandler.dispense(snack);
        } else {
            System.out.println("Invalid snack selection");
        }
    }

    protected abstract String getHandlerName();

    protected abstract String getSnackName();
}
