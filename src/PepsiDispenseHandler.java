public class PepsiDispenseHandler extends DispenseHandler {
    public PepsiDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Pepsi dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Pepsi";
    }
}
