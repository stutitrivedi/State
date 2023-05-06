public class KitkatDispenseHandler extends DispenseHandler {
    public KitkatDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Kitkat dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Kitkat";
    }
}
