public class CheetosDispenseHandler extends DispenseHandler {
    public CheetosDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Cheetos dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Cheetos";
    }
}
