public class SnickerDispenseHandler extends DispenseHandler {
    public SnickerDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Snicker dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Snicker";
    }
}
